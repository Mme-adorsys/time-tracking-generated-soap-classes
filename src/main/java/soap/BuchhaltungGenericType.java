/**
 * BuchhaltungGenericType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Datensatz aus dem Buchhaltungs-Export im generischen Format
 */
public class BuchhaltungGenericType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BuchhaltungGenericType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BuchhaltungGenericType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
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
        elemField.setFieldName("betrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betrag"));
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
        elemField.setFieldName("mwst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwst"));
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
        elemField.setFieldName("buchungsschluessel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buchungsschluessel"));
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
        elemField.setFieldName("kost1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kost1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kost2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kost2"));
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

    /* Das Datum der Buchung (z.B.
     *                 				Rechnungsdatum). */
    private String datum;
    /* Die Nummer des Beleges bzw. der
     *                 				Rechnung. */
    private String belegnummer;
    /* Der Betrag der Buchung. */
    private String betrag;
    /* Die Währung der Buchung. */
    private String waehrung;
    /* Der MwSt. Satz der Buchung. */
    private String mwst;
    /* Das Soll-Konto, zu dessen Lasten die
     *                 				Buchung erfolgt. */
    private String sollkonto;
    /* Das Haben-Konto, zu dessen Gunsten die
     *                 				Buchung erfolgt. */
    private String habenkonto;
    /* Der Buchungsschlüssel (s. Belegart). */
    private String buchungsschluessel;
    /* Der Buchungstext, z.B. Text der
     *                 				Rechnungsposition oder des Beleges. */
    private String buchungstext;
    /* Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenstellen) */
    private String kostenstelle;
    /* Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenträgern) */
    private String kostentraeger;
    private String kost1;
    private String kost2;
    /* Für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BuchhaltungGenericType() {
    }


    public BuchhaltungGenericType(
            String datum,
            String belegnummer,
            String betrag,
            String waehrung,
            String mwst,
            String sollkonto,
            String habenkonto,
            String buchungsschluessel,
            String buchungstext,
            String kostenstelle,
            String kostentraeger,
            String kost1,
            String kost2,
            AttributeType[] attributes) {
        this.datum = datum;
        this.belegnummer = belegnummer;
        this.betrag = betrag;
        this.waehrung = waehrung;
        this.mwst = mwst;
        this.sollkonto = sollkonto;
        this.habenkonto = habenkonto;
        this.buchungsschluessel = buchungsschluessel;
        this.buchungstext = buchungstext;
        this.kostenstelle = kostenstelle;
        this.kostentraeger = kostentraeger;
        this.kost1 = kost1;
        this.kost2 = kost2;
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
     * Gets the datum value for this BuchhaltungGenericType.
     *
     * @return datum   * Das Datum der Buchung (z.B.
     *                 				Rechnungsdatum).
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this BuchhaltungGenericType.
     *
     * @param datum   * Das Datum der Buchung (z.B.
     *                 				Rechnungsdatum).
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the belegnummer value for this BuchhaltungGenericType.
     *
     * @return belegnummer   * Die Nummer des Beleges bzw. der
     *                 				Rechnung.
     */
    public String getBelegnummer() {
        return belegnummer;
    }

    /**
     * Sets the belegnummer value for this BuchhaltungGenericType.
     *
     * @param belegnummer   * Die Nummer des Beleges bzw. der
     *                 				Rechnung.
     */
    public void setBelegnummer(String belegnummer) {
        this.belegnummer = belegnummer;
    }

    /**
     * Gets the betrag value for this BuchhaltungGenericType.
     *
     * @return betrag   * Der Betrag der Buchung.
     */
    public String getBetrag() {
        return betrag;
    }

    /**
     * Sets the betrag value for this BuchhaltungGenericType.
     *
     * @param betrag   * Der Betrag der Buchung.
     */
    public void setBetrag(String betrag) {
        this.betrag = betrag;
    }

    /**
     * Gets the waehrung value for this BuchhaltungGenericType.
     *
     * @return waehrung   * Die Währung der Buchung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this BuchhaltungGenericType.
     *
     * @param waehrung   * Die Währung der Buchung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the mwst value for this BuchhaltungGenericType.
     *
     * @return mwst   * Der MwSt. Satz der Buchung.
     */
    public String getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this BuchhaltungGenericType.
     *
     * @param mwst   * Der MwSt. Satz der Buchung.
     */
    public void setMwst(String mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the sollkonto value for this BuchhaltungGenericType.
     *
     * @return sollkonto   * Das Soll-Konto, zu dessen Lasten die
     *                 				Buchung erfolgt.
     */
    public String getSollkonto() {
        return sollkonto;
    }

    /**
     * Sets the sollkonto value for this BuchhaltungGenericType.
     *
     * @param sollkonto   * Das Soll-Konto, zu dessen Lasten die
     *                 				Buchung erfolgt.
     */
    public void setSollkonto(String sollkonto) {
        this.sollkonto = sollkonto;
    }

    /**
     * Gets the habenkonto value for this BuchhaltungGenericType.
     *
     * @return habenkonto   * Das Haben-Konto, zu dessen Gunsten die
     *                 				Buchung erfolgt.
     */
    public String getHabenkonto() {
        return habenkonto;
    }

    /**
     * Sets the habenkonto value for this BuchhaltungGenericType.
     *
     * @param habenkonto   * Das Haben-Konto, zu dessen Gunsten die
     *                 				Buchung erfolgt.
     */
    public void setHabenkonto(String habenkonto) {
        this.habenkonto = habenkonto;
    }

    /**
     * Gets the buchungsschluessel value for this BuchhaltungGenericType.
     *
     * @return buchungsschluessel   * Der Buchungsschlüssel (s. Belegart).
     */
    public String getBuchungsschluessel() {
        return buchungsschluessel;
    }

    /**
     * Sets the buchungsschluessel value for this BuchhaltungGenericType.
     *
     * @param buchungsschluessel   * Der Buchungsschlüssel (s. Belegart).
     */
    public void setBuchungsschluessel(String buchungsschluessel) {
        this.buchungsschluessel = buchungsschluessel;
    }

    /**
     * Gets the buchungstext value for this BuchhaltungGenericType.
     *
     * @return buchungstext   * Der Buchungstext, z.B. Text der
     *                 				Rechnungsposition oder des Beleges.
     */
    public String getBuchungstext() {
        return buchungstext;
    }

    /**
     * Sets the buchungstext value for this BuchhaltungGenericType.
     *
     * @param buchungstext   * Der Buchungstext, z.B. Text der
     *                 				Rechnungsposition oder des Beleges.
     */
    public void setBuchungstext(String buchungstext) {
        this.buchungstext = buchungstext;
    }

    /**
     * Gets the kostenstelle value for this BuchhaltungGenericType.
     *
     * @return kostenstelle   * Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenstellen)
     */
    public String getKostenstelle() {
        return kostenstelle;
    }

    /**
     * Sets the kostenstelle value for this BuchhaltungGenericType.
     *
     * @param kostenstelle   * Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenstellen)
     */
    public void setKostenstelle(String kostenstelle) {
        this.kostenstelle = kostenstelle;
    }

    /**
     * Gets the kostentraeger value for this BuchhaltungGenericType.
     *
     * @return kostentraeger   * Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenträgern)
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this BuchhaltungGenericType.
     *
     * @param kostentraeger   * Die Kostenstelle (bei Einsatz des Moduls
     *                 				'Export für Buchhaltung' und
     *                 				Kostenträgern)
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the kost1 value for this BuchhaltungGenericType.
     *
     * @return kost1
     */
    public String getKost1() {
        return kost1;
    }

    /**
     * Sets the kost1 value for this BuchhaltungGenericType.
     *
     * @param kost1
     */
    public void setKost1(String kost1) {
        this.kost1 = kost1;
    }

    /**
     * Gets the kost2 value for this BuchhaltungGenericType.
     *
     * @return kost2
     */
    public String getKost2() {
        return kost2;
    }

    /**
     * Sets the kost2 value for this BuchhaltungGenericType.
     *
     * @param kost2
     */
    public void setKost2(String kost2) {
        this.kost2 = kost2;
    }

    /**
     * Gets the attributes value for this BuchhaltungGenericType.
     *
     * @return attributes   * Für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this BuchhaltungGenericType.
     *
     * @param attributes   * Für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BuchhaltungGenericType)) return false;
        BuchhaltungGenericType other = (BuchhaltungGenericType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.belegnummer == null && other.getBelegnummer() == null) ||
                        (this.belegnummer != null &&
                                this.belegnummer.equals(other.getBelegnummer()))) &&
                ((this.betrag == null && other.getBetrag() == null) ||
                        (this.betrag != null &&
                                this.betrag.equals(other.getBetrag()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst()))) &&
                ((this.sollkonto == null && other.getSollkonto() == null) ||
                        (this.sollkonto != null &&
                                this.sollkonto.equals(other.getSollkonto()))) &&
                ((this.habenkonto == null && other.getHabenkonto() == null) ||
                        (this.habenkonto != null &&
                                this.habenkonto.equals(other.getHabenkonto()))) &&
                ((this.buchungsschluessel == null && other.getBuchungsschluessel() == null) ||
                        (this.buchungsschluessel != null &&
                                this.buchungsschluessel.equals(other.getBuchungsschluessel()))) &&
                ((this.buchungstext == null && other.getBuchungstext() == null) ||
                        (this.buchungstext != null &&
                                this.buchungstext.equals(other.getBuchungstext()))) &&
                ((this.kostenstelle == null && other.getKostenstelle() == null) ||
                        (this.kostenstelle != null &&
                                this.kostenstelle.equals(other.getKostenstelle()))) &&
                ((this.kostentraeger == null && other.getKostentraeger() == null) ||
                        (this.kostentraeger != null &&
                                this.kostentraeger.equals(other.getKostentraeger()))) &&
                ((this.kost1 == null && other.getKost1() == null) ||
                        (this.kost1 != null &&
                                this.kost1.equals(other.getKost1()))) &&
                ((this.kost2 == null && other.getKost2() == null) ||
                        (this.kost2 != null &&
                                this.kost2.equals(other.getKost2()))) &&
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getBelegnummer() != null) {
            _hashCode += getBelegnummer().hashCode();
        }
        if (getBetrag() != null) {
            _hashCode += getBetrag().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        if (getSollkonto() != null) {
            _hashCode += getSollkonto().hashCode();
        }
        if (getHabenkonto() != null) {
            _hashCode += getHabenkonto().hashCode();
        }
        if (getBuchungsschluessel() != null) {
            _hashCode += getBuchungsschluessel().hashCode();
        }
        if (getBuchungstext() != null) {
            _hashCode += getBuchungstext().hashCode();
        }
        if (getKostenstelle() != null) {
            _hashCode += getKostenstelle().hashCode();
        }
        if (getKostentraeger() != null) {
            _hashCode += getKostentraeger().hashCode();
        }
        if (getKost1() != null) {
            _hashCode += getKost1().hashCode();
        }
        if (getKost2() != null) {
            _hashCode += getKost2().hashCode();
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
