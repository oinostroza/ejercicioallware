/**
 * ContratoSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Contrato;

public class ContratoSOAPSkeleton implements org.example.www.Contrato.Contrato_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.Contrato.Contrato_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("listarTodo", _params, new javax.xml.namespace.QName("", "listarTodo"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/Contrato/", "listarTodoResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/Contrato/", "listarTodo"));
        _oper.setSoapAction("http://www.example.org/Contrato/listarTodo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("listarTodo") == null) {
            _myOperations.put("listarTodo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("listarTodo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listarPorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/Contrato/", "listarPorIDRequest"), org.example.www.Contrato.ListarPorIDRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("listarPorID", _params, new javax.xml.namespace.QName("", "listarPorID"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/Contrato/", "listarPorIDResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/Contrato/", "listarPorID"));
        _oper.setSoapAction("http://www.example.org/Contrato/listarPorID");
        _myOperationsList.add(_oper);
        if (_myOperations.get("listarPorID") == null) {
            _myOperations.put("listarPorID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("listarPorID")).add(_oper);
    }

    public ContratoSOAPSkeleton() {
        this.impl = new org.example.www.Contrato.ContratoSOAPImpl();
    }

    public ContratoSOAPSkeleton(org.example.www.Contrato.Contrato_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.Contrato.ListaType[] listarTodo() throws java.rmi.RemoteException
    {
        org.example.www.Contrato.ListaType[] ret = impl.listarTodo();
        return ret;
    }

    public org.example.www.Contrato.ListarPorIDResponse listarPorID(org.example.www.Contrato.ListarPorIDRequest listarPorID) throws java.rmi.RemoteException
    {
        org.example.www.Contrato.ListarPorIDResponse ret = impl.listarPorID(listarPorID);
        return ret;
    }

}
