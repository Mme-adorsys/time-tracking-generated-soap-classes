/**
 * BelegType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Beleges.
 */
public class BelegType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BelegType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leistungsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leistungsdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegart"));
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
        elemField.setFieldName("faktWaehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faktWaehrung"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istNetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istNetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istFaktNetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istFaktNetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegbetragListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegbetragListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegbetragType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "belegbetrag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anhang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anhang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
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

    /* Die Nummer des Belegs. Leer bei Anlage eines neuen Belegs,
     * Pflicht beim Update oder Löschen. */
    private Integer belegNr;
    /* Das Datum des Beleges. */
    private String datum;
    /* Das ggf. abweichende Leistungsdatum des Beleges. Nur zulässig
     * wenn die Belegart ein abweichendes Leistungsdatum zulässt. */
    private String leistungsdatum;
    /* Die Nummer des Projektes, dem dieser Beleg zugeordnet ist.
     * Pflicht bei Anlage. */
    private String projektNr;
    /* Nummer des Vorgangs, dem der Beleg zugeordnet werden soll.
     * Die Angabe eines Vorgangs ist optional. */
    private String vorgangNr;
    /* Die Userid des Benutzer, dem der Beleg zugeordnet ist. Pflicht
     * bei Anlage. */
    private String userId;
    /* Die Belegart des Beleges. Pflicht bei Anlage. */
    private String belegart;
    /* Die Währung des Beleges. */
    private String waehrung;
    /* Die Währung, in der der Beleg an den Kunden weiterfakturiert
     * wird. */
    private String faktWaehrung;
    /* Die Zahlungsart des Beleges, z.B. privat oder Firma. Die hier
     * angegebene Wert muss einer der in den ZEP Stammdaten definierten Zahlungsarten
     * entsprechen. */
    private String zahlungsart;
    /* Eine optionale Bemerkung zum Beleg. */
    private String bemerkung;
    /* Kennung, ob die Beträge des Beleges brutto oder netto sind.
     * Default: brutto. */
    private Boolean istNetto;
    /* Kennung, ob die zu fakturierenden Beträge des Beleges brutto
     * oder netto sind. Default: brutto. */
    private Boolean istFaktNetto;
    /* Liste der Einzel-Beträge des Beleges. Diese können u.U. unterschiedliche
     * Steuersätze o.ä. enthalten. */
    private BelegbetragType[] belegbetragListe;
    /* Der optionale Anhang zum Beleg (Bild oder PDF). */
    private AnhangType anhang;
    private Integer vorgangId;
    private Integer projektId;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des Objekts. */
    private String modified;
    /* Optionale Liste von Attributen für kundenspezifische Anpassungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BelegType() {
    }


    public BelegType(
            Integer belegNr,
            String datum,
            String leistungsdatum,
            String projektNr,
            String vorgangNr,
            String userId,
            String belegart,
            String waehrung,
            String faktWaehrung,
            String zahlungsart,
            String bemerkung,
            Boolean istNetto,
            Boolean istFaktNetto,
            BelegbetragType[] belegbetragListe,
            AnhangType anhang,
            Integer vorgangId,
            Integer projektId,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.belegNr = belegNr;
        this.datum = datum;
        this.leistungsdatum = leistungsdatum;
        this.projektNr = projektNr;
        this.vorgangNr = vorgangNr;
        this.userId = userId;
        this.belegart = belegart;
        this.waehrung = waehrung;
        this.faktWaehrung = faktWaehrung;
        this.zahlungsart = zahlungsart;
        this.bemerkung = bemerkung;
        this.istNetto = istNetto;
        this.istFaktNetto = istFaktNetto;
        this.belegbetragListe = belegbetragListe;
        this.anhang = anhang;
        this.vorgangId = vorgangId;
        this.projektId = projektId;
        this.created = created;
        this.modified = modified;
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
     * Gets the belegNr value for this BelegType.
     *
     * @return belegNr   * Die Nummer des Belegs. Leer bei Anlage eines neuen Belegs,
     * Pflicht beim Update oder Löschen.
     */
    public Integer getBelegNr() {
        return belegNr;
    }

    /**
     * Sets the belegNr value for this BelegType.
     *
     * @param belegNr   * Die Nummer des Belegs. Leer bei Anlage eines neuen Belegs,
     * Pflicht beim Update oder Löschen.
     */
    public void setBelegNr(Integer belegNr) {
        this.belegNr = belegNr;
    }

    /**
     * Gets the datum value for this BelegType.
     *
     * @return datum   * Das Datum des Beleges.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this BelegType.
     *
     * @param datum   * Das Datum des Beleges.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the leistungsdatum value for this BelegType.
     *
     * @return leistungsdatum   * Das ggf. abweichende Leistungsdatum des Beleges. Nur zulässig
     * wenn die Belegart ein abweichendes Leistungsdatum zulässt.
     */
    public String getLeistungsdatum() {
        return leistungsdatum;
    }

    /**
     * Sets the leistungsdatum value for this BelegType.
     *
     * @param leistungsdatum   * Das ggf. abweichende Leistungsdatum des Beleges. Nur zulässig
     * wenn die Belegart ein abweichendes Leistungsdatum zulässt.
     */
    public void setLeistungsdatum(String leistungsdatum) {
        this.leistungsdatum = leistungsdatum;
    }

    /**
     * Gets the projektNr value for this BelegType.
     *
     * @return projektNr   * Die Nummer des Projektes, dem dieser Beleg zugeordnet ist.
     * Pflicht bei Anlage.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this BelegType.
     *
     * @param projektNr   * Die Nummer des Projektes, dem dieser Beleg zugeordnet ist.
     * Pflicht bei Anlage.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the vorgangNr value for this BelegType.
     *
     * @return vorgangNr   * Nummer des Vorgangs, dem der Beleg zugeordnet werden soll.
     * Die Angabe eines Vorgangs ist optional.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this BelegType.
     *
     * @param vorgangNr   * Nummer des Vorgangs, dem der Beleg zugeordnet werden soll.
     * Die Angabe eines Vorgangs ist optional.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the userId value for this BelegType.
     *
     * @return userId   * Die Userid des Benutzer, dem der Beleg zugeordnet ist. Pflicht
     * bei Anlage.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this BelegType.
     *
     * @param userId   * Die Userid des Benutzer, dem der Beleg zugeordnet ist. Pflicht
     * bei Anlage.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the belegart value for this BelegType.
     *
     * @return belegart   * Die Belegart des Beleges. Pflicht bei Anlage.
     */
    public String getBelegart() {
        return belegart;
    }

    /**
     * Sets the belegart value for this BelegType.
     *
     * @param belegart   * Die Belegart des Beleges. Pflicht bei Anlage.
     */
    public void setBelegart(String belegart) {
        this.belegart = belegart;
    }

    /**
     * Gets the waehrung value for this BelegType.
     *
     * @return waehrung   * Die Währung des Beleges.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this BelegType.
     *
     * @param waehrung   * Die Währung des Beleges.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the faktWaehrung value for this BelegType.
     *
     * @return faktWaehrung   * Die Währung, in der der Beleg an den Kunden weiterfakturiert
     * wird.
     */
    public String getFaktWaehrung() {
        return faktWaehrung;
    }

    /**
     * Sets the faktWaehrung value for this BelegType.
     *
     * @param faktWaehrung   * Die Währung, in der der Beleg an den Kunden weiterfakturiert
     * wird.
     */
    public void setFaktWaehrung(String faktWaehrung) {
        this.faktWaehrung = faktWaehrung;
    }

    /**
     * Gets the zahlungsart value for this BelegType.
     *
     * @return zahlungsart   * Die Zahlungsart des Beleges, z.B. privat oder Firma. Die hier
     * angegebene Wert muss einer der in den ZEP Stammdaten definierten Zahlungsarten
     * entsprechen.
     */
    public String getZahlungsart() {
        return zahlungsart;
    }

    /**
     * Sets the zahlungsart value for this BelegType.
     *
     * @param zahlungsart   * Die Zahlungsart des Beleges, z.B. privat oder Firma. Die hier
     * angegebene Wert muss einer der in den ZEP Stammdaten definierten Zahlungsarten
     * entsprechen.
     */
    public void setZahlungsart(String zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    /**
     * Gets the bemerkung value for this BelegType.
     *
     * @return bemerkung   * Eine optionale Bemerkung zum Beleg.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this BelegType.
     *
     * @param bemerkung   * Eine optionale Bemerkung zum Beleg.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the istNetto value for this BelegType.
     *
     * @return istNetto   * Kennung, ob die Beträge des Beleges brutto oder netto sind.
     * Default: brutto.
     */
    public Boolean getIstNetto() {
        return istNetto;
    }

    /**
     * Sets the istNetto value for this BelegType.
     *
     * @param istNetto   * Kennung, ob die Beträge des Beleges brutto oder netto sind.
     * Default: brutto.
     */
    public void setIstNetto(Boolean istNetto) {
        this.istNetto = istNetto;
    }

    /**
     * Gets the istFaktNetto value for this BelegType.
     *
     * @return istFaktNetto   * Kennung, ob die zu fakturierenden Beträge des Beleges brutto
     * oder netto sind. Default: brutto.
     */
    public Boolean getIstFaktNetto() {
        return istFaktNetto;
    }

    /**
     * Sets the istFaktNetto value for this BelegType.
     *
     * @param istFaktNetto   * Kennung, ob die zu fakturierenden Beträge des Beleges brutto
     * oder netto sind. Default: brutto.
     */
    public void setIstFaktNetto(Boolean istFaktNetto) {
        this.istFaktNetto = istFaktNetto;
    }

    /**
     * Gets the belegbetragListe value for this BelegType.
     *
     * @return belegbetragListe   * Liste der Einzel-Beträge des Beleges. Diese können u.U. unterschiedliche
     * Steuersätze o.ä. enthalten.
     */
    public BelegbetragType[] getBelegbetragListe() {
        return belegbetragListe;
    }

    /**
     * Sets the belegbetragListe value for this BelegType.
     *
     * @param belegbetragListe   * Liste der Einzel-Beträge des Beleges. Diese können u.U. unterschiedliche
     * Steuersätze o.ä. enthalten.
     */
    public void setBelegbetragListe(BelegbetragType[] belegbetragListe) {
        this.belegbetragListe = belegbetragListe;
    }

    /**
     * Gets the anhang value for this BelegType.
     *
     * @return anhang   * Der optionale Anhang zum Beleg (Bild oder PDF).
     */
    public AnhangType getAnhang() {
        return anhang;
    }

    /**
     * Sets the anhang value for this BelegType.
     *
     * @param anhang   * Der optionale Anhang zum Beleg (Bild oder PDF).
     */
    public void setAnhang(AnhangType anhang) {
        this.anhang = anhang;
    }

    /**
     * Gets the vorgangId value for this BelegType.
     *
     * @return vorgangId
     */
    public Integer getVorgangId() {
        return vorgangId;
    }

    /**
     * Sets the vorgangId value for this BelegType.
     *
     * @param vorgangId
     */
    public void setVorgangId(Integer vorgangId) {
        this.vorgangId = vorgangId;
    }

    /**
     * Gets the projektId value for this BelegType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this BelegType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the created value for this BelegType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this BelegType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this BelegType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this BelegType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this BelegType.
     *
     * @return attributes   * Optionale Liste von Attributen für kundenspezifische Anpassungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this BelegType.
     *
     * @param attributes   * Optionale Liste von Attributen für kundenspezifische Anpassungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BelegType)) return false;
        BelegType other = (BelegType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.belegNr == null && other.getBelegNr() == null) ||
                        (this.belegNr != null &&
                                this.belegNr.equals(other.getBelegNr()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.leistungsdatum == null && other.getLeistungsdatum() == null) ||
                        (this.leistungsdatum != null &&
                                this.leistungsdatum.equals(other.getLeistungsdatum()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.belegart == null && other.getBelegart() == null) ||
                        (this.belegart != null &&
                                this.belegart.equals(other.getBelegart()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.faktWaehrung == null && other.getFaktWaehrung() == null) ||
                        (this.faktWaehrung != null &&
                                this.faktWaehrung.equals(other.getFaktWaehrung()))) &&
                ((this.zahlungsart == null && other.getZahlungsart() == null) ||
                        (this.zahlungsart != null &&
                                this.zahlungsart.equals(other.getZahlungsart()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.istNetto == null && other.getIstNetto() == null) ||
                        (this.istNetto != null &&
                                this.istNetto.equals(other.getIstNetto()))) &&
                ((this.istFaktNetto == null && other.getIstFaktNetto() == null) ||
                        (this.istFaktNetto != null &&
                                this.istFaktNetto.equals(other.getIstFaktNetto()))) &&
                ((this.belegbetragListe == null && other.getBelegbetragListe() == null) ||
                        (this.belegbetragListe != null &&
                                java.util.Arrays.equals(this.belegbetragListe, other.getBelegbetragListe()))) &&
                ((this.anhang == null && other.getAnhang() == null) ||
                        (this.anhang != null &&
                                this.anhang.equals(other.getAnhang()))) &&
                ((this.vorgangId == null && other.getVorgangId() == null) ||
                        (this.vorgangId != null &&
                                this.vorgangId.equals(other.getVorgangId()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
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
        if (getBelegNr() != null) {
            _hashCode += getBelegNr().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getLeistungsdatum() != null) {
            _hashCode += getLeistungsdatum().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getBelegart() != null) {
            _hashCode += getBelegart().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getFaktWaehrung() != null) {
            _hashCode += getFaktWaehrung().hashCode();
        }
        if (getZahlungsart() != null) {
            _hashCode += getZahlungsart().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getIstNetto() != null) {
            _hashCode += getIstNetto().hashCode();
        }
        if (getIstFaktNetto() != null) {
            _hashCode += getIstFaktNetto().hashCode();
        }
        if (getBelegbetragListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBelegbetragListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBelegbetragListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnhang() != null) {
            _hashCode += getAnhang().hashCode();
        }
        if (getVorgangId() != null) {
            _hashCode += getVorgangId().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
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
