/**
 * DeletePreisgruppeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class DeletePreisgruppeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeletePreisgruppeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DeletePreisgruppeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private String kurzform;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeletePreisgruppeRequestType() {
    }


    public DeletePreisgruppeRequestType(
            RequestHeaderType requestHeader,
            String kurzform) {
        this.requestHeader = requestHeader;
        this.kurzform = kurzform;
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
     * Gets the requestHeader value for this DeletePreisgruppeRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this DeletePreisgruppeRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the kurzform value for this DeletePreisgruppeRequestType.
     *
     * @return kurzform
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this DeletePreisgruppeRequestType.
     *
     * @param kurzform
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeletePreisgruppeRequestType)) return false;
        DeletePreisgruppeRequestType other = (DeletePreisgruppeRequestType) obj;
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
                ((this.kurzform == null && other.getKurzform() == null) ||
                        (this.kurzform != null &&
                                this.kurzform.equals(other.getKurzform())));
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
        if (getKurzform() != null) {
            _hashCode += getKurzform().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
