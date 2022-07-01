/**
 * DeleteFehlzeitRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Löschen eines Fehlgrunds
 */
public class DeleteFehlzeitRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DeleteFehlzeitRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "DeleteFehlzeitRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailversandUnterdruecken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailversandUnterdruecken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    private int id;
    /* Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (delete) unterdrückt. */
    private Boolean mailversandUnterdruecken;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public DeleteFehlzeitRequestType() {
    }


    public DeleteFehlzeitRequestType(
            RequestHeaderType requestHeader,
            int id,
            Boolean mailversandUnterdruecken) {
        this.requestHeader = requestHeader;
        this.id = id;
        this.mailversandUnterdruecken = mailversandUnterdruecken;
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
     * Gets the requestHeader value for this DeleteFehlzeitRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this DeleteFehlzeitRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the id value for this DeleteFehlzeitRequestType.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value for this DeleteFehlzeitRequestType.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the mailversandUnterdruecken value for this DeleteFehlzeitRequestType.
     *
     * @return mailversandUnterdruecken   * Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (delete) unterdrückt.
     */
    public Boolean getMailversandUnterdruecken() {
        return mailversandUnterdruecken;
    }

    /**
     * Sets the mailversandUnterdruecken value for this DeleteFehlzeitRequestType.
     *
     * @param mailversandUnterdruecken   * Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (delete) unterdrückt.
     */
    public void setMailversandUnterdruecken(Boolean mailversandUnterdruecken) {
        this.mailversandUnterdruecken = mailversandUnterdruecken;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeleteFehlzeitRequestType)) return false;
        DeleteFehlzeitRequestType other = (DeleteFehlzeitRequestType) obj;
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
                this.id == other.getId() &&
                ((this.mailversandUnterdruecken == null && other.getMailversandUnterdruecken() == null) ||
                        (this.mailversandUnterdruecken != null &&
                                this.mailversandUnterdruecken.equals(other.getMailversandUnterdruecken())));
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
        _hashCode += getId();
        if (getMailversandUnterdruecken() != null) {
            _hashCode += getMailversandUnterdruecken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
