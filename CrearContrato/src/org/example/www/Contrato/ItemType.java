/**
 * ItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Contrato;

public class ItemType  implements java.io.Serializable {
    private int codigo_cancion;

    private java.lang.String nombre_cancion;

    public ItemType() {
    }

    public ItemType(
           int codigo_cancion,
           java.lang.String nombre_cancion) {
           this.codigo_cancion = codigo_cancion;
           this.nombre_cancion = nombre_cancion;
    }


    /**
     * Gets the codigo_cancion value for this ItemType.
     * 
     * @return codigo_cancion
     */
    public int getCodigo_cancion() {
        return codigo_cancion;
    }


    /**
     * Sets the codigo_cancion value for this ItemType.
     * 
     * @param codigo_cancion
     */
    public void setCodigo_cancion(int codigo_cancion) {
        this.codigo_cancion = codigo_cancion;
    }


    /**
     * Gets the nombre_cancion value for this ItemType.
     * 
     * @return nombre_cancion
     */
    public java.lang.String getNombre_cancion() {
        return nombre_cancion;
    }


    /**
     * Sets the nombre_cancion value for this ItemType.
     * 
     * @param nombre_cancion
     */
    public void setNombre_cancion(java.lang.String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemType)) return false;
        ItemType other = (ItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigo_cancion == other.getCodigo_cancion() &&
            ((this.nombre_cancion==null && other.getNombre_cancion()==null) || 
             (this.nombre_cancion!=null &&
              this.nombre_cancion.equals(other.getNombre_cancion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodigo_cancion();
        if (getNombre_cancion() != null) {
            _hashCode += getNombre_cancion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/Contrato/", "itemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_cancion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_cancion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_cancion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre_cancion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
