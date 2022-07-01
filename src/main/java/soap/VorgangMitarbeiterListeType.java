/**
 * VorgangMitarbeiterListeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Eine Liste der Mitarbeiter eines Vorgangs.
 */
public class VorgangMitarbeiterListeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(VorgangMitarbeiterListeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangMitarbeiterListeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangMitarbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangMitarbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangMitarbeiterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die in der Liste enthaltenen Vorgangsmitarbeiter. */
    private VorgangMitarbeiterType[] vorgangMitarbeiter;
    /* Aktion. Um alle Vorgangsmitarbeiter im Rahmen eines Updates
     * zu löschen muss hier "delete" angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public VorgangMitarbeiterListeType() {
    }

    public VorgangMitarbeiterListeType(
            VorgangMitarbeiterType[] vorgangMitarbeiter,
            String action) {
        this.vorgangMitarbeiter = vorgangMitarbeiter;
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
     * Gets the vorgangMitarbeiter value for this VorgangMitarbeiterListeType.
     *
     * @return vorgangMitarbeiter   * Die in der Liste enthaltenen Vorgangsmitarbeiter.
     */
    public VorgangMitarbeiterType[] getVorgangMitarbeiter() {
        return vorgangMitarbeiter;
    }

    /**
     * Sets the vorgangMitarbeiter value for this VorgangMitarbeiterListeType.
     *
     * @param vorgangMitarbeiter   * Die in der Liste enthaltenen Vorgangsmitarbeiter.
     */
    public void setVorgangMitarbeiter(VorgangMitarbeiterType[] vorgangMitarbeiter) {
        this.vorgangMitarbeiter = vorgangMitarbeiter;
    }

    public VorgangMitarbeiterType getVorgangMitarbeiter(int i) {
        return this.vorgangMitarbeiter[i];
    }

    public void setVorgangMitarbeiter(int i, VorgangMitarbeiterType _value) {
        this.vorgangMitarbeiter[i] = _value;
    }

    /**
     * Gets the action value for this VorgangMitarbeiterListeType.
     *
     * @return action   * Aktion. Um alle Vorgangsmitarbeiter im Rahmen eines Updates
     * zu löschen muss hier "delete" angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this VorgangMitarbeiterListeType.
     *
     * @param action   * Aktion. Um alle Vorgangsmitarbeiter im Rahmen eines Updates
     * zu löschen muss hier "delete" angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VorgangMitarbeiterListeType)) return false;
        VorgangMitarbeiterListeType other = (VorgangMitarbeiterListeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.vorgangMitarbeiter == null && other.getVorgangMitarbeiter() == null) ||
                        (this.vorgangMitarbeiter != null &&
                                java.util.Arrays.equals(this.vorgangMitarbeiter, other.getVorgangMitarbeiter()))) &&
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
        if (getVorgangMitarbeiter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getVorgangMitarbeiter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getVorgangMitarbeiter(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
