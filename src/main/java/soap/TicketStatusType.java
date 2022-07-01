/**
 * TicketStatusType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten zum Ticketstatus.
 */
public class TicketStatusType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TicketStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der Status-Code. */
    private int status;
    /* Die Bezeichnung des Status. */
    private String bezeichnung;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TicketStatusType() {
    }


    public TicketStatusType(
            int status,
            String bezeichnung) {
        this.status = status;
        this.bezeichnung = bezeichnung;
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
     * Gets the status value for this TicketStatusType.
     *
     * @return status   * Der Status-Code.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status value for this TicketStatusType.
     *
     * @param status   * Der Status-Code.
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the bezeichnung value for this TicketStatusType.
     *
     * @return bezeichnung   * Die Bezeichnung des Status.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this TicketStatusType.
     *
     * @param bezeichnung   * Die Bezeichnung des Status.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TicketStatusType)) return false;
        TicketStatusType other = (TicketStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.status == other.getStatus() &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getStatus();
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
