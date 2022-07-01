/**
 * RequestHeaderType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Der allgemeine ZEP Request-Header. Muss in Request-Header oder
 * Request-Body vorkommen, wenn die Authentifizierung-Method in Administration
 * > Einstellungen via Token ausgewählt.
 */
public class RequestHeaderType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RequestHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Das SOAP-Token zur Autorisierung des Requests, siehe ZEP: Administration
     * - Einstellungen - SOAP */
    private String authorizationToken;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public RequestHeaderType() {
    }

    public RequestHeaderType(
            String authorizationToken) {
        this.authorizationToken = authorizationToken;
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
     * Gets the authorizationToken value for this RequestHeaderType.
     *
     * @return authorizationToken   * Das SOAP-Token zur Autorisierung des Requests, siehe ZEP: Administration
     * - Einstellungen - SOAP
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * Sets the authorizationToken value for this RequestHeaderType.
     *
     * @param authorizationToken   * Das SOAP-Token zur Autorisierung des Requests, siehe ZEP: Administration
     * - Einstellungen - SOAP
     */
    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestHeaderType)) return false;
        RequestHeaderType other = (RequestHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.authorizationToken == null && other.getAuthorizationToken() == null) ||
                        (this.authorizationToken != null &&
                                this.authorizationToken.equals(other.getAuthorizationToken())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuthorizationToken() != null) {
            _hashCode += getAuthorizationToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
