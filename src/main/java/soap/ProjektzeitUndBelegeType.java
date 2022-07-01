/**
 * ProjektzeitUndBelegeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ProjektzeitUndBelegeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProjektzeitUndBelegeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitUndBelegeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutenraster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutenraster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer minutenraster;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public ProjektzeitUndBelegeType() {
    }

    public ProjektzeitUndBelegeType(
            Integer minutenraster) {
        this.minutenraster = minutenraster;
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
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the minutenraster value for this ProjektzeitUndBelegeType.
     *
     * @return minutenraster
     */
    public Integer getMinutenraster() {
        return minutenraster;
    }

    /**
     * Sets the minutenraster value for this ProjektzeitUndBelegeType.
     *
     * @param minutenraster
     */
    public void setMinutenraster(Integer minutenraster) {
        this.minutenraster = minutenraster;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjektzeitUndBelegeType)) return false;
        ProjektzeitUndBelegeType other = (ProjektzeitUndBelegeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.minutenraster == null && other.getMinutenraster() == null) ||
                        (this.minutenraster != null &&
                                this.minutenraster.equals(other.getMinutenraster())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMinutenraster() != null) {
            _hashCode += getMinutenraster().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
