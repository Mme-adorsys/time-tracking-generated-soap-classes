/**
 * ReadEinstellungenResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadEinstellungenResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadEinstellungenResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadEinstellungenResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektzeitUndBelege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektzeitUndBelege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitUndBelegeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    private ProjektzeitUndBelegeType projektzeitUndBelege;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadEinstellungenResponseType() {
    }


    public ReadEinstellungenResponseType(
            ResponseHeaderType responseHeader,
            ProjektzeitUndBelegeType projektzeitUndBelege) {
        this.responseHeader = responseHeader;
        this.projektzeitUndBelege = projektzeitUndBelege;
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
     * Gets the responseHeader value for this ReadEinstellungenResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadEinstellungenResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the projektzeitUndBelege value for this ReadEinstellungenResponseType.
     *
     * @return projektzeitUndBelege
     */
    public ProjektzeitUndBelegeType getProjektzeitUndBelege() {
        return projektzeitUndBelege;
    }

    /**
     * Sets the projektzeitUndBelege value for this ReadEinstellungenResponseType.
     *
     * @param projektzeitUndBelege
     */
    public void setProjektzeitUndBelege(ProjektzeitUndBelegeType projektzeitUndBelege) {
        this.projektzeitUndBelege = projektzeitUndBelege;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadEinstellungenResponseType)) return false;
        ReadEinstellungenResponseType other = (ReadEinstellungenResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.projektzeitUndBelege == null && other.getProjektzeitUndBelege() == null) ||
                        (this.projektzeitUndBelege != null &&
                                this.projektzeitUndBelege.equals(other.getProjektzeitUndBelege())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getProjektzeitUndBelege() != null) {
            _hashCode += getProjektzeitUndBelege().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
