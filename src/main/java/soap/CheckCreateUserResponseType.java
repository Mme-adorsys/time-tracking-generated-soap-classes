/**
 * CheckCreateUserResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class CheckCreateUserResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CheckCreateUserResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CheckCreateUserResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wirdLizenzVerletzt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wirdLizenzVerletzt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anzahlLizenzen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anzahlLizenzen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freieLizenzen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freieLizenzen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private ResponseHeaderType responseHeader;
    private boolean wirdLizenzVerletzt;
    private Integer anzahlLizenzen;
    private Integer freieLizenzen;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CheckCreateUserResponseType() {
    }


    public CheckCreateUserResponseType(
            ResponseHeaderType responseHeader,
            boolean wirdLizenzVerletzt,
            Integer anzahlLizenzen,
            Integer freieLizenzen) {
        this.responseHeader = responseHeader;
        this.wirdLizenzVerletzt = wirdLizenzVerletzt;
        this.anzahlLizenzen = anzahlLizenzen;
        this.freieLizenzen = freieLizenzen;
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
     * Gets the responseHeader value for this CheckCreateUserResponseType.
     *
     * @return responseHeader
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this CheckCreateUserResponseType.
     *
     * @param responseHeader
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the wirdLizenzVerletzt value for this CheckCreateUserResponseType.
     *
     * @return wirdLizenzVerletzt
     */
    public boolean isWirdLizenzVerletzt() {
        return wirdLizenzVerletzt;
    }

    /**
     * Sets the wirdLizenzVerletzt value for this CheckCreateUserResponseType.
     *
     * @param wirdLizenzVerletzt
     */
    public void setWirdLizenzVerletzt(boolean wirdLizenzVerletzt) {
        this.wirdLizenzVerletzt = wirdLizenzVerletzt;
    }

    /**
     * Gets the anzahlLizenzen value for this CheckCreateUserResponseType.
     *
     * @return anzahlLizenzen
     */
    public Integer getAnzahlLizenzen() {
        return anzahlLizenzen;
    }

    /**
     * Sets the anzahlLizenzen value for this CheckCreateUserResponseType.
     *
     * @param anzahlLizenzen
     */
    public void setAnzahlLizenzen(Integer anzahlLizenzen) {
        this.anzahlLizenzen = anzahlLizenzen;
    }

    /**
     * Gets the freieLizenzen value for this CheckCreateUserResponseType.
     *
     * @return freieLizenzen
     */
    public Integer getFreieLizenzen() {
        return freieLizenzen;
    }

    /**
     * Sets the freieLizenzen value for this CheckCreateUserResponseType.
     *
     * @param freieLizenzen
     */
    public void setFreieLizenzen(Integer freieLizenzen) {
        this.freieLizenzen = freieLizenzen;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckCreateUserResponseType)) return false;
        CheckCreateUserResponseType other = (CheckCreateUserResponseType) obj;
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
                this.wirdLizenzVerletzt == other.isWirdLizenzVerletzt() &&
                ((this.anzahlLizenzen == null && other.getAnzahlLizenzen() == null) ||
                        (this.anzahlLizenzen != null &&
                                this.anzahlLizenzen.equals(other.getAnzahlLizenzen()))) &&
                ((this.freieLizenzen == null && other.getFreieLizenzen() == null) ||
                        (this.freieLizenzen != null &&
                                this.freieLizenzen.equals(other.getFreieLizenzen())));
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
        _hashCode += (isWirdLizenzVerletzt() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAnzahlLizenzen() != null) {
            _hashCode += getAnzahlLizenzen().hashCode();
        }
        if (getFreieLizenzen() != null) {
            _hashCode += getFreieLizenzen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
