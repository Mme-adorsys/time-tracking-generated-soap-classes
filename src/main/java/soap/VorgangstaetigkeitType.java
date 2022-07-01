/**
 * VorgangstaetigkeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Daten zur Zuordnung einer Vorgangstätigkeit
 */
public class VorgangstaetigkeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(VorgangstaetigkeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangstaetigkeitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taetigkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taetigkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String taetigkeit;
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public VorgangstaetigkeitType() {
    }


    public VorgangstaetigkeitType(
            String taetigkeit,
            String action) {
        this.taetigkeit = taetigkeit;
        this.action = action;
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
     * Gets the taetigkeit value for this VorgangstaetigkeitType.
     *
     * @return taetigkeit
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Sets the taetigkeit value for this VorgangstaetigkeitType.
     *
     * @param taetigkeit
     */
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    /**
     * Gets the action value for this VorgangstaetigkeitType.
     *
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this VorgangstaetigkeitType.
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VorgangstaetigkeitType)) return false;
        VorgangstaetigkeitType other = (VorgangstaetigkeitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.taetigkeit == null && other.getTaetigkeit() == null) ||
                        (this.taetigkeit != null &&
                                this.taetigkeit.equals(other.getTaetigkeit()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTaetigkeit() != null) {
            _hashCode += getTaetigkeit().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
