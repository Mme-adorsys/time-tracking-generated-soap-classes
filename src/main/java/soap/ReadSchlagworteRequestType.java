/**
 * ReadSchlagworteRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der Request zum Lesen von Schlagworten.
 */
public class ReadSchlagworteRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadSchlagworteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadSchlagworteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagwortArt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagwortArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* 'ticket' => Stammdaten-Schlagworte des Ticket-System,
     *                                 'projekt' => Stammdaten-Schlagworte
     * des Projektes */
    private String schlagwortArt;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadSchlagworteRequestType() {
    }


    public ReadSchlagworteRequestType(
            RequestHeaderType requestHeader,
            String schlagwortArt) {
        this.requestHeader = requestHeader;
        this.schlagwortArt = schlagwortArt;
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
     * Gets the requestHeader value for this ReadSchlagworteRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadSchlagworteRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the schlagwortArt value for this ReadSchlagworteRequestType.
     *
     * @return schlagwortArt   * 'ticket' => Stammdaten-Schlagworte des Ticket-System,
     *                                 'projekt' => Stammdaten-Schlagworte
     * des Projektes
     */
    public String getSchlagwortArt() {
        return schlagwortArt;
    }

    /**
     * Sets the schlagwortArt value for this ReadSchlagworteRequestType.
     *
     * @param schlagwortArt   * 'ticket' => Stammdaten-Schlagworte des Ticket-System,
     *                                 'projekt' => Stammdaten-Schlagworte
     * des Projektes
     */
    public void setSchlagwortArt(String schlagwortArt) {
        this.schlagwortArt = schlagwortArt;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadSchlagworteRequestType)) return false;
        ReadSchlagworteRequestType other = (ReadSchlagworteRequestType) obj;
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
                ((this.schlagwortArt == null && other.getSchlagwortArt() == null) ||
                        (this.schlagwortArt != null &&
                                this.schlagwortArt.equals(other.getSchlagwortArt())));
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
        if (getSchlagwortArt() != null) {
            _hashCode += getSchlagwortArt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
