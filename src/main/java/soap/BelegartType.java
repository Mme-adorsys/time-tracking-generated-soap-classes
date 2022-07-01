/**
 * BelegartType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Belegart.
 */
public class BelegartType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BelegartType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegartType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurzform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurzform"));
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
        elemField.setFieldName("belegartsteuersatzListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegartsteuersatzListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegartsteuersatzType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "belegartsteuersatz"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faktBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faktBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("zahlungsart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zahlungsart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklusiveRechnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklusiveRechnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abweichendesLeistungsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abweichendesLeistungsdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siebzigDreissigAufteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siebzigDreissigAufteilung"));
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

    /* Die Kurzbezeichnung der Belegart. */
    private String kurzform;
    /* Die Bezeichnung der Belegart. */
    private String bezeichnung;
    /* Eine optionale Liste der für die Belegart zulässigen Steuersätze.
     * Default: alle Steuersätze sind zulässig. */
    private BelegartsteuersatzType[] belegartsteuersatzListe;
    /* Ein optionaler Default-Wert für den Betrag. */
    private Double betrag;
    /* Ein optionaler Default-Wert für den zu fakturierenden Betrag. */
    private Double faktBetrag;
    /* Der Vorgabe-Wert für die Währung (optional). */
    private String waehrung;
    /* Der Vorgabe-Wert für die Zahlungsart (optional). */
    private String zahlungsart;
    private Boolean inklusiveRechnung;
    /* Kennung, ob bei Belegen dieser Belegart ein abweichendes Leistungsdatum
     * angegeben werden kann. */
    private Boolean abweichendesLeistungsdatum;
    /* Kennung, ob bei dieser Belegart eine 70/30-Aufteilung beim
     * Mahlzeitenabzu eerfolgen soll. */
    private Boolean siebzigDreissigAufteilung;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BelegartType() {
    }


    public BelegartType(
            String kurzform,
            String bezeichnung,
            BelegartsteuersatzType[] belegartsteuersatzListe,
            Double betrag,
            Double faktBetrag,
            String waehrung,
            String zahlungsart,
            Boolean inklusiveRechnung,
            Boolean abweichendesLeistungsdatum,
            Boolean siebzigDreissigAufteilung,
            AttributeType[] attributes) {
        this.kurzform = kurzform;
        this.bezeichnung = bezeichnung;
        this.belegartsteuersatzListe = belegartsteuersatzListe;
        this.betrag = betrag;
        this.faktBetrag = faktBetrag;
        this.waehrung = waehrung;
        this.zahlungsart = zahlungsart;
        this.inklusiveRechnung = inklusiveRechnung;
        this.abweichendesLeistungsdatum = abweichendesLeistungsdatum;
        this.siebzigDreissigAufteilung = siebzigDreissigAufteilung;
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
     * Gets the kurzform value for this BelegartType.
     *
     * @return kurzform   * Die Kurzbezeichnung der Belegart.
     */
    public String getKurzform() {
        return kurzform;
    }

    /**
     * Sets the kurzform value for this BelegartType.
     *
     * @param kurzform   * Die Kurzbezeichnung der Belegart.
     */
    public void setKurzform(String kurzform) {
        this.kurzform = kurzform;
    }

    /**
     * Gets the bezeichnung value for this BelegartType.
     *
     * @return bezeichnung   * Die Bezeichnung der Belegart.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this BelegartType.
     *
     * @param bezeichnung   * Die Bezeichnung der Belegart.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the belegartsteuersatzListe value for this BelegartType.
     *
     * @return belegartsteuersatzListe   * Eine optionale Liste der für die Belegart zulässigen Steuersätze.
     * Default: alle Steuersätze sind zulässig.
     */
    public BelegartsteuersatzType[] getBelegartsteuersatzListe() {
        return belegartsteuersatzListe;
    }

    /**
     * Sets the belegartsteuersatzListe value for this BelegartType.
     *
     * @param belegartsteuersatzListe   * Eine optionale Liste der für die Belegart zulässigen Steuersätze.
     * Default: alle Steuersätze sind zulässig.
     */
    public void setBelegartsteuersatzListe(BelegartsteuersatzType[] belegartsteuersatzListe) {
        this.belegartsteuersatzListe = belegartsteuersatzListe;
    }

    /**
     * Gets the betrag value for this BelegartType.
     *
     * @return betrag   * Ein optionaler Default-Wert für den Betrag.
     */
    public Double getBetrag() {
        return betrag;
    }

    /**
     * Sets the betrag value for this BelegartType.
     *
     * @param betrag   * Ein optionaler Default-Wert für den Betrag.
     */
    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    /**
     * Gets the faktBetrag value for this BelegartType.
     *
     * @return faktBetrag   * Ein optionaler Default-Wert für den zu fakturierenden Betrag.
     */
    public Double getFaktBetrag() {
        return faktBetrag;
    }

    /**
     * Sets the faktBetrag value for this BelegartType.
     *
     * @param faktBetrag   * Ein optionaler Default-Wert für den zu fakturierenden Betrag.
     */
    public void setFaktBetrag(Double faktBetrag) {
        this.faktBetrag = faktBetrag;
    }

    /**
     * Gets the waehrung value for this BelegartType.
     *
     * @return waehrung   * Der Vorgabe-Wert für die Währung (optional).
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this BelegartType.
     *
     * @param waehrung   * Der Vorgabe-Wert für die Währung (optional).
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the zahlungsart value for this BelegartType.
     *
     * @return zahlungsart   * Der Vorgabe-Wert für die Zahlungsart (optional).
     */
    public String getZahlungsart() {
        return zahlungsart;
    }

    /**
     * Sets the zahlungsart value for this BelegartType.
     *
     * @param zahlungsart   * Der Vorgabe-Wert für die Zahlungsart (optional).
     */
    public void setZahlungsart(String zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    /**
     * Gets the inklusiveRechnung value for this BelegartType.
     *
     * @return inklusiveRechnung
     */
    public Boolean getInklusiveRechnung() {
        return inklusiveRechnung;
    }

    /**
     * Sets the inklusiveRechnung value for this BelegartType.
     *
     * @param inklusiveRechnung
     */
    public void setInklusiveRechnung(Boolean inklusiveRechnung) {
        this.inklusiveRechnung = inklusiveRechnung;
    }

    /**
     * Gets the abweichendesLeistungsdatum value for this BelegartType.
     *
     * @return abweichendesLeistungsdatum   * Kennung, ob bei Belegen dieser Belegart ein abweichendes Leistungsdatum
     * angegeben werden kann.
     */
    public Boolean getAbweichendesLeistungsdatum() {
        return abweichendesLeistungsdatum;
    }

    /**
     * Sets the abweichendesLeistungsdatum value for this BelegartType.
     *
     * @param abweichendesLeistungsdatum   * Kennung, ob bei Belegen dieser Belegart ein abweichendes Leistungsdatum
     * angegeben werden kann.
     */
    public void setAbweichendesLeistungsdatum(Boolean abweichendesLeistungsdatum) {
        this.abweichendesLeistungsdatum = abweichendesLeistungsdatum;
    }

    /**
     * Gets the siebzigDreissigAufteilung value for this BelegartType.
     *
     * @return siebzigDreissigAufteilung   * Kennung, ob bei dieser Belegart eine 70/30-Aufteilung beim
     * Mahlzeitenabzu eerfolgen soll.
     */
    public Boolean getSiebzigDreissigAufteilung() {
        return siebzigDreissigAufteilung;
    }

    /**
     * Sets the siebzigDreissigAufteilung value for this BelegartType.
     *
     * @param siebzigDreissigAufteilung   * Kennung, ob bei dieser Belegart eine 70/30-Aufteilung beim
     * Mahlzeitenabzu eerfolgen soll.
     */
    public void setSiebzigDreissigAufteilung(Boolean siebzigDreissigAufteilung) {
        this.siebzigDreissigAufteilung = siebzigDreissigAufteilung;
    }

    /**
     * Gets the attributes value for this BelegartType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this BelegartType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BelegartType)) return false;
        BelegartType other = (BelegartType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kurzform == null && other.getKurzform() == null) ||
                        (this.kurzform != null &&
                                this.kurzform.equals(other.getKurzform()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.belegartsteuersatzListe == null && other.getBelegartsteuersatzListe() == null) ||
                        (this.belegartsteuersatzListe != null &&
                                java.util.Arrays.equals(this.belegartsteuersatzListe, other.getBelegartsteuersatzListe()))) &&
                ((this.betrag == null && other.getBetrag() == null) ||
                        (this.betrag != null &&
                                this.betrag.equals(other.getBetrag()))) &&
                ((this.faktBetrag == null && other.getFaktBetrag() == null) ||
                        (this.faktBetrag != null &&
                                this.faktBetrag.equals(other.getFaktBetrag()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.zahlungsart == null && other.getZahlungsart() == null) ||
                        (this.zahlungsart != null &&
                                this.zahlungsart.equals(other.getZahlungsart()))) &&
                ((this.inklusiveRechnung == null && other.getInklusiveRechnung() == null) ||
                        (this.inklusiveRechnung != null &&
                                this.inklusiveRechnung.equals(other.getInklusiveRechnung()))) &&
                ((this.abweichendesLeistungsdatum == null && other.getAbweichendesLeistungsdatum() == null) ||
                        (this.abweichendesLeistungsdatum != null &&
                                this.abweichendesLeistungsdatum.equals(other.getAbweichendesLeistungsdatum()))) &&
                ((this.siebzigDreissigAufteilung == null && other.getSiebzigDreissigAufteilung() == null) ||
                        (this.siebzigDreissigAufteilung != null &&
                                this.siebzigDreissigAufteilung.equals(other.getSiebzigDreissigAufteilung()))) &&
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
        if (getKurzform() != null) {
            _hashCode += getKurzform().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getBelegartsteuersatzListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBelegartsteuersatzListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBelegartsteuersatzListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBetrag() != null) {
            _hashCode += getBetrag().hashCode();
        }
        if (getFaktBetrag() != null) {
            _hashCode += getFaktBetrag().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getZahlungsart() != null) {
            _hashCode += getZahlungsart().hashCode();
        }
        if (getInklusiveRechnung() != null) {
            _hashCode += getInklusiveRechnung().hashCode();
        }
        if (getAbweichendesLeistungsdatum() != null) {
            _hashCode += getAbweichendesLeistungsdatum().hashCode();
        }
        if (getSiebzigDreissigAufteilung() != null) {
            _hashCode += getSiebzigDreissigAufteilung().hashCode();
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
