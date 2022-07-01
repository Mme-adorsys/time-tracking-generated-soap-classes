/**
 * RechnungspositionFestpreisType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Festpreis-Rechnungsposition.
 */
public class RechnungspositionFestpreisType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RechnungspositionFestpreisType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionFestpreisType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leistungszeitraumBeginn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leistungszeitraumBeginn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leistungszeitraumEnde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leistungszeitraumEnde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiederholung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wiederholung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geplantesRechnungsdatumGleich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geplantesRechnungsdatumGleich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einzelpreis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einzelpreis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einheit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einheit"));
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
        elemField.setFieldName("sprache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sprache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erloeskontoListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erloeskontoListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ErloeskontoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "erloeskonto"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungstext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungstext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geplantesDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geplantesDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("mwst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("vorgangId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    private Integer id;
    /* Die Nummer des Projektes. */
    private String projektNr;
    /* Die Nummer des Kunden. */
    private String kundenNr;
    /* Das Anfagsdatum des Leistungszeitraumes. */
    private String leistungszeitraumBeginn;
    /* Das Endedatum des Leistungszeitraumes. */
    private String leistungszeitraumEnde;
    /* - leer bzw. nicht eingegeben=keine
     *                 				Wiederholung, - 0=Monatlich Ultimo, -
     *                 				1=Monatlich zum gleichen Datum, -
     *                 				2=3-Monatlich Ultimo, - 3=3-Monatlich
     *                 				zum gleichen Datum, - 4=Jährlich */
    private Integer wiederholung;
    /* 0=leistungszeitraumBeginn, 1(default)=leistungszeitraumEnde,
     * siehe Dokumentation von geplantesDatum. */
    private Integer geplantesRechnungsdatumGleich;
    /* Menge */
    private Double menge;
    /* Der Einzelpreis. */
    private Double einzelpreis;
    /* Die Einheit der Rechnungsposition. */
    private String einheit;
    /* Die Währung. */
    private String waehrung;
    /* Die verfügbare Sprachen für die Texte
     *                 				die in ZEP ausgegeben werden: z.B. de,
     *                 				en, fr, ch, en_de */
    private String sprache;
    /* Das Erlöskonto der Rechnungsposition
     *                 				(bei Einsatz des Moduls 'Export für
     *                 				Buchhaltung'). */
    private ErloeskontoType[] erloeskontoListe;
    /* 0 (default)=geplant, 1=freigegeben */
    private Integer status;
    /* Der Rechnungstext der Rechnungsposition. */
    private String rechnungstext;
    private String rechnungsdatum;
    /* Wenn dies nicht null ist, dann gilt dies und nicht mehr die
     * geplantesRechnungsdatumGleich. */
    private String geplantesDatum;
    private Integer projektId;
    private Double mwst;
    private String vorgangNr;
    private Integer vorgangId;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RechnungspositionFestpreisType() {
    }


    public RechnungspositionFestpreisType(
            Integer id,
            String projektNr,
            String kundenNr,
            String leistungszeitraumBeginn,
            String leistungszeitraumEnde,
            Integer wiederholung,
            Integer geplantesRechnungsdatumGleich,
            Double menge,
            Double einzelpreis,
            String einheit,
            String waehrung,
            String sprache,
            ErloeskontoType[] erloeskontoListe,
            Integer status,
            String rechnungstext,
            String rechnungsdatum,
            String geplantesDatum,
            Integer projektId,
            Double mwst,
            String vorgangNr,
            Integer vorgangId,
            AttributeType[] attributes) {
        this.id = id;
        this.projektNr = projektNr;
        this.kundenNr = kundenNr;
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
        this.leistungszeitraumEnde = leistungszeitraumEnde;
        this.wiederholung = wiederholung;
        this.geplantesRechnungsdatumGleich = geplantesRechnungsdatumGleich;
        this.menge = menge;
        this.einzelpreis = einzelpreis;
        this.einheit = einheit;
        this.waehrung = waehrung;
        this.sprache = sprache;
        this.erloeskontoListe = erloeskontoListe;
        this.status = status;
        this.rechnungstext = rechnungstext;
        this.rechnungsdatum = rechnungsdatum;
        this.geplantesDatum = geplantesDatum;
        this.projektId = projektId;
        this.mwst = mwst;
        this.vorgangNr = vorgangNr;
        this.vorgangId = vorgangId;
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
     * Gets the id value for this RechnungspositionFestpreisType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this RechnungspositionFestpreisType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this RechnungspositionFestpreisType.
     *
     * @return projektNr   * Die Nummer des Projektes.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this RechnungspositionFestpreisType.
     *
     * @param projektNr   * Die Nummer des Projektes.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this RechnungspositionFestpreisType.
     *
     * @return kundenNr   * Die Nummer des Kunden.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this RechnungspositionFestpreisType.
     *
     * @param kundenNr   * Die Nummer des Kunden.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the leistungszeitraumBeginn value for this RechnungspositionFestpreisType.
     *
     * @return leistungszeitraumBeginn   * Das Anfagsdatum des Leistungszeitraumes.
     */
    public String getLeistungszeitraumBeginn() {
        return leistungszeitraumBeginn;
    }

    /**
     * Sets the leistungszeitraumBeginn value for this RechnungspositionFestpreisType.
     *
     * @param leistungszeitraumBeginn   * Das Anfagsdatum des Leistungszeitraumes.
     */
    public void setLeistungszeitraumBeginn(String leistungszeitraumBeginn) {
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
    }

    /**
     * Gets the leistungszeitraumEnde value for this RechnungspositionFestpreisType.
     *
     * @return leistungszeitraumEnde   * Das Endedatum des Leistungszeitraumes.
     */
    public String getLeistungszeitraumEnde() {
        return leistungszeitraumEnde;
    }

    /**
     * Sets the leistungszeitraumEnde value for this RechnungspositionFestpreisType.
     *
     * @param leistungszeitraumEnde   * Das Endedatum des Leistungszeitraumes.
     */
    public void setLeistungszeitraumEnde(String leistungszeitraumEnde) {
        this.leistungszeitraumEnde = leistungszeitraumEnde;
    }

    /**
     * Gets the wiederholung value for this RechnungspositionFestpreisType.
     *
     * @return wiederholung   * - leer bzw. nicht eingegeben=keine
     *                 				Wiederholung, - 0=Monatlich Ultimo, -
     *                 				1=Monatlich zum gleichen Datum, -
     *                 				2=3-Monatlich Ultimo, - 3=3-Monatlich
     *                 				zum gleichen Datum, - 4=Jährlich
     */
    public Integer getWiederholung() {
        return wiederholung;
    }

    /**
     * Sets the wiederholung value for this RechnungspositionFestpreisType.
     *
     * @param wiederholung   * - leer bzw. nicht eingegeben=keine
     *                 				Wiederholung, - 0=Monatlich Ultimo, -
     *                 				1=Monatlich zum gleichen Datum, -
     *                 				2=3-Monatlich Ultimo, - 3=3-Monatlich
     *                 				zum gleichen Datum, - 4=Jährlich
     */
    public void setWiederholung(Integer wiederholung) {
        this.wiederholung = wiederholung;
    }

    /**
     * Gets the geplantesRechnungsdatumGleich value for this RechnungspositionFestpreisType.
     *
     * @return geplantesRechnungsdatumGleich   * 0=leistungszeitraumBeginn, 1(default)=leistungszeitraumEnde,
     * siehe Dokumentation von geplantesDatum.
     */
    public Integer getGeplantesRechnungsdatumGleich() {
        return geplantesRechnungsdatumGleich;
    }

    /**
     * Sets the geplantesRechnungsdatumGleich value for this RechnungspositionFestpreisType.
     *
     * @param geplantesRechnungsdatumGleich   * 0=leistungszeitraumBeginn, 1(default)=leistungszeitraumEnde,
     * siehe Dokumentation von geplantesDatum.
     */
    public void setGeplantesRechnungsdatumGleich(Integer geplantesRechnungsdatumGleich) {
        this.geplantesRechnungsdatumGleich = geplantesRechnungsdatumGleich;
    }

    /**
     * Gets the menge value for this RechnungspositionFestpreisType.
     *
     * @return menge   * Menge
     */
    public Double getMenge() {
        return menge;
    }

    /**
     * Sets the menge value for this RechnungspositionFestpreisType.
     *
     * @param menge   * Menge
     */
    public void setMenge(Double menge) {
        this.menge = menge;
    }

    /**
     * Gets the einzelpreis value for this RechnungspositionFestpreisType.
     *
     * @return einzelpreis   * Der Einzelpreis.
     */
    public Double getEinzelpreis() {
        return einzelpreis;
    }

    /**
     * Sets the einzelpreis value for this RechnungspositionFestpreisType.
     *
     * @param einzelpreis   * Der Einzelpreis.
     */
    public void setEinzelpreis(Double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
     * Gets the einheit value for this RechnungspositionFestpreisType.
     *
     * @return einheit   * Die Einheit der Rechnungsposition.
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Sets the einheit value for this RechnungspositionFestpreisType.
     *
     * @param einheit   * Die Einheit der Rechnungsposition.
     */
    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    /**
     * Gets the waehrung value for this RechnungspositionFestpreisType.
     *
     * @return waehrung   * Die Währung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this RechnungspositionFestpreisType.
     *
     * @param waehrung   * Die Währung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the sprache value for this RechnungspositionFestpreisType.
     *
     * @return sprache   * Die verfügbare Sprachen für die Texte
     *                 				die in ZEP ausgegeben werden: z.B. de,
     *                 				en, fr, ch, en_de
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the sprache value for this RechnungspositionFestpreisType.
     *
     * @param sprache   * Die verfügbare Sprachen für die Texte
     *                 				die in ZEP ausgegeben werden: z.B. de,
     *                 				en, fr, ch, en_de
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * Gets the erloeskontoListe value for this RechnungspositionFestpreisType.
     *
     * @return erloeskontoListe   * Das Erlöskonto der Rechnungsposition
     *                 				(bei Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public ErloeskontoType[] getErloeskontoListe() {
        return erloeskontoListe;
    }

    /**
     * Sets the erloeskontoListe value for this RechnungspositionFestpreisType.
     *
     * @param erloeskontoListe   * Das Erlöskonto der Rechnungsposition
     *                 				(bei Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public void setErloeskontoListe(ErloeskontoType[] erloeskontoListe) {
        this.erloeskontoListe = erloeskontoListe;
    }

    /**
     * Gets the status value for this RechnungspositionFestpreisType.
     *
     * @return status   * 0 (default)=geplant, 1=freigegeben
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this RechnungspositionFestpreisType.
     *
     * @param status   * 0 (default)=geplant, 1=freigegeben
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the rechnungstext value for this RechnungspositionFestpreisType.
     *
     * @return rechnungstext   * Der Rechnungstext der Rechnungsposition.
     */
    public String getRechnungstext() {
        return rechnungstext;
    }

    /**
     * Sets the rechnungstext value for this RechnungspositionFestpreisType.
     *
     * @param rechnungstext   * Der Rechnungstext der Rechnungsposition.
     */
    public void setRechnungstext(String rechnungstext) {
        this.rechnungstext = rechnungstext;
    }

    /**
     * Gets the rechnungsdatum value for this RechnungspositionFestpreisType.
     *
     * @return rechnungsdatum
     */
    public String getRechnungsdatum() {
        return rechnungsdatum;
    }

    /**
     * Sets the rechnungsdatum value for this RechnungspositionFestpreisType.
     *
     * @param rechnungsdatum
     */
    public void setRechnungsdatum(String rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    /**
     * Gets the geplantesDatum value for this RechnungspositionFestpreisType.
     *
     * @return geplantesDatum   * Wenn dies nicht null ist, dann gilt dies und nicht mehr die
     * geplantesRechnungsdatumGleich.
     */
    public String getGeplantesDatum() {
        return geplantesDatum;
    }

    /**
     * Sets the geplantesDatum value for this RechnungspositionFestpreisType.
     *
     * @param geplantesDatum   * Wenn dies nicht null ist, dann gilt dies und nicht mehr die
     * geplantesRechnungsdatumGleich.
     */
    public void setGeplantesDatum(String geplantesDatum) {
        this.geplantesDatum = geplantesDatum;
    }

    /**
     * Gets the projektId value for this RechnungspositionFestpreisType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this RechnungspositionFestpreisType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the mwst value for this RechnungspositionFestpreisType.
     *
     * @return mwst
     */
    public Double getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this RechnungspositionFestpreisType.
     *
     * @param mwst
     */
    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the vorgangNr value for this RechnungspositionFestpreisType.
     *
     * @return vorgangNr
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this RechnungspositionFestpreisType.
     *
     * @param vorgangNr
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the vorgangId value for this RechnungspositionFestpreisType.
     *
     * @return vorgangId
     */
    public Integer getVorgangId() {
        return vorgangId;
    }

    /**
     * Sets the vorgangId value for this RechnungspositionFestpreisType.
     *
     * @param vorgangId
     */
    public void setVorgangId(Integer vorgangId) {
        this.vorgangId = vorgangId;
    }

    /**
     * Gets the attributes value for this RechnungspositionFestpreisType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this RechnungspositionFestpreisType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechnungspositionFestpreisType)) return false;
        RechnungspositionFestpreisType other = (RechnungspositionFestpreisType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.leistungszeitraumBeginn == null && other.getLeistungszeitraumBeginn() == null) ||
                        (this.leistungszeitraumBeginn != null &&
                                this.leistungszeitraumBeginn.equals(other.getLeistungszeitraumBeginn()))) &&
                ((this.leistungszeitraumEnde == null && other.getLeistungszeitraumEnde() == null) ||
                        (this.leistungszeitraumEnde != null &&
                                this.leistungszeitraumEnde.equals(other.getLeistungszeitraumEnde()))) &&
                ((this.wiederholung == null && other.getWiederholung() == null) ||
                        (this.wiederholung != null &&
                                this.wiederholung.equals(other.getWiederholung()))) &&
                ((this.geplantesRechnungsdatumGleich == null && other.getGeplantesRechnungsdatumGleich() == null) ||
                        (this.geplantesRechnungsdatumGleich != null &&
                                this.geplantesRechnungsdatumGleich.equals(other.getGeplantesRechnungsdatumGleich()))) &&
                ((this.menge == null && other.getMenge() == null) ||
                        (this.menge != null &&
                                this.menge.equals(other.getMenge()))) &&
                ((this.einzelpreis == null && other.getEinzelpreis() == null) ||
                        (this.einzelpreis != null &&
                                this.einzelpreis.equals(other.getEinzelpreis()))) &&
                ((this.einheit == null && other.getEinheit() == null) ||
                        (this.einheit != null &&
                                this.einheit.equals(other.getEinheit()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.sprache == null && other.getSprache() == null) ||
                        (this.sprache != null &&
                                this.sprache.equals(other.getSprache()))) &&
                ((this.erloeskontoListe == null && other.getErloeskontoListe() == null) ||
                        (this.erloeskontoListe != null &&
                                java.util.Arrays.equals(this.erloeskontoListe, other.getErloeskontoListe()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.rechnungstext == null && other.getRechnungstext() == null) ||
                        (this.rechnungstext != null &&
                                this.rechnungstext.equals(other.getRechnungstext()))) &&
                ((this.rechnungsdatum == null && other.getRechnungsdatum() == null) ||
                        (this.rechnungsdatum != null &&
                                this.rechnungsdatum.equals(other.getRechnungsdatum()))) &&
                ((this.geplantesDatum == null && other.getGeplantesDatum() == null) ||
                        (this.geplantesDatum != null &&
                                this.geplantesDatum.equals(other.getGeplantesDatum()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.mwst == null && other.getMwst() == null) ||
                        (this.mwst != null &&
                                this.mwst.equals(other.getMwst()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.vorgangId == null && other.getVorgangId() == null) ||
                        (this.vorgangId != null &&
                                this.vorgangId.equals(other.getVorgangId()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getLeistungszeitraumBeginn() != null) {
            _hashCode += getLeistungszeitraumBeginn().hashCode();
        }
        if (getLeistungszeitraumEnde() != null) {
            _hashCode += getLeistungszeitraumEnde().hashCode();
        }
        if (getWiederholung() != null) {
            _hashCode += getWiederholung().hashCode();
        }
        if (getGeplantesRechnungsdatumGleich() != null) {
            _hashCode += getGeplantesRechnungsdatumGleich().hashCode();
        }
        if (getMenge() != null) {
            _hashCode += getMenge().hashCode();
        }
        if (getEinzelpreis() != null) {
            _hashCode += getEinzelpreis().hashCode();
        }
        if (getEinheit() != null) {
            _hashCode += getEinheit().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getSprache() != null) {
            _hashCode += getSprache().hashCode();
        }
        if (getErloeskontoListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getErloeskontoListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getErloeskontoListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRechnungstext() != null) {
            _hashCode += getRechnungstext().hashCode();
        }
        if (getRechnungsdatum() != null) {
            _hashCode += getRechnungsdatum().hashCode();
        }
        if (getGeplantesDatum() != null) {
            _hashCode += getGeplantesDatum().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getMwst() != null) {
            _hashCode += getMwst().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getVorgangId() != null) {
            _hashCode += getVorgangId().hashCode();
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
