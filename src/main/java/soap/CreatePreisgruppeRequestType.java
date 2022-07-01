/**
 * CreatePreisgruppeRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class CreatePreisgruppeRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreatePreisgruppeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreatePreisgruppeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preisgruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisgruppe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisgruppeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private PreisgruppeType preisgruppe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreatePreisgruppeRequestType() {
    }


    public CreatePreisgruppeRequestType(
            RequestHeaderType requestHeader,
            PreisgruppeType preisgruppe) {
        this.requestHeader = requestHeader;
        this.preisgruppe = preisgruppe;
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
     * Gets the requestHeader value for this CreatePreisgruppeRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreatePreisgruppeRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the preisgruppe value for this CreatePreisgruppeRequestType.
     *
     * @return preisgruppe
     */
    public PreisgruppeType getPreisgruppe() {
        return preisgruppe;
    }

    /**
     * Sets the preisgruppe value for this CreatePreisgruppeRequestType.
     *
     * @param preisgruppe
     */
    public void setPreisgruppe(PreisgruppeType preisgruppe) {
        this.preisgruppe = preisgruppe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreatePreisgruppeRequestType)) return false;
        CreatePreisgruppeRequestType other = (CreatePreisgruppeRequestType) obj;
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
                ((this.preisgruppe == null && other.getPreisgruppe() == null) ||
                        (this.preisgruppe != null &&
                                this.preisgruppe.equals(other.getPreisgruppe())));
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
        if (getPreisgruppe() != null) {
            _hashCode += getPreisgruppe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
