package payslip;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/process")
public class AppServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASS = "Aman@2023";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	try {
			getClass().forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String action = request.getParameter("action");
        
        switch (action) {
            case "addPermanent":
                addPermanentEmployee(request, response);
                break;
            case "addTemporary":
                addTemporaryEmployee(request, response);
                break;
            case "generatePaySlip":
                generatePaySlip(request, response);
                break;
            case "updatePaySlip":
                updatePaySlip(request, response);
                break;
            default:
                response.sendRedirect("index.jsp");
                break;
        }
    }

    private void addPermanentEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name").toUpperCase();
        double salary = Double.parseDouble(request.getParameter("salary"));
        double deduction = Double.parseDouble(request.getParameter("deduction"));
        double bonus = Double.parseDouble(request.getParameter("bonus"));
        
        try (Connection c = DriverManager.getConnection(DB_URL, USER, PASS); Statement s = c.createStatement()) {
            String sql = "INSERT INTO PAYSLIP.PAYSLIP (ID, NAME, WORKING_DAYS, DAILYWAGES, DEDUCTION, BONUS, TYPE, SALARY) VALUES (" +
                    id + ", '" + name + "', 0, 0, " + deduction + ", " + bonus + ", 'P', " + salary + ")";
            s.executeUpdate(sql);
            request.setAttribute("message", "Permanent Employee added successfully.");
        } catch (SQLException e) {
            request.setAttribute("message", "Error: " + e.getMessage());
        }
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private void addTemporaryEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name").toUpperCase();
        int workingDays = Integer.parseInt(request.getParameter("workingDays"));
        double dailyWage = Double.parseDouble(request.getParameter("dailyWage"));
        double deduction = Double.parseDouble(request.getParameter("deduction"));
        double bonus = Double.parseDouble(request.getParameter("bonus"));
        double salary = workingDays * dailyWage;
        
        try (Connection c = DriverManager.getConnection(DB_URL, USER, PASS); Statement s = c.createStatement()) {
            String sql = "INSERT INTO PAYSLIP.PAYSLIP (ID, NAME, WORKING_DAYS, DAILYWAGES, DEDUCTION, BONUS, TYPE, SALARY) VALUES (" +
                    id + ", '" + name + "', " + workingDays + ", " + dailyWage + ", " + deduction + ", " + bonus + ", 'T', " + salary + ")";
            s.executeUpdate(sql);
            request.setAttribute("message", "Temporary Employee added successfully.");
        } catch (SQLException e) {
            request.setAttribute("message", "Error: " + e.getMessage());
        }
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private void generatePaySlip(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String type = request.getParameter("type");
        
        try (Connection c = DriverManager.getConnection(DB_URL, USER, PASS); Statement s = c.createStatement()) {
            String sql = "SELECT * FROM PAYSLIP.PAYSLIP WHERE ID = " + id + " AND TYPE = '" + type + "'";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String[] data = {
                        Integer.toString(r.getInt("ID")),
                        r.getString("NAME"),
                        (r.getInt("WORKING_DAYS") > 0) ? Integer.toString(r.getInt("WORKING_DAYS")) : "NIL",
//                        Integer.toString((r.getInt("WORKING_DAYS") > 0) ? r.getInt("WORKING_DAYS") : -1),
//                        Double.toString(r.getDouble("DAILYWAGES")),
                        (r.getDouble("DAILYWAGES") > 0) ? Double.toString(r.getDouble("DAILYWAGES")) : "NIL",
                        Double.toString(r.getDouble("DEDUCTION")),
                        Double.toString(r.getDouble("BONUS")),
                        r.getString("TYPE"),
                        Double.toString(r.getDouble("SALARY")),
                        Double.toString(r.getDouble("SALARY") - r.getDouble("DEDUCTION") + r.getDouble("BONUS"))
                };
                request.setAttribute("data", data);
            } else {
                request.setAttribute("message", "Employee not found.");
            }
        } catch (SQLException e) {
            request.setAttribute("message", "Error: " + e.getMessage());
        }
        request.getRequestDispatcher("displayPaySlip.jsp").forward(request, response);
    }

    private void updatePaySlip(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String field = request.getParameter("field").toUpperCase();
        String newValue = request.getParameter("newValue");
        
        try (Connection c = DriverManager.getConnection(DB_URL, USER, PASS); Statement s = c.createStatement()) {
            if (field.equals("NAME") || field.equals("TYPE")) {
                newValue = "'" + newValue.toUpperCase() + "'";
            }
            String sql = "UPDATE PAYSLIP.PAYSLIP SET " + field + " = " + newValue + " WHERE ID = " + id;
//            s.executeUpdate(sql);
            if(s.executeUpdate(sql) > 0) {
            	request.setAttribute("message", "Employee updated successfully.");
            }
            else {
            	request.setAttribute("message", "Employee not found.");
            }
        } catch (SQLException e) {
            request.setAttribute("message", "Error: " + e.getMessage());
        }
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
