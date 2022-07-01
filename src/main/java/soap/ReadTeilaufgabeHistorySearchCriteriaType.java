/**
 * ReadTeilaufgabeHistorySearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadTeilaufgabeHistorySearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTeilaufgabeHistorySearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeHistorySearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    /* Die Nummer des Tickets, zu der die Teilaufgabe gehört. */
    private int ticketNr;
    /* Die Nummer der Teilaufgabe. */
    private String teilaufgabeNr;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTeilaufgabeHistorySearchCriteriaType() {
    }


    public ReadTeilaufgabeHistorySearchCriteriaType(
            int ticketNr,
            String teilaufgabeNr) {
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
     * Gets the ticketNr value for this ReadTeilaufgabeHistorySearchCriteriaType.
     *
     * @return ticketNr   * Die Nummer des Tickets, zu der die Teilaufgabe gehört.
     */
    public int getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this ReadTeilaufgabeHistorySearchCriteriaType.
     *
     * @param ticketNr   * Die Nummer des Tickets, zu der die Teilaufgabe gehört.
     */
    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the teilaufgabeNr value for this ReadTeilaufgabeHistorySearchCriteriaType.
     *
     * @return teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public String getTeilaufgabeNr() {
        return teilaufgabeNr;
    }

    /**
     * Sets the teilaufgabeNr value for this ReadTeilaufgabeHistorySearchCriteriaType.
     *
     * @param teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public void setTeilaufgabeNr(String teilaufgabeNr) {
        this.teilaufgabeNr = teilaufgabeNr;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTeilaufgabeHistorySearchCriteriaType)) return false;
        ReadTeilaufgabeHistorySearchCriteriaType other = (ReadTeilaufgabeHistorySearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.ticketNr == other.getTicketNr() &&
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
        _hashCode += getTicketNr();
        if (getTeilaufgabeNr() != null) {
            _hashCode += getTeilaufgabeNr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
