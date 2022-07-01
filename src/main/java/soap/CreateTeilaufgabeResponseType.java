/**
 * CreateTeilaufgabeResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Antwort-Objekt der Anlage der Teilaufgabe.
 */
public class CreateTeilaufgabeResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateTeilaufgabeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateTeilaufgabeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    private Integer ticketNr;
    private String teilaufgabeNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateTeilaufgabeResponseType() {
    }


    public CreateTeilaufgabeResponseType(
            ResponseHeaderType responseHeader,
            Integer ticketNr,
            String teilaufgabeNr) {
        this.responseHeader = responseHeader;
        this.ticketNr = ticketNr;
        this.teilaufgabeNr = teilaufgabeNr;
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
     * Gets the responseHeader value for this CreateTeilaufgabeResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this CreateTeilaufgabeResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the ticketNr value for this CreateTeilaufgabeResponseType.
     *
     * @return ticketNr
     */
    public Integer getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this CreateTeilaufgabeResponseType.
     *
     * @param ticketNr
     */
    public void setTicketNr(Integer ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the teilaufgabeNr value for this CreateTeilaufgabeResponseType.
     *
     * @return teilaufgabeNr
     */
    public String getTeilaufgabeNr() {
        return teilaufgabeNr;
    }

    /**
     * Sets the teilaufgabeNr value for this CreateTeilaufgabeResponseType.
     *
     * @param teilaufgabeNr
     */
    public void setTeilaufgabeNr(String teilaufgabeNr) {
        this.teilaufgabeNr = teilaufgabeNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateTeilaufgabeResponseType)) return false;
        CreateTeilaufgabeResponseType other = (CreateTeilaufgabeResponseType) obj;
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
                ((this.ticketNr == null && other.getTicketNr() == null) ||
                        (this.ticketNr != null &&
                                this.ticketNr.equals(other.getTicketNr()))) &&
                ((this.teilaufgabeNr == null && other.getTeilaufgabeNr() == null) ||
                        (this.teilaufgabeNr != null &&
                                this.teilaufgabeNr.equals(other.getTeilaufgabeNr())));
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
        if (getTicketNr() != null) {
            _hashCode += getTicketNr().hashCode();
        }
        if (getTeilaufgabeNr() != null) {
            _hashCode += getTeilaufgabeNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
