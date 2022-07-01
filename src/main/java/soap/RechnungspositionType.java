/**
 * RechnungspositionType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Rechnungsposition.
 */
public class RechnungspositionType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RechnungspositionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RechnungspositionType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("rechnungsNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitarbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitarbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("art");
        elemField.setXmlName(new javax.xml.namespace.QName("", "art"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reihenfolge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reihenfolge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enthaeltArbeitszeiten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enthaeltArbeitszeiten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enthaeltBelege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enthaeltBelege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enthaeltReisekosten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enthaeltReisekosten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abgerechneterBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgerechneterBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geplanterBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geplanterBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("vorgang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ArtikelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitarbeiterListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitarbeiterListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userId"));
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
    /* leer bzw. nicht eingegeben = keine
     *                 				Wiederholung, 0 = monatlich Ultimo, 1 =
     *                 				monatlich zum gleichen Datum, 2 = drei
     *                 				monatlich Ultimo, 3 = drei monatlich zum
     *                 				gleichen Datum, 4 = jährlich, 5 = zwei
     *                 				monatlich ultimo, 6 = zwei monatlich, 7
     *                 				= halbes Jahr ultimo, 8 = halbes Jahr */
    private java.math.BigInteger wiederholung;
    /* 0=leistungszeitraumBeginn,
     *                 				1(default)=leistungszeitraumEnde */
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
    /* 0 = geplant 1 = freigegeben 2 =
     *                 				abgerechnet 3 = storniert */
    private Integer status;
    /* Der Rechnungstext der Rechnungsposition. */
    private String rechnungstext;
    /* nur beim abgerechnete Rechnunsposition */
    private String rechnungsNr;
    /* userid der Vorgangsmitarbeiter */
    private String mitarbeiter;
    /* 0=Aufwand, 1=Pauschal , 2=Vorgang,
     *                 				3=Sonstige-Belege, 4=Reise-Pauschalen,
     *                 				5=Ticket, 6=Artikel,
     *                 				15=Abschlag-Prozent, 16=Schluss-Prozent,
     *                 				99=Prozent */
    private Integer art;
    private String reihenfolge;
    private Boolean enthaeltArbeitszeiten;
    private Boolean enthaeltBelege;
    private Boolean enthaeltReisekosten;
    /* ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet. */
    private Double abgerechneterBetrag;
    /* ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet. */
    private Double geplanterBetrag;
    private String rechnungsdatum;
    private String geplantesDatum;
    private Integer projektId;
    private Double mwst;
    private VorgangType vorgang;
    private TicketType ticket;
    private ArtikelType artikel;
    private String[] mitarbeiterListe;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RechnungspositionType() {
    }


    public RechnungspositionType(
            Integer id,
            String projektNr,
            String kundenNr,
            String leistungszeitraumBeginn,
            String leistungszeitraumEnde,
            java.math.BigInteger wiederholung,
            Integer geplantesRechnungsdatumGleich,
            Double menge,
            Double einzelpreis,
            String einheit,
            String waehrung,
            String sprache,
            ErloeskontoType[] erloeskontoListe,
            Integer status,
            String rechnungstext,
            String rechnungsNr,
            String mitarbeiter,
            Integer art,
            String reihenfolge,
            Boolean enthaeltArbeitszeiten,
            Boolean enthaeltBelege,
            Boolean enthaeltReisekosten,
            Double abgerechneterBetrag,
            Double geplanterBetrag,
            String rechnungsdatum,
            String geplantesDatum,
            Integer projektId,
            Double mwst,
            VorgangType vorgang,
            TicketType ticket,
            ArtikelType artikel,
            String[] mitarbeiterListe,
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
        this.rechnungsNr = rechnungsNr;
        this.mitarbeiter = mitarbeiter;
        this.art = art;
        this.reihenfolge = reihenfolge;
        this.enthaeltArbeitszeiten = enthaeltArbeitszeiten;
        this.enthaeltBelege = enthaeltBelege;
        this.enthaeltReisekosten = enthaeltReisekosten;
        this.abgerechneterBetrag = abgerechneterBetrag;
        this.geplanterBetrag = geplanterBetrag;
        this.rechnungsdatum = rechnungsdatum;
        this.geplantesDatum = geplantesDatum;
        this.projektId = projektId;
        this.mwst = mwst;
        this.vorgang = vorgang;
        this.ticket = ticket;
        this.artikel = artikel;
        this.mitarbeiterListe = mitarbeiterListe;
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
     * Gets the id value for this RechnungspositionType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this RechnungspositionType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this RechnungspositionType.
     *
     * @return projektNr   * Die Nummer des Projektes.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this RechnungspositionType.
     *
     * @param projektNr   * Die Nummer des Projektes.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the kundenNr value for this RechnungspositionType.
     *
     * @return kundenNr   * Die Nummer des Kunden.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this RechnungspositionType.
     *
     * @param kundenNr   * Die Nummer des Kunden.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the leistungszeitraumBeginn value for this RechnungspositionType.
     *
     * @return leistungszeitraumBeginn   * Das Anfagsdatum des Leistungszeitraumes.
     */
    public String getLeistungszeitraumBeginn() {
        return leistungszeitraumBeginn;
    }

    /**
     * Sets the leistungszeitraumBeginn value for this RechnungspositionType.
     *
     * @param leistungszeitraumBeginn   * Das Anfagsdatum des Leistungszeitraumes.
     */
    public void setLeistungszeitraumBeginn(String leistungszeitraumBeginn) {
        this.leistungszeitraumBeginn = leistungszeitraumBeginn;
    }

    /**
     * Gets the leistungszeitraumEnde value for this RechnungspositionType.
     *
     * @return leistungszeitraumEnde   * Das Endedatum des Leistungszeitraumes.
     */
    public String getLeistungszeitraumEnde() {
        return leistungszeitraumEnde;
    }

    /**
     * Sets the leistungszeitraumEnde value for this RechnungspositionType.
     *
     * @param leistungszeitraumEnde   * Das Endedatum des Leistungszeitraumes.
     */
    public void setLeistungszeitraumEnde(String leistungszeitraumEnde) {
        this.leistungszeitraumEnde = leistungszeitraumEnde;
    }

    /**
     * Gets the wiederholung value for this RechnungspositionType.
     *
     * @return wiederholung   * leer bzw. nicht eingegeben = keine
     *                 				Wiederholung, 0 = monatlich Ultimo, 1 =
     *                 				monatlich zum gleichen Datum, 2 = drei
     *                 				monatlich Ultimo, 3 = drei monatlich zum
     *                 				gleichen Datum, 4 = jährlich, 5 = zwei
     *                 				monatlich ultimo, 6 = zwei monatlich, 7
     *                 				= halbes Jahr ultimo, 8 = halbes Jahr
     */
    public java.math.BigInteger getWiederholung() {
        return wiederholung;
    }

    /**
     * Sets the wiederholung value for this RechnungspositionType.
     *
     * @param wiederholung   * leer bzw. nicht eingegeben = keine
     *                 				Wiederholung, 0 = monatlich Ultimo, 1 =
     *                 				monatlich zum gleichen Datum, 2 = drei
     *                 				monatlich Ultimo, 3 = drei monatlich zum
     *                 				gleichen Datum, 4 = jährlich, 5 = zwei
     *                 				monatlich ultimo, 6 = zwei monatlich, 7
     *                 				= halbes Jahr ultimo, 8 = halbes Jahr
     */
    public void setWiederholung(java.math.BigInteger wiederholung) {
        this.wiederholung = wiederholung;
    }

    /**
     * Gets the geplantesRechnungsdatumGleich value for this RechnungspositionType.
     *
     * @return geplantesRechnungsdatumGleich   * 0=leistungszeitraumBeginn,
     *                 				1(default)=leistungszeitraumEnde
     */
    public Integer getGeplantesRechnungsdatumGleich() {
        return geplantesRechnungsdatumGleich;
    }

    /**
     * Sets the geplantesRechnungsdatumGleich value for this RechnungspositionType.
     *
     * @param geplantesRechnungsdatumGleich   * 0=leistungszeitraumBeginn,
     *                 				1(default)=leistungszeitraumEnde
     */
    public void setGeplantesRechnungsdatumGleich(Integer geplantesRechnungsdatumGleich) {
        this.geplantesRechnungsdatumGleich = geplantesRechnungsdatumGleich;
    }

    /**
     * Gets the menge value for this RechnungspositionType.
     *
     * @return menge   * Menge
     */
    public Double getMenge() {
        return menge;
    }

    /**
     * Sets the menge value for this RechnungspositionType.
     *
     * @param menge   * Menge
     */
    public void setMenge(Double menge) {
        this.menge = menge;
    }

    /**
     * Gets the einzelpreis value for this RechnungspositionType.
     *
     * @return einzelpreis   * Der Einzelpreis.
     */
    public Double getEinzelpreis() {
        return einzelpreis;
    }

    /**
     * Sets the einzelpreis value for this RechnungspositionType.
     *
     * @param einzelpreis   * Der Einzelpreis.
     */
    public void setEinzelpreis(Double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
     * Gets the einheit value for this RechnungspositionType.
     *
     * @return einheit   * Die Einheit der Rechnungsposition.
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Sets the einheit value for this RechnungspositionType.
     *
     * @param einheit   * Die Einheit der Rechnungsposition.
     */
    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    /**
     * Gets the waehrung value for this RechnungspositionType.
     *
     * @return waehrung   * Die Währung.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this RechnungspositionType.
     *
     * @param waehrung   * Die Währung.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the sprache value for this RechnungspositionType.
     *
     * @return sprache   * Die verfügbare Sprachen für die Texte
     *                 				die in ZEP ausgegeben werden: z.B. de,
     *                 				en, fr, ch, en_de
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the sprache value for this RechnungspositionType.
     *
     * @param sprache   * Die verfügbare Sprachen für die Texte
     *                 				die in ZEP ausgegeben werden: z.B. de,
     *                 				en, fr, ch, en_de
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * Gets the erloeskontoListe value for this RechnungspositionType.
     *
     * @return erloeskontoListe   * Das Erlöskonto der Rechnungsposition
     *                 				(bei Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public ErloeskontoType[] getErloeskontoListe() {
        return erloeskontoListe;
    }

    /**
     * Sets the erloeskontoListe value for this RechnungspositionType.
     *
     * @param erloeskontoListe   * Das Erlöskonto der Rechnungsposition
     *                 				(bei Einsatz des Moduls 'Export für
     *                 				Buchhaltung').
     */
    public void setErloeskontoListe(ErloeskontoType[] erloeskontoListe) {
        this.erloeskontoListe = erloeskontoListe;
    }

    /**
     * Gets the status value for this RechnungspositionType.
     *
     * @return status   * 0 = geplant 1 = freigegeben 2 =
     *                 				abgerechnet 3 = storniert
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this RechnungspositionType.
     *
     * @param status   * 0 = geplant 1 = freigegeben 2 =
     *                 				abgerechnet 3 = storniert
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the rechnungstext value for this RechnungspositionType.
     *
     * @return rechnungstext   * Der Rechnungstext der Rechnungsposition.
     */
    public String getRechnungstext() {
        return rechnungstext;
    }

    /**
     * Sets the rechnungstext value for this RechnungspositionType.
     *
     * @param rechnungstext   * Der Rechnungstext der Rechnungsposition.
     */
    public void setRechnungstext(String rechnungstext) {
        this.rechnungstext = rechnungstext;
    }

    /**
     * Gets the rechnungsNr value for this RechnungspositionType.
     *
     * @return rechnungsNr   * nur beim abgerechnete Rechnunsposition
     */
    public String getRechnungsNr() {
        return rechnungsNr;
    }

    /**
     * Sets the rechnungsNr value for this RechnungspositionType.
     *
     * @param rechnungsNr   * nur beim abgerechnete Rechnunsposition
     */
    public void setRechnungsNr(String rechnungsNr) {
        this.rechnungsNr = rechnungsNr;
    }

    /**
     * Gets the mitarbeiter value for this RechnungspositionType.
     *
     * @return mitarbeiter   * userid der Vorgangsmitarbeiter
     */
    public String getMitarbeiter() {
        return mitarbeiter;
    }

    /**
     * Sets the mitarbeiter value for this RechnungspositionType.
     *
     * @param mitarbeiter   * userid der Vorgangsmitarbeiter
     */
    public void setMitarbeiter(String mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    /**
     * Gets the art value for this RechnungspositionType.
     *
     * @return art   * 0=Aufwand, 1=Pauschal , 2=Vorgang,
     *                 				3=Sonstige-Belege, 4=Reise-Pauschalen,
     *                 				5=Ticket, 6=Artikel,
     *                 				15=Abschlag-Prozent, 16=Schluss-Prozent,
     *                 				99=Prozent
     */
    public Integer getArt() {
        return art;
    }

    /**
     * Sets the art value for this RechnungspositionType.
     *
     * @param art   * 0=Aufwand, 1=Pauschal , 2=Vorgang,
     *                 				3=Sonstige-Belege, 4=Reise-Pauschalen,
     *                 				5=Ticket, 6=Artikel,
     *                 				15=Abschlag-Prozent, 16=Schluss-Prozent,
     *                 				99=Prozent
     */
    public void setArt(Integer art) {
        this.art = art;
    }

    /**
     * Gets the reihenfolge value for this RechnungspositionType.
     *
     * @return reihenfolge
     */
    public String getReihenfolge() {
        return reihenfolge;
    }

    /**
     * Sets the reihenfolge value for this RechnungspositionType.
     *
     * @param reihenfolge
     */
    public void setReihenfolge(String reihenfolge) {
        this.reihenfolge = reihenfolge;
    }

    /**
     * Gets the enthaeltArbeitszeiten value for this RechnungspositionType.
     *
     * @return enthaeltArbeitszeiten
     */
    public Boolean getEnthaeltArbeitszeiten() {
        return enthaeltArbeitszeiten;
    }

    /**
     * Sets the enthaeltArbeitszeiten value for this RechnungspositionType.
     *
     * @param enthaeltArbeitszeiten
     */
    public void setEnthaeltArbeitszeiten(Boolean enthaeltArbeitszeiten) {
        this.enthaeltArbeitszeiten = enthaeltArbeitszeiten;
    }

    /**
     * Gets the enthaeltBelege value for this RechnungspositionType.
     *
     * @return enthaeltBelege
     */
    public Boolean getEnthaeltBelege() {
        return enthaeltBelege;
    }

    /**
     * Sets the enthaeltBelege value for this RechnungspositionType.
     *
     * @param enthaeltBelege
     */
    public void setEnthaeltBelege(Boolean enthaeltBelege) {
        this.enthaeltBelege = enthaeltBelege;
    }

    /**
     * Gets the enthaeltReisekosten value for this RechnungspositionType.
     *
     * @return enthaeltReisekosten
     */
    public Boolean getEnthaeltReisekosten() {
        return enthaeltReisekosten;
    }

    /**
     * Sets the enthaeltReisekosten value for this RechnungspositionType.
     *
     * @param enthaeltReisekosten
     */
    public void setEnthaeltReisekosten(Boolean enthaeltReisekosten) {
        this.enthaeltReisekosten = enthaeltReisekosten;
    }

    /**
     * Gets the abgerechneterBetrag value for this RechnungspositionType.
     *
     * @return abgerechneterBetrag   * ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet.
     */
    public Double getAbgerechneterBetrag() {
        return abgerechneterBetrag;
    }

    /**
     * Sets the abgerechneterBetrag value for this RechnungspositionType.
     *
     * @param abgerechneterBetrag   * ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet.
     */
    public void setAbgerechneterBetrag(Double abgerechneterBetrag) {
        this.abgerechneterBetrag = abgerechneterBetrag;
    }

    /**
     * Gets the geplanterBetrag value for this RechnungspositionType.
     *
     * @return geplanterBetrag   * ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet.
     */
    public Double getGeplanterBetrag() {
        return geplanterBetrag;
    }

    /**
     * Sets the geplanterBetrag value for this RechnungspositionType.
     *
     * @param geplanterBetrag   * ist immer als Netto. Nur zum Lesen da,
     *                 				wird via SOAP nicht erstellt oder
     *                 				bearbeitet.
     */
    public void setGeplanterBetrag(Double geplanterBetrag) {
        this.geplanterBetrag = geplanterBetrag;
    }

    /**
     * Gets the rechnungsdatum value for this RechnungspositionType.
     *
     * @return rechnungsdatum
     */
    public String getRechnungsdatum() {
        return rechnungsdatum;
    }

    /**
     * Sets the rechnungsdatum value for this RechnungspositionType.
     *
     * @param rechnungsdatum
     */
    public void setRechnungsdatum(String rechnungsdatum) {
        this.rechnungsdatum = rechnungsdatum;
    }

    /**
     * Gets the geplantesDatum value for this RechnungspositionType.
     *
     * @return geplantesDatum
     */
    public String getGeplantesDatum() {
        return geplantesDatum;
    }

    /**
     * Sets the geplantesDatum value for this RechnungspositionType.
     *
     * @param geplantesDatum
     */
    public void setGeplantesDatum(String geplantesDatum) {
        this.geplantesDatum = geplantesDatum;
    }

    /**
     * Gets the projektId value for this RechnungspositionType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this RechnungspositionType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the mwst value for this RechnungspositionType.
     *
     * @return mwst
     */
    public Double getMwst() {
        return mwst;
    }

    /**
     * Sets the mwst value for this RechnungspositionType.
     *
     * @param mwst
     */
    public void setMwst(Double mwst) {
        this.mwst = mwst;
    }

    /**
     * Gets the vorgang value for this RechnungspositionType.
     *
     * @return vorgang
     */
    public VorgangType getVorgang() {
        return vorgang;
    }

    /**
     * Sets the vorgang value for this RechnungspositionType.
     *
     * @param vorgang
     */
    public void setVorgang(VorgangType vorgang) {
        this.vorgang = vorgang;
    }

    /**
     * Gets the ticket value for this RechnungspositionType.
     *
     * @return ticket
     */
    public TicketType getTicket() {
        return ticket;
    }

    /**
     * Sets the ticket value for this RechnungspositionType.
     *
     * @param ticket
     */
    public void setTicket(TicketType ticket) {
        this.ticket = ticket;
    }

    /**
     * Gets the artikel value for this RechnungspositionType.
     *
     * @return artikel
     */
    public ArtikelType getArtikel() {
        return artikel;
    }

    /**
     * Sets the artikel value for this RechnungspositionType.
     *
     * @param artikel
     */
    public void setArtikel(ArtikelType artikel) {
        this.artikel = artikel;
    }

    /**
     * Gets the mitarbeiterListe value for this RechnungspositionType.
     *
     * @return mitarbeiterListe
     */
    public String[] getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    /**
     * Sets the mitarbeiterListe value for this RechnungspositionType.
     *
     * @param mitarbeiterListe
     */
    public void setMitarbeiterListe(String[] mitarbeiterListe) {
        this.mitarbeiterListe = mitarbeiterListe;
    }

    /**
     * Gets the attributes value for this RechnungspositionType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this RechnungspositionType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechnungspositionType)) return false;
        RechnungspositionType other = (RechnungspositionType) obj;
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
                ((this.rechnungsNr == null && other.getRechnungsNr() == null) ||
                        (this.rechnungsNr != null &&
                                this.rechnungsNr.equals(other.getRechnungsNr()))) &&
                ((this.mitarbeiter == null && other.getMitarbeiter() == null) ||
                        (this.mitarbeiter != null &&
                                this.mitarbeiter.equals(other.getMitarbeiter()))) &&
                ((this.art == null && other.getArt() == null) ||
                        (this.art != null &&
                                this.art.equals(other.getArt()))) &&
                ((this.reihenfolge == null && other.getReihenfolge() == null) ||
                        (this.reihenfolge != null &&
                                this.reihenfolge.equals(other.getReihenfolge()))) &&
                ((this.enthaeltArbeitszeiten == null && other.getEnthaeltArbeitszeiten() == null) ||
                        (this.enthaeltArbeitszeiten != null &&
                                this.enthaeltArbeitszeiten.equals(other.getEnthaeltArbeitszeiten()))) &&
                ((this.enthaeltBelege == null && other.getEnthaeltBelege() == null) ||
                        (this.enthaeltBelege != null &&
                                this.enthaeltBelege.equals(other.getEnthaeltBelege()))) &&
                ((this.enthaeltReisekosten == null && other.getEnthaeltReisekosten() == null) ||
                        (this.enthaeltReisekosten != null &&
                                this.enthaeltReisekosten.equals(other.getEnthaeltReisekosten()))) &&
                ((this.abgerechneterBetrag == null && other.getAbgerechneterBetrag() == null) ||
                        (this.abgerechneterBetrag != null &&
                                this.abgerechneterBetrag.equals(other.getAbgerechneterBetrag()))) &&
                ((this.geplanterBetrag == null && other.getGeplanterBetrag() == null) ||
                        (this.geplanterBetrag != null &&
                                this.geplanterBetrag.equals(other.getGeplanterBetrag()))) &&
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
                ((this.vorgang == null && other.getVorgang() == null) ||
                        (this.vorgang != null &&
                                this.vorgang.equals(other.getVorgang()))) &&
                ((this.ticket == null && other.getTicket() == null) ||
                        (this.ticket != null &&
                                this.ticket.equals(other.getTicket()))) &&
                ((this.artikel == null && other.getArtikel() == null) ||
                        (this.artikel != null &&
                                this.artikel.equals(other.getArtikel()))) &&
                ((this.mitarbeiterListe == null && other.getMitarbeiterListe() == null) ||
                        (this.mitarbeiterListe != null &&
                                java.util.Arrays.equals(this.mitarbeiterListe, other.getMitarbeiterListe()))) &&
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
        if (getRechnungsNr() != null) {
            _hashCode += getRechnungsNr().hashCode();
        }
        if (getMitarbeiter() != null) {
            _hashCode += getMitarbeiter().hashCode();
        }
        if (getArt() != null) {
            _hashCode += getArt().hashCode();
        }
        if (getReihenfolge() != null) {
            _hashCode += getReihenfolge().hashCode();
        }
        if (getEnthaeltArbeitszeiten() != null) {
            _hashCode += getEnthaeltArbeitszeiten().hashCode();
        }
        if (getEnthaeltBelege() != null) {
            _hashCode += getEnthaeltBelege().hashCode();
        }
        if (getEnthaeltReisekosten() != null) {
            _hashCode += getEnthaeltReisekosten().hashCode();
        }
        if (getAbgerechneterBetrag() != null) {
            _hashCode += getAbgerechneterBetrag().hashCode();
        }
        if (getGeplanterBetrag() != null) {
            _hashCode += getGeplanterBetrag().hashCode();
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
        if (getVorgang() != null) {
            _hashCode += getVorgang().hashCode();
        }
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        if (getArtikel() != null) {
            _hashCode += getArtikel().hashCode();
        }
        if (getMitarbeiterListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMitarbeiterListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMitarbeiterListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
