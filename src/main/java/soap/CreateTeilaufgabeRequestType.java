/**
 * CreateTeilaufgabeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Request-Objekt zur Anlage einer Teilaufgabe.
 */
public class CreateTeilaufgabeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateTeilaufgabeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateTeilaufgabeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TeilaufgabeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten der Teilaufgabe. */
    private TeilaufgabeType teilaufgabe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateTeilaufgabeRequestType() {
    }


    public CreateTeilaufgabeRequestType(
            RequestHeaderType requestHeader,
            TeilaufgabeType teilaufgabe) {
        this.requestHeader = requestHeader;
        this.teilaufgabe = teilaufgabe;
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
     * Gets the requestHeader value for this CreateTeilaufgabeRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateTeilaufgabeRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the teilaufgabe value for this CreateTeilaufgabeRequestType.
     *
     * @return teilaufgabe   * Die Daten der Teilaufgabe.
     */
    public TeilaufgabeType getTeilaufgabe() {
        return teilaufgabe;
    }

    /**
     * Sets the teilaufgabe value for this CreateTeilaufgabeRequestType.
     *
     * @param teilaufgabe   * Die Daten der Teilaufgabe.
     */
    public void setTeilaufgabe(TeilaufgabeType teilaufgabe) {
        this.teilaufgabe = teilaufgabe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateTeilaufgabeRequestType)) return false;
        CreateTeilaufgabeRequestType other = (CreateTeilaufgabeRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.teilaufgabe == null && other.getTeilaufgabe() == null) ||
                        (this.teilaufgabe != null &&
                                this.teilaufgabe.equals(other.getTeilaufgabe())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getTeilaufgabe() != null) {
            _hashCode += getTeilaufgabe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
