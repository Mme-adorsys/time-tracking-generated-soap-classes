/**
 * LexwareType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Buchungssatzes im Lexware Format
 */
public class LexwareType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(LexwareType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "LexwareType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buchungstext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchungstext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buchungsbetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchungsbetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sollkonto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sollkonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habenkonto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "habenkonto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steuerschluessel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steuerschluessel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostenstelle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostenstelle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kostentraeger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostentraeger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    /* Das Datum des Beleges bzw. der Buchung. */
    private String belegdatum;
    /* Die Nummer des Beleges. */
    private String belegnummer;
    /* Der Buchungstext, z.B. Text der Rechnungsposition. */
    private String buchungstext;
    /* Der zu buchende Betrag. */
    private String buchungsbetrag;
    /* Das Soll-Konto, zu dessen Lasten die Buchung erfolgt. */
    private String sollkonto;
    /* Das Haben-Konto, zu dessen Gunsten die Buchung erfolgt. */
    private String habenkonto;
    /* Der Steuerschlüssel. */
    private String steuerschluessel;
    /* Die Kostenstelle (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenstellen verwendet werden). */
    private String kostenstelle;
    /* Der Kostenträge (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenträger verwendet werden). */
    private String kostentraeger;
    /* Die Währung der Buchung. */
    private String waehrung;
    /* Für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public LexwareType() {
    }


    public LexwareType(
            String belegdatum,
            String belegnummer,
            String buchungstext,
            String buchungsbetrag,
            String sollkonto,
            String habenkonto,
            String steuerschluessel,
            String kostenstelle,
            String kostentraeger,
            String waehrung,
            AttributeType[] attributes) {
        this.belegdatum = belegdatum;
        this.belegnummer = belegnummer;
        this.buchungstext = buchungstext;
        this.buchungsbetrag = buchungsbetrag;
        this.sollkonto = sollkonto;
        this.habenkonto = habenkonto;
        this.steuerschluessel = steuerschluessel;
        this.kostenstelle = kostenstelle;
        this.kostentraeger = kostentraeger;
        this.waehrung = waehrung;
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
     * Gets the belegdatum value for this LexwareType.
     *
     * @return belegdatum   * Das Datum des Beleges bzw. der Buchung.
     */
    public String getBelegdatum() {
        return belegdatum;
    }

    /**
     * Sets the belegdatum value for this LexwareType.
     *
     * @param belegdatum   * Das Datum des Beleges bzw. der Buchung.
     */
    public void setBelegdatum(String belegdatum) {
        this.belegdatum = belegdatum;
    }

    /**
     * Gets the belegnummer value for this LexwareType.
     *
     * @return belegnummer   * Die Nummer des Beleges.
     */
    public String getBelegnummer() {
        return belegnummer;
    }

    /**
     * Sets the belegnummer value for this LexwareType.
     *
     * @param belegnummer   * Die Nummer des Beleges.
     */
    public void setBelegnummer(String belegnummer) {
        this.belegnummer = belegnummer;
    }

    /**
     * Gets the buchungstext value for this LexwareType.
     *
     * @return buchungstext   * Der Buchungstext, z.B. Text der Rechnungsposition.
     */
    public String getBuchungstext() {
        return buchungstext;
    }

    /**
     * Sets the buchungstext value for this LexwareType.
     *
     * @param buchungstext   * Der Buchungstext, z.B. Text der Rechnungsposition.
     */
    public void setBuchungstext(String buchungstext) {
        this.buchungstext = buchungstext;
    }

    /**
     * Gets the buchungsbetrag value for this LexwareType.
     *
     * @return buchungsbetrag   * Der zu buchende Betrag.
     */
    public String getBuchungsbetrag() {
        return buchungsbetrag;
    }

    /**
     * Sets the buchungsbetrag value for this LexwareType.
     *
     * @param buchungsbetrag   * Der zu buchende Betrag.
     */
    public void setBuchungsbetrag(String buchungsbetrag) {
        this.buchungsbetrag = buchungsbetrag;
    }

    /**
     * Gets the sollkonto value for this LexwareType.
     *
     * @return sollkonto   * Das Soll-Konto, zu dessen Lasten die Buchung erfolgt.
     */
    public String getSollkonto() {
        return sollkonto;
    }

    /**
     * Sets the sollkonto value for this LexwareType.
     *
     * @param sollkonto   * Das Soll-Konto, zu dessen Lasten die Buchung erfolgt.
     */
    public void setSollkonto(String sollkonto) {
        this.sollkonto = sollkonto;
    }

    /**
     * Gets the habenkonto value for this LexwareType.
     *
     * @return habenkonto   * Das Haben-Konto, zu dessen Gunsten die Buchung erfolgt.
     */
    public String getHabenkonto() {
        return habenkonto;
    }

    /**
     * Sets the habenkonto value for this LexwareType.
     *
     * @param habenkonto   * Das Haben-Konto, zu dessen Gunsten die Buchung erfolgt.
     */
    public void setHabenkonto(String habenkonto) {
        this.habenkonto = habenkonto;
    }

    /**
     * Gets the steuerschluessel value for this LexwareType.
     *
     * @return steuerschluessel   * Der Steuerschlüssel.
     */
    public String getSteuerschluessel() {
        return steuerschluessel;
    }

    /**
     * Sets the steuerschluessel value for this LexwareType.
     *
     * @param steuerschluessel   * Der Steuerschlüssel.
     */
    public void setSteuerschluessel(String steuerschluessel) {
        this.steuerschluessel = steuerschluessel;
    }

    /**
     * Gets the kostenstelle value for this LexwareType.
     *
     * @return kostenstelle   * Die Kostenstelle (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenstellen verwendet werden).
     */
    public String getKostenstelle() {
        return kostenstelle;
    }

    /**
     * Sets the kostenstelle value for this LexwareType.
     *
     * @param kostenstelle   * Die Kostenstelle (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenstellen verwendet werden).
     */
    public void setKostenstelle(String kostenstelle) {
        this.kostenstelle = kostenstelle;
    }

    /**
     * Gets the kostentraeger value for this LexwareType.
     *
     * @return kostentraeger   * Der Kostenträge (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenträger verwendet werden).
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this LexwareType.
     *
     * @param kostentraeger   * Der Kostenträge (falls das Modu 'Export für Buchhaltung' aktiv
     * ist und Kostenträger verwendet werden).
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the waehrung value for this LexwareType.
     *
     * @return waehrung   * Die Währung der Buchung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this LexwareType.
     *
     * @param waehrung   * Die Währung der Buchung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the attributes value for this LexwareType.
     *
     * @return attributes   * Für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this LexwareType.
     *
     * @param attributes   * Für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LexwareType)) return false;
        LexwareType other = (LexwareType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.belegdatum == null && other.getBelegdatum() == null) ||
                        (this.belegdatum != null &&
                                this.belegdatum.equals(other.getBelegdatum()))) &&
                ((this.belegnummer == null && other.getBelegnummer() == null) ||
                        (this.belegnummer != null &&
                                this.belegnummer.equals(other.getBelegnummer()))) &&
                ((this.buchungstext == null && other.getBuchungstext() == null) ||
                        (this.buchungstext != null &&
                                this.buchungstext.equals(other.getBuchungstext()))) &&
                ((this.buchungsbetrag == null && other.getBuchungsbetrag() == null) ||
                        (this.buchungsbetrag != null &&
                                this.buchungsbetrag.equals(other.getBuchungsbetrag()))) &&
                ((this.sollkonto == null && other.getSollkonto() == null) ||
                        (this.sollkonto != null &&
                                this.sollkonto.equals(other.getSollkonto()))) &&
                ((this.habenkonto == null && other.getHabenkonto() == null) ||
                        (this.habenkonto != null &&
                                this.habenkonto.equals(other.getHabenkonto()))) &&
                ((this.steuerschluessel == null && other.getSteuerschluessel() == null) ||
                        (this.steuerschluessel != null &&
                                this.steuerschluessel.equals(other.getSteuerschluessel()))) &&
                ((this.kostenstelle == null && other.getKostenstelle() == null) ||
                        (this.kostenstelle != null &&
                                this.kostenstelle.equals(other.getKostenstelle()))) &&
                ((this.kostentraeger == null && other.getKostentraeger() == null) ||
                        (this.kostentraeger != null &&
                                this.kostentraeger.equals(other.getKostentraeger()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
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
        if (getBelegdatum() != null) {
            _hashCode += getBelegdatum().hashCode();
        }
        if (getBelegnummer() != null) {
            _hashCode += getBelegnummer().hashCode();
        }
        if (getBuchungstext() != null) {
            _hashCode += getBuchungstext().hashCode();
        }
        if (getBuchungsbetrag() != null) {
            _hashCode += getBuchungsbetrag().hashCode();
        }
        if (getSollkonto() != null) {
            _hashCode += getSollkonto().hashCode();
        }
        if (getHabenkonto() != null) {
            _hashCode += getHabenkonto().hashCode();
        }
        if (getSteuerschluessel() != null) {
            _hashCode += getSteuerschluessel().hashCode();
        }
        if (getKostenstelle() != null) {
            _hashCode += getKostenstelle().hashCode();
        }
        if (getKostentraeger() != null) {
            _hashCode += getKostentraeger().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
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
