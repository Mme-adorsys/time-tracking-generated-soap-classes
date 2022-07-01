/**
 * CreateVorgangRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Anlage von Vorgängen.
 */
public class CreateVorgangRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CreateVorgangRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CreateVorgangRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private VorgangType vorgang;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CreateVorgangRequestType() {
    }


    public CreateVorgangRequestType(
            RequestHeaderType requestHeader,
            VorgangType vorgang) {
        this.requestHeader = requestHeader;
        this.vorgang = vorgang;
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
     * Gets the requestHeader value for this CreateVorgangRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CreateVorgangRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the vorgang value for this CreateVorgangRequestType.
     *
     * @return vorgang
     */
    public VorgangType getVorgang() {
        return vorgang;
    }

    /**
     * Sets the vorgang value for this CreateVorgangRequestType.
     *
     * @param vorgang
     */
    public void setVorgang(VorgangType vorgang) {
        this.vorgang = vorgang;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateVorgangRequestType)) return false;
        CreateVorgangRequestType other = (CreateVorgangRequestType) obj;
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
                ((this.vorgang == null && other.getVorgang() == null) ||
                        (this.vorgang != null &&
                                this.vorgang.equals(other.getVorgang())));
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
        if (getVorgang() != null) {
            _hashCode += getVorgang().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
