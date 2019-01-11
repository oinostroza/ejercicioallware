/**
 * Contrato_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Contrato;

public interface Contrato_PortType extends java.rmi.Remote {
    public org.example.www.Contrato.ListaType[] listarTodo() throws java.rmi.RemoteException;
    public org.example.www.Contrato.ListarPorIDResponse listarPorID(org.example.www.Contrato.ListarPorIDRequest listarPorID) throws java.rmi.RemoteException;
}
