/**
 * TeilaufgabeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer Teilaufgabe.
 */
public class TeilaufgabeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TeilaufgabeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TeilaufgabeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betreff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betreff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenReferenz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenReferenz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenAnsprechpartner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenAnsprechpartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnsprechpartnerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ersteller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ersteller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bearbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bearbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eingangsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eingangsdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planstunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planstunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ueberbuchenVerhindern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ueberbuchenVerhindern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("anhangListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anhangListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "anhang"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
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
        elemField.setFieldName("inbearbeitungdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inbearbeitungdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fertigdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fertigdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyUpdatedatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyUpdatedatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SchlagwortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benutzer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "benutzer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istStundenFakt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istStundenFakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Nummer des Tickets, zu dem die
     *                 				Teilaufgabe gehört. */
    private int ticketNr;
    /* Die Nummer der Teilaufgabe. */
    private String teilaufgabeNr;
    /* Der Betreff der Teilaufgabe. */
    private String betreff;
    /* Die Kundenreferenz. */
    private String kundenReferenz;
    /* Die Id des Kundenansprechpartners. */
    private AnsprechpartnerType kundenAnsprechpartner;
    /* Der Benutzername des Erstellers. */
    private String ersteller;
    /* Der Benutzername des Bearbeiters. */
    private String bearbeiter;
    /* Das Startdatum der Teilaufgabe. */
    private String startdatum;
    /* Der Termin der Teilaufgabe. */
    private String termin;
    /* Das Eingangsdatum der Teilaufgabe. */
    private String eingangsdatum;
    /* Der geplante Aufwand der Teilaufgabe (in
     *                 				Stunden). */
    private Double planstunden;
    /* 0: Nein 1: nur fakturierbare Zeiten
     *                 				(inkl. Reisezeiten) 2: fakturierbare und
     *                 				nicht fakturierbare Zeiten (inkl.
     *                 				Reisezeiten) 3: nur fakturierbare Zeiten
     *                 				(ohne Reisezeiten) 4: fakturierbare und
     *                 				nicht fakturierbare Zeiten (ohne
     *                 				Reisezeiten) */
    private Integer ueberbuchenVerhindern;
    /* Ene Bemerkung zur Teilaufgabe. */
    private String bemerkung;
    /* Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				rest wird ignoriert. */
    private AnhangType[] anhangListe;
    private KategorieListeType kategorieListe;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des
     *                 				Objekts. */
    private String modified;
    /* Nur fürs Lesen. */
    private String inbearbeitungdatum;
    /* Nur fürs Lesen. */
    private String fertigdatum;
    /* Nur fürs Lesen. */
    private String historyUpdatedatum;
    private SchlagwortType[] schlagworteListe;
    /* gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für diesee
     *                 				Teilaufgabe überprüft. */
    private String benutzer;
    private Float istStunden;
    private Float istStundenFakt;
    /* Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen). */
    private Integer status;
    /* 0..1 Attribute für kundenspezifische
     *                 				Erweiterungen. */
    private AttributeType[] attribues;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TeilaufgabeType() {
    }


    public TeilaufgabeType(
            int ticketNr,
            String teilaufgabeNr,
            String betreff,
            String kundenReferenz,
            AnsprechpartnerType kundenAnsprechpartner,
            String ersteller,
            String bearbeiter,
            String startdatum,
            String termin,
            String eingangsdatum,
            Double planstunden,
            Integer ueberbuchenVerhindern,
            String bemerkung,
            AnhangType[] anhangListe,
            KategorieListeType kategorieListe,
            String created,
            String modified,
            String inbearbeitungdatum,
            String fertigdatum,
            String historyUpdatedatum,
            SchlagwortType[] schlagworteListe,
            String benutzer,
            Float istStunden,
            Float istStundenFakt,
            Integer status,
            AttributeType[] attribues) {
        this.ticketNr = ticketNr;
        this.teilaufgabeNr = teilaufgabeNr;
        this.betreff = betreff;
        this.kundenReferenz = kundenReferenz;
        this.kundenAnsprechpartner = kundenAnsprechpartner;
        this.ersteller = ersteller;
        this.bearbeiter = bearbeiter;
        this.startdatum = startdatum;
        this.termin = termin;
        this.eingangsdatum = eingangsdatum;
        this.planstunden = planstunden;
        this.ueberbuchenVerhindern = ueberbuchenVerhindern;
        this.bemerkung = bemerkung;
        this.anhangListe = anhangListe;
        this.kategorieListe = kategorieListe;
        this.created = created;
        this.modified = modified;
        this.inbearbeitungdatum = inbearbeitungdatum;
        this.fertigdatum = fertigdatum;
        this.historyUpdatedatum = historyUpdatedatum;
        this.schlagworteListe = schlagworteListe;
        this.benutzer = benutzer;
        this.istStunden = istStunden;
        this.istStundenFakt = istStundenFakt;
        this.status = status;
        this.attribues = attribues;
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
     * Gets the ticketNr value for this TeilaufgabeType.
     *
     * @return ticketNr   * Die Nummer des Tickets, zu dem die
     *                 				Teilaufgabe gehört.
     */
    public int getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this TeilaufgabeType.
     *
     * @param ticketNr   * Die Nummer des Tickets, zu dem die
     *                 				Teilaufgabe gehört.
     */
    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the teilaufgabeNr value for this TeilaufgabeType.
     *
     * @return teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public String getTeilaufgabeNr() {
        return teilaufgabeNr;
    }

    /**
     * Sets the teilaufgabeNr value for this TeilaufgabeType.
     *
     * @param teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public void setTeilaufgabeNr(String teilaufgabeNr) {
        this.teilaufgabeNr = teilaufgabeNr;
    }

    /**
     * Gets the betreff value for this TeilaufgabeType.
     *
     * @return betreff   * Der Betreff der Teilaufgabe.
     */
    public String getBetreff() {
        return betreff;
    }

    /**
     * Sets the betreff value for this TeilaufgabeType.
     *
     * @param betreff   * Der Betreff der Teilaufgabe.
     */
    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    /**
     * Gets the kundenReferenz value for this TeilaufgabeType.
     *
     * @return kundenReferenz   * Die Kundenreferenz.
     */
    public String getKundenReferenz() {
        return kundenReferenz;
    }

    /**
     * Sets the kundenReferenz value for this TeilaufgabeType.
     *
     * @param kundenReferenz   * Die Kundenreferenz.
     */
    public void setKundenReferenz(String kundenReferenz) {
        this.kundenReferenz = kundenReferenz;
    }

    /**
     * Gets the kundenAnsprechpartner value for this TeilaufgabeType.
     *
     * @return kundenAnsprechpartner   * Die Id des Kundenansprechpartners.
     */
    public AnsprechpartnerType getKundenAnsprechpartner() {
        return kundenAnsprechpartner;
    }

    /**
     * Sets the kundenAnsprechpartner value for this TeilaufgabeType.
     *
     * @param kundenAnsprechpartner   * Die Id des Kundenansprechpartners.
     */
    public void setKundenAnsprechpartner(AnsprechpartnerType kundenAnsprechpartner) {
        this.kundenAnsprechpartner = kundenAnsprechpartner;
    }

    /**
     * Gets the ersteller value for this TeilaufgabeType.
     *
     * @return ersteller   * Der Benutzername des Erstellers.
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the ersteller value for this TeilaufgabeType.
     *
     * @param ersteller   * Der Benutzername des Erstellers.
     */
    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    /**
     * Gets the bearbeiter value for this TeilaufgabeType.
     *
     * @return bearbeiter   * Der Benutzername des Bearbeiters.
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this TeilaufgabeType.
     *
     * @param bearbeiter   * Der Benutzername des Bearbeiters.
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the startdatum value for this TeilaufgabeType.
     *
     * @return startdatum   * Das Startdatum der Teilaufgabe.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this TeilaufgabeType.
     *
     * @param startdatum   * Das Startdatum der Teilaufgabe.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the termin value for this TeilaufgabeType.
     *
     * @return termin   * Der Termin der Teilaufgabe.
     */
    public String getTermin() {
        return termin;
    }

    /**
     * Sets the termin value for this TeilaufgabeType.
     *
     * @param termin   * Der Termin der Teilaufgabe.
     */
    public void setTermin(String termin) {
        this.termin = termin;
    }

    /**
     * Gets the eingangsdatum value for this TeilaufgabeType.
     *
     * @return eingangsdatum   * Das Eingangsdatum der Teilaufgabe.
     */
    public String getEingangsdatum() {
        return eingangsdatum;
    }

    /**
     * Sets the eingangsdatum value for this TeilaufgabeType.
     *
     * @param eingangsdatum   * Das Eingangsdatum der Teilaufgabe.
     */
    public void setEingangsdatum(String eingangsdatum) {
        this.eingangsdatum = eingangsdatum;
    }

    /**
     * Gets the planstunden value for this TeilaufgabeType.
     *
     * @return planstunden   * Der geplante Aufwand der Teilaufgabe (in
     *                 				Stunden).
     */
    public Double getPlanstunden() {
        return planstunden;
    }

    /**
     * Sets the planstunden value for this TeilaufgabeType.
     *
     * @param planstunden   * Der geplante Aufwand der Teilaufgabe (in
     *                 				Stunden).
     */
    public void setPlanstunden(Double planstunden) {
        this.planstunden = planstunden;
    }

    /**
     * Gets the ueberbuchenVerhindern value for this TeilaufgabeType.
     *
     * @return ueberbuchenVerhindern   * 0: Nein 1: nur fakturierbare Zeiten
     *                 				(inkl. Reisezeiten) 2: fakturierbare und
     *                 				nicht fakturierbare Zeiten (inkl.
     *                 				Reisezeiten) 3: nur fakturierbare Zeiten
     *                 				(ohne Reisezeiten) 4: fakturierbare und
     *                 				nicht fakturierbare Zeiten (ohne
     *                 				Reisezeiten)
     */
    public Integer getUeberbuchenVerhindern() {
        return ueberbuchenVerhindern;
    }

    /**
     * Sets the ueberbuchenVerhindern value for this TeilaufgabeType.
     *
     * @param ueberbuchenVerhindern   * 0: Nein 1: nur fakturierbare Zeiten
     *                 				(inkl. Reisezeiten) 2: fakturierbare und
     *                 				nicht fakturierbare Zeiten (inkl.
     *                 				Reisezeiten) 3: nur fakturierbare Zeiten
     *                 				(ohne Reisezeiten) 4: fakturierbare und
     *                 				nicht fakturierbare Zeiten (ohne
     *                 				Reisezeiten)
     */
    public void setUeberbuchenVerhindern(Integer ueberbuchenVerhindern) {
        this.ueberbuchenVerhindern = ueberbuchenVerhindern;
    }

    /**
     * Gets the bemerkung value for this TeilaufgabeType.
     *
     * @return bemerkung   * Ene Bemerkung zur Teilaufgabe.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this TeilaufgabeType.
     *
     * @param bemerkung   * Ene Bemerkung zur Teilaufgabe.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the anhangListe value for this TeilaufgabeType.
     *
     * @return anhangListe   * Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				rest wird ignoriert.
     */
    public AnhangType[] getAnhangListe() {
        return anhangListe;
    }

    /**
     * Sets the anhangListe value for this TeilaufgabeType.
     *
     * @param anhangListe   * Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				rest wird ignoriert.
     */
    public void setAnhangListe(AnhangType[] anhangListe) {
        this.anhangListe = anhangListe;
    }

    /**
     * Gets the kategorieListe value for this TeilaufgabeType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this TeilaufgabeType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the created value for this TeilaufgabeType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this TeilaufgabeType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this TeilaufgabeType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this TeilaufgabeType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the inbearbeitungdatum value for this TeilaufgabeType.
     *
     * @return inbearbeitungdatum   * Nur fürs Lesen.
     */
    public String getInbearbeitungdatum() {
        return inbearbeitungdatum;
    }

    /**
     * Sets the inbearbeitungdatum value for this TeilaufgabeType.
     *
     * @param inbearbeitungdatum   * Nur fürs Lesen.
     */
    public void setInbearbeitungdatum(String inbearbeitungdatum) {
        this.inbearbeitungdatum = inbearbeitungdatum;
    }

    /**
     * Gets the fertigdatum value for this TeilaufgabeType.
     *
     * @return fertigdatum   * Nur fürs Lesen.
     */
    public String getFertigdatum() {
        return fertigdatum;
    }

    /**
     * Sets the fertigdatum value for this TeilaufgabeType.
     *
     * @param fertigdatum   * Nur fürs Lesen.
     */
    public void setFertigdatum(String fertigdatum) {
        this.fertigdatum = fertigdatum;
    }

    /**
     * Gets the historyUpdatedatum value for this TeilaufgabeType.
     *
     * @return historyUpdatedatum   * Nur fürs Lesen.
     */
    public String getHistoryUpdatedatum() {
        return historyUpdatedatum;
    }

    /**
     * Sets the historyUpdatedatum value for this TeilaufgabeType.
     *
     * @param historyUpdatedatum   * Nur fürs Lesen.
     */
    public void setHistoryUpdatedatum(String historyUpdatedatum) {
        this.historyUpdatedatum = historyUpdatedatum;
    }

    /**
     * Gets the schlagworteListe value for this TeilaufgabeType.
     *
     * @return schlagworteListe
     */
    public SchlagwortType[] getSchlagworteListe() {
        return schlagworteListe;
    }

    /**
     * Sets the schlagworteListe value for this TeilaufgabeType.
     *
     * @param schlagworteListe
     */
    public void setSchlagworteListe(SchlagwortType[] schlagworteListe) {
        this.schlagworteListe = schlagworteListe;
    }

    /**
     * Gets the benutzer value for this TeilaufgabeType.
     *
     * @return benutzer   * gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für diesee
     *                 				Teilaufgabe überprüft.
     */
    public String getBenutzer() {
        return benutzer;
    }

    /**
     * Sets the benutzer value for this TeilaufgabeType.
     *
     * @param benutzer   * gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für diesee
     *                 				Teilaufgabe überprüft.
     */
    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }

    /**
     * Gets the istStunden value for this TeilaufgabeType.
     *
     * @return istStunden
     */
    public Float getIstStunden() {
        return istStunden;
    }

    /**
     * Sets the istStunden value for this TeilaufgabeType.
     *
     * @param istStunden
     */
    public void setIstStunden(Float istStunden) {
        this.istStunden = istStunden;
    }

    /**
     * Gets the istStundenFakt value for this TeilaufgabeType.
     *
     * @return istStundenFakt
     */
    public Float getIstStundenFakt() {
        return istStundenFakt;
    }

    /**
     * Sets the istStundenFakt value for this TeilaufgabeType.
     *
     * @param istStundenFakt
     */
    public void setIstStundenFakt(Float istStundenFakt) {
        this.istStundenFakt = istStundenFakt;
    }

    /**
     * Gets the status value for this TeilaufgabeType.
     *
     * @return status   * Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen).
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this TeilaufgabeType.
     *
     * @param status   * Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen).
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the attribues value for this TeilaufgabeType.
     *
     * @return attribues   * 0..1 Attribute für kundenspezifische
     *                 				Erweiterungen.
     */
    public AttributeType[] getAttribues() {
        return attribues;
    }

    /**
     * Sets the attribues value for this TeilaufgabeType.
     *
     * @param attribues   * 0..1 Attribute für kundenspezifische
     *                 				Erweiterungen.
     */
    public void setAttribues(AttributeType[] attribues) {
        this.attribues = attribues;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TeilaufgabeType)) return false;
        TeilaufgabeType other = (TeilaufgabeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.ticketNr == other.getTicketNr() &&
                ((this.teilaufgabeNr == null && other.getTeilaufgabeNr() == null) ||
                        (this.teilaufgabeNr != null &&
                                this.teilaufgabeNr.equals(other.getTeilaufgabeNr()))) &&
                ((this.betreff == null && other.getBetreff() == null) ||
                        (this.betreff != null &&
                                this.betreff.equals(other.getBetreff()))) &&
                ((this.kundenReferenz == null && other.getKundenReferenz() == null) ||
                        (this.kundenReferenz != null &&
                                this.kundenReferenz.equals(other.getKundenReferenz()))) &&
                ((this.kundenAnsprechpartner == null && other.getKundenAnsprechpartner() == null) ||
                        (this.kundenAnsprechpartner != null &&
                                this.kundenAnsprechpartner.equals(other.getKundenAnsprechpartner()))) &&
                ((this.ersteller == null && other.getErsteller() == null) ||
                        (this.ersteller != null &&
                                this.ersteller.equals(other.getErsteller()))) &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
                ((this.termin == null && other.getTermin() == null) ||
                        (this.termin != null &&
                                this.termin.equals(other.getTermin()))) &&
                ((this.eingangsdatum == null && other.getEingangsdatum() == null) ||
                        (this.eingangsdatum != null &&
                                this.eingangsdatum.equals(other.getEingangsdatum()))) &&
                ((this.planstunden == null && other.getPlanstunden() == null) ||
                        (this.planstunden != null &&
                                this.planstunden.equals(other.getPlanstunden()))) &&
                ((this.ueberbuchenVerhindern == null && other.getUeberbuchenVerhindern() == null) ||
                        (this.ueberbuchenVerhindern != null &&
                                this.ueberbuchenVerhindern.equals(other.getUeberbuchenVerhindern()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.anhangListe == null && other.getAnhangListe() == null) ||
                        (this.anhangListe != null &&
                                java.util.Arrays.equals(this.anhangListe, other.getAnhangListe()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
                ((this.inbearbeitungdatum == null && other.getInbearbeitungdatum() == null) ||
                        (this.inbearbeitungdatum != null &&
                                this.inbearbeitungdatum.equals(other.getInbearbeitungdatum()))) &&
                ((this.fertigdatum == null && other.getFertigdatum() == null) ||
                        (this.fertigdatum != null &&
                                this.fertigdatum.equals(other.getFertigdatum()))) &&
                ((this.historyUpdatedatum == null && other.getHistoryUpdatedatum() == null) ||
                        (this.historyUpdatedatum != null &&
                                this.historyUpdatedatum.equals(other.getHistoryUpdatedatum()))) &&
                ((this.schlagworteListe == null && other.getSchlagworteListe() == null) ||
                        (this.schlagworteListe != null &&
                                java.util.Arrays.equals(this.schlagworteListe, other.getSchlagworteListe()))) &&
                ((this.benutzer == null && other.getBenutzer() == null) ||
                        (this.benutzer != null &&
                                this.benutzer.equals(other.getBenutzer()))) &&
                ((this.istStunden == null && other.getIstStunden() == null) ||
                        (this.istStunden != null &&
                                this.istStunden.equals(other.getIstStunden()))) &&
                ((this.istStundenFakt == null && other.getIstStundenFakt() == null) ||
                        (this.istStundenFakt != null &&
                                this.istStundenFakt.equals(other.getIstStundenFakt()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.attribues == null && other.getAttribues() == null) ||
                        (this.attribues != null &&
                                java.util.Arrays.equals(this.attribues, other.getAttribues())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTicketNr();
        if (getTeilaufgabeNr() != null) {
            _hashCode += getTeilaufgabeNr().hashCode();
        }
        if (getBetreff() != null) {
            _hashCode += getBetreff().hashCode();
        }
        if (getKundenReferenz() != null) {
            _hashCode += getKundenReferenz().hashCode();
        }
        if (getKundenAnsprechpartner() != null) {
            _hashCode += getKundenAnsprechpartner().hashCode();
        }
        if (getErsteller() != null) {
            _hashCode += getErsteller().hashCode();
        }
        if (getBearbeiter() != null) {
            _hashCode += getBearbeiter().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getTermin() != null) {
            _hashCode += getTermin().hashCode();
        }
        if (getEingangsdatum() != null) {
            _hashCode += getEingangsdatum().hashCode();
        }
        if (getPlanstunden() != null) {
            _hashCode += getPlanstunden().hashCode();
        }
        if (getUeberbuchenVerhindern() != null) {
            _hashCode += getUeberbuchenVerhindern().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getAnhangListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAnhangListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAnhangListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getInbearbeitungdatum() != null) {
            _hashCode += getInbearbeitungdatum().hashCode();
        }
        if (getFertigdatum() != null) {
            _hashCode += getFertigdatum().hashCode();
        }
        if (getHistoryUpdatedatum() != null) {
            _hashCode += getHistoryUpdatedatum().hashCode();
        }
        if (getSchlagworteListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBenutzer() != null) {
            _hashCode += getBenutzer().hashCode();
        }
        if (getIstStunden() != null) {
            _hashCode += getIstStunden().hashCode();
        }
        if (getIstStundenFakt() != null) {
            _hashCode += getIstStundenFakt().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAttribues() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttribues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttribues(), i);
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
