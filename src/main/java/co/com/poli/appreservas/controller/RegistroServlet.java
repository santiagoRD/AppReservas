/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.controller;

import co.com.poli.appreservas.business.implementation.HabitacionBusImpl;
import co.com.poli.appreservas.model.habitacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SANTIAGO
 */
public class RegistroServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        HabitacionBusImpl habitacionBusImpl = new HabitacionBusImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "habitacion":
                String idhab = request.getParameter("txtidhab");
                String tipohab = request.getParameter("txttipohab");
                if (tipohab.equals("Compartida")) {
                    int numcam = Integer.parseInt(request.getParameter("txtnumcam"));
                    if (numcam > 8 || numcam < 4) {
                        String msj = "Numero de camas erroneo";
                        session.setAttribute("MENSAJE", msj);
                        rd = request.getRequestDispatcher("/mensaje.jsp");
                    } else {
                        String bañopriv = request.getParameter("txtbañopriv");
                        habitacion hab = new habitacion(idhab, tipohab, numcam, bañopriv);
                        String msj = habitacionBusImpl.crearHabitacion(hab);
                        session.setAttribute("MENSAJE", msj);
                        rd = request.getRequestDispatcher("/mensaje.jsp");
                    }
                } else {
                    int numcam = Integer.parseInt(request.getParameter("txtnumcam"));
                    if (numcam != 4 ) {
                        String msj = "Numero de camas erroneo";
                        session.setAttribute("MENSAJE", msj);
                        rd = request.getRequestDispatcher("/mensaje.jsp");
                    } else {
                        String bañopriv = request.getParameter("txtbañopriv");
                        habitacion hab = new habitacion(idhab, tipohab, numcam, bañopriv);
                        String msj = habitacionBusImpl.crearHabitacion(hab);
                        session.setAttribute("MENSAJE", msj);
                        rd = request.getRequestDispatcher("/mensaje.jsp");
                    }
                }

                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
