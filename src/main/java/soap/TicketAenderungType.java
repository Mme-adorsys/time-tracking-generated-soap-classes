/**
 * TicketAenderungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Daten einer Ticket-Änderungen.
 */
public class TicketAenderungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TicketAenderungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketAenderungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old");
        elemField.setXmlName(new javax.xml.namespace.QName("", "old"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_new");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Das Feld, das geändert wurde. */
    private String label;
    /* Der alte Werte des Feldes. */
    private String old;
    /* Der neue Wert des Feldes. */
    private String _new;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TicketAenderungType() {
    }


    public TicketAenderungType(
            String label,
            String old,
            String _new) {
        this.label = label;
        this.old = old;
        this._new = _new;
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
     * Gets the label value for this TicketAenderungType.
     *
     * @return label   * Das Feld, das geändert wurde.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label value for this TicketAenderungType.
     *
     * @param label   * Das Feld, das geändert wurde.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets the old value for this TicketAenderungType.
     *
     * @return old   * Der alte Werte des Feldes.
     */
    public String getOld() {
        return old;
    }

    /**
     * Sets the old value for this TicketAenderungType.
     *
     * @param old   * Der alte Werte des Feldes.
     */
    public void setOld(String old) {
        this.old = old;
    }

    /**
     * Gets the _new value for this TicketAenderungType.
     *
     * @return _new   * Der neue Wert des Feldes.
     */
    public String get_new() {
        return _new;
    }

    /**
     * Sets the _new value for this TicketAenderungType.
     *
     * @param _new   * Der neue Wert des Feldes.
     */
    public void set_new(String _new) {
        this._new = _new;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TicketAenderungType)) return false;
        TicketAenderungType other = (TicketAenderungType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.label == null && other.getLabel() == null) ||
                        (this.label != null &&
                                this.label.equals(other.getLabel()))) &&
                ((this.old == null && other.getOld() == null) ||
                        (this.old != null &&
                                this.old.equals(other.getOld()))) &&
                ((this._new == null && other.get_new() == null) ||
                        (this._new != null &&
                                this._new.equals(other.get_new())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getOld() != null) {
            _hashCode += getOld().hashCode();
        }
        if (get_new() != null) {
            _hashCode += get_new().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
