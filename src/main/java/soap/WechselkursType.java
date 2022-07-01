/**
 * WechselkursType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Wechselkurses.
 */
public class WechselkursType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WechselkursType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "WechselkursType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Währung. */
    private String waehrung;
    /* Der Umrechnungskurs zur Umrechnung in die Basiswährung. */
    private Double kurs;
    /* Das Datum, bis zu dem der Wechselkurs gilt. */
    private String bisdatum;
    /* Die Bezeichnung des Wechselkurses. */
    private String bezeichnung;
    /* Flagge, ob es sich bei der Währung um die Basiswährung handelt. */
    private Boolean basis;
    /* Attribute für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public WechselkursType() {
    }


    public WechselkursType(
            String waehrung,
            Double kurs,
            String bisdatum,
            String bezeichnung,
            Boolean basis,
            AttributeType[] attributes) {
        this.waehrung = waehrung;
        this.kurs = kurs;
        this.bisdatum = bisdatum;
        this.bezeichnung = bezeichnung;
        this.basis = basis;
        this.attributes = attributes;
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
     * Gets the waehrung value for this WechselkursType.
     *
     * @return waehrung   * Die Währung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this WechselkursType.
     *
     * @param waehrung   * Die Währung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the kurs value for this WechselkursType.
     *
     * @return kurs   * Der Umrechnungskurs zur Umrechnung in die Basiswährung.
     */
    public Double getKurs() {
        return kurs;
    }

    /**
     * Sets the kurs value for this WechselkursType.
     *
     * @param kurs   * Der Umrechnungskurs zur Umrechnung in die Basiswährung.
     */
    public void setKurs(Double kurs) {
        this.kurs = kurs;
    }

    /**
     * Gets the bisdatum value for this WechselkursType.
     *
     * @return bisdatum   * Das Datum, bis zu dem der Wechselkurs gilt.
     */
    public String getBisdatum() {
        return bisdatum;
    }

    /**
     * Sets the bisdatum value for this WechselkursType.
     *
     * @param bisdatum   * Das Datum, bis zu dem der Wechselkurs gilt.
     */
    public void setBisdatum(String bisdatum) {
        this.bisdatum = bisdatum;
    }

    /**
     * Gets the bezeichnung value for this WechselkursType.
     *
     * @return bezeichnung   * Die Bezeichnung des Wechselkurses.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this WechselkursType.
     *
     * @param bezeichnung   * Die Bezeichnung des Wechselkurses.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the basis value for this WechselkursType.
     *
     * @return basis   * Flagge, ob es sich bei der Währung um die Basiswährung handelt.
     */
    public Boolean getBasis() {
        return basis;
    }

    /**
     * Sets the basis value for this WechselkursType.
     *
     * @param basis   * Flagge, ob es sich bei der Währung um die Basiswährung handelt.
     */
    public void setBasis(Boolean basis) {
        this.basis = basis;
    }

    /**
     * Gets the attributes value for this WechselkursType.
     *
     * @return attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this WechselkursType.
     *
     * @param attributes   * Attribute für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WechselkursType)) return false;
        WechselkursType other = (WechselkursType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.kurs == null && other.getKurs() == null) ||
                        (this.kurs != null &&
                                this.kurs.equals(other.getKurs()))) &&
                ((this.bisdatum == null && other.getBisdatum() == null) ||
                        (this.bisdatum != null &&
                                this.bisdatum.equals(other.getBisdatum()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.basis == null && other.getBasis() == null) ||
                        (this.basis != null &&
                                this.basis.equals(other.getBasis()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getKurs() != null) {
            _hashCode += getKurs().hashCode();
        }
        if (getBisdatum() != null) {
            _hashCode += getBisdatum().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getBasis() != null) {
            _hashCode += getBasis().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
