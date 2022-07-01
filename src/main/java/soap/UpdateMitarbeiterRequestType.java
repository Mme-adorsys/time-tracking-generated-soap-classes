/**
 * UpdateMitarbeiterRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zum Aktualisieren eines Mitarbeiters.
 */
public class UpdateMitarbeiterRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateMitarbeiterRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateMitarbeiterRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitarbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitarbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MitarbeiterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* Die Daten zur Aktualisierung des Mitarbeiters. */
    private MitarbeiterType mitarbeiter;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateMitarbeiterRequestType() {
    }


    public UpdateMitarbeiterRequestType(
            RequestHeaderType requestHeader,
            MitarbeiterType mitarbeiter) {
        this.requestHeader = requestHeader;
        this.mitarbeiter = mitarbeiter;
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
     * Gets the requestHeader value for this UpdateMitarbeiterRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this UpdateMitarbeiterRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the mitarbeiter value for this UpdateMitarbeiterRequestType.
     *
     * @return mitarbeiter   * Die Daten zur Aktualisierung des Mitarbeiters.
     */
    public MitarbeiterType getMitarbeiter() {
        return mitarbeiter;
    }

    /**
     * Sets the mitarbeiter value for this UpdateMitarbeiterRequestType.
     *
     * @param mitarbeiter   * Die Daten zur Aktualisierung des Mitarbeiters.
     */
    public void setMitarbeiter(MitarbeiterType mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateMitarbeiterRequestType)) return false;
        UpdateMitarbeiterRequestType other = (UpdateMitarbeiterRequestType) obj;
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
                ((this.mitarbeiter == null && other.getMitarbeiter() == null) ||
                        (this.mitarbeiter != null &&
                                this.mitarbeiter.equals(other.getMitarbeiter())));
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
        if (getMitarbeiter() != null) {
            _hashCode += getMitarbeiter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
