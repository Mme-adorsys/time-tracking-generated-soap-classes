/**
 * ReadTicketHistoryResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Antwort-Typ der Ticket-Historien-Abfrage.
 */
public class ReadTicketHistoryResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTicketHistoryResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketHistoryResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketHistoryType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "history"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der Historieneinträge. */
    private TicketHistoryType[] historyListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTicketHistoryResponseType() {
    }


    public ReadTicketHistoryResponseType(
            ResponseHeaderType responseHeader,
            TicketHistoryType[] historyListe) {
        this.responseHeader = responseHeader;
        this.historyListe = historyListe;
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
     * Gets the responseHeader value for this ReadTicketHistoryResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadTicketHistoryResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the historyListe value for this ReadTicketHistoryResponseType.
     *
     * @return historyListe   * Die Liste der Historieneinträge.
     */
    public TicketHistoryType[] getHistoryListe() {
        return historyListe;
    }

    /**
     * Sets the historyListe value for this ReadTicketHistoryResponseType.
     *
     * @param historyListe   * Die Liste der Historieneinträge.
     */
    public void setHistoryListe(TicketHistoryType[] historyListe) {
        this.historyListe = historyListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTicketHistoryResponseType)) return false;
        ReadTicketHistoryResponseType other = (ReadTicketHistoryResponseType) obj;
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
                ((this.historyListe == null && other.getHistoryListe() == null) ||
                        (this.historyListe != null &&
                                java.util.Arrays.equals(this.historyListe, other.getHistoryListe())));
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
        if (getHistoryListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getHistoryListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHistoryListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
