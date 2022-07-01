/**
 * ReadTicketsSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Suche von Ticket-Status in den Stammdaten.
 */
public class ReadTicketsSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTicketsSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTicketsSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenAnsprechpartner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenAnsprechpartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("betreff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betreff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioritaet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prioritaet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
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
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "Int1_7"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("abteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inklusiveUnterabteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inklusiveUnterabteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitTeilaufgaben");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitTeilaufgaben"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeStatusListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeStatusListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "Int1_7"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "status"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externeTicketnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externeTicketnummer"));
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

    /* Die Nummer des zu lesenden Tickets. */
    private Integer ticketNr;
    /* Die Kunden-Referenz der zu suchenden
     *                 				Tickets. */
    private String kundenReferenz;
    /* Das Datum der zu suchenden Tickets. Wenn
     *                 				'bis' einen Wert hat, dann werden
     *                 				Tickets zwischen 'datum' und 'bis'
     *                 				geliefert, andernfalls werden nur
     *                 				Tickets an diesem Datum geliefert.
     *                 				Format: JJJJ-MM-TT. */
    private String datum;
    /* Der Name des Ansprechpartners beim
     *                 				Kunden. */
    private String kundenAnsprechpartner;
    /* Der Benutzername des Erstellers des
     *                 				Tickets. */
    private String ersteller;
    /* Der Benutzername des Bearbeiters des
     *                 				Tickets. */
    private String bearbeiter;
    /* Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist. */
    private String projektNr;
    /* Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist. */
    private String vorgangNr;
    /* Betreff oder ein Teil vom Betreff der zu
     *                 				suchenden Tickets. */
    private String betreff;
    /* Die Priorität des Tickets (1-5). */
    private Integer prioritaet;
    private String modifiedSince;
    private String[] schlagworteFilter;
    private String benutzer;
    private String bis;
    private int[] statusListe;
    private Integer vorgangId;
    private Integer projektId;
    private String abteilung;
    private Boolean inklusiveUnterabteilung;
    private Boolean mitTeilaufgaben;
    private int[] teilaufgabeStatusListe;
    private String externeTicketnummer;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTicketsSearchCriteriaType() {
    }


    public ReadTicketsSearchCriteriaType(
            Integer ticketNr,
            String kundenReferenz,
            String datum,
            String kundenAnsprechpartner,
            String ersteller,
            String bearbeiter,
            String projektNr,
            String vorgangNr,
            String betreff,
            Integer prioritaet,
            String modifiedSince,
            String[] schlagworteFilter,
            String benutzer,
            String bis,
            int[] statusListe,
            Integer vorgangId,
            Integer projektId,
            String abteilung,
            Boolean inklusiveUnterabteilung,
            Boolean mitTeilaufgaben,
            int[] teilaufgabeStatusListe,
            String externeTicketnummer,
            AttributeType[] attributes) {
        this.ticketNr = ticketNr;
        this.kundenReferenz = kundenReferenz;
        this.datum = datum;
        this.kundenAnsprechpartner = kundenAnsprechpartner;
        this.ersteller = ersteller;
        this.bearbeiter = bearbeiter;
        this.projektNr = projektNr;
        this.vorgangNr = vorgangNr;
        this.betreff = betreff;
        this.prioritaet = prioritaet;
        this.modifiedSince = modifiedSince;
        this.schlagworteFilter = schlagworteFilter;
        this.benutzer = benutzer;
        this.bis = bis;
        this.statusListe = statusListe;
        this.vorgangId = vorgangId;
        this.projektId = projektId;
        this.abteilung = abteilung;
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
        this.mitTeilaufgaben = mitTeilaufgaben;
        this.teilaufgabeStatusListe = teilaufgabeStatusListe;
        this.externeTicketnummer = externeTicketnummer;
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
     * Gets the ticketNr value for this ReadTicketsSearchCriteriaType.
     *
     * @return ticketNr   * Die Nummer des zu lesenden Tickets.
     */
    public Integer getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this ReadTicketsSearchCriteriaType.
     *
     * @param ticketNr   * Die Nummer des zu lesenden Tickets.
     */
    public void setTicketNr(Integer ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the kundenReferenz value for this ReadTicketsSearchCriteriaType.
     *
     * @return kundenReferenz   * Die Kunden-Referenz der zu suchenden
     *                 				Tickets.
     */
    public String getKundenReferenz() {
        return kundenReferenz;
    }

    /**
     * Sets the kundenReferenz value for this ReadTicketsSearchCriteriaType.
     *
     * @param kundenReferenz   * Die Kunden-Referenz der zu suchenden
     *                 				Tickets.
     */
    public void setKundenReferenz(String kundenReferenz) {
        this.kundenReferenz = kundenReferenz;
    }

    /**
     * Gets the datum value for this ReadTicketsSearchCriteriaType.
     *
     * @return datum   * Das Datum der zu suchenden Tickets. Wenn
     *                 				'bis' einen Wert hat, dann werden
     *                 				Tickets zwischen 'datum' und 'bis'
     *                 				geliefert, andernfalls werden nur
     *                 				Tickets an diesem Datum geliefert.
     *                 				Format: JJJJ-MM-TT.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this ReadTicketsSearchCriteriaType.
     *
     * @param datum   * Das Datum der zu suchenden Tickets. Wenn
     *                 				'bis' einen Wert hat, dann werden
     *                 				Tickets zwischen 'datum' und 'bis'
     *                 				geliefert, andernfalls werden nur
     *                 				Tickets an diesem Datum geliefert.
     *                 				Format: JJJJ-MM-TT.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the kundenAnsprechpartner value for this ReadTicketsSearchCriteriaType.
     *
     * @return kundenAnsprechpartner   * Der Name des Ansprechpartners beim
     *                 				Kunden.
     */
    public String getKundenAnsprechpartner() {
        return kundenAnsprechpartner;
    }

    /**
     * Sets the kundenAnsprechpartner value for this ReadTicketsSearchCriteriaType.
     *
     * @param kundenAnsprechpartner   * Der Name des Ansprechpartners beim
     *                 				Kunden.
     */
    public void setKundenAnsprechpartner(String kundenAnsprechpartner) {
        this.kundenAnsprechpartner = kundenAnsprechpartner;
    }

    /**
     * Gets the ersteller value for this ReadTicketsSearchCriteriaType.
     *
     * @return ersteller   * Der Benutzername des Erstellers des
     *                 				Tickets.
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the ersteller value for this ReadTicketsSearchCriteriaType.
     *
     * @param ersteller   * Der Benutzername des Erstellers des
     *                 				Tickets.
     */
    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    /**
     * Gets the bearbeiter value for this ReadTicketsSearchCriteriaType.
     *
     * @return bearbeiter   * Der Benutzername des Bearbeiters des
     *                 				Tickets.
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this ReadTicketsSearchCriteriaType.
     *
     * @param bearbeiter   * Der Benutzername des Bearbeiters des
     *                 				Tickets.
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the projektNr value for this ReadTicketsSearchCriteriaType.
     *
     * @return projektNr   * Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ReadTicketsSearchCriteriaType.
     *
     * @param projektNr   * Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the vorgangNr value for this ReadTicketsSearchCriteriaType.
     *
     * @return vorgangNr   * Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this ReadTicketsSearchCriteriaType.
     *
     * @param vorgangNr   * Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the betreff value for this ReadTicketsSearchCriteriaType.
     *
     * @return betreff   * Betreff oder ein Teil vom Betreff der zu
     *                 				suchenden Tickets.
     */
    public String getBetreff() {
        return betreff;
    }

    /**
     * Sets the betreff value for this ReadTicketsSearchCriteriaType.
     *
     * @param betreff   * Betreff oder ein Teil vom Betreff der zu
     *                 				suchenden Tickets.
     */
    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    /**
     * Gets the prioritaet value for this ReadTicketsSearchCriteriaType.
     *
     * @return prioritaet   * Die Priorität des Tickets (1-5).
     */
    public Integer getPrioritaet() {
        return prioritaet;
    }

    /**
     * Sets the prioritaet value for this ReadTicketsSearchCriteriaType.
     *
     * @param prioritaet   * Die Priorität des Tickets (1-5).
     */
    public void setPrioritaet(Integer prioritaet) {
        this.prioritaet = prioritaet;
    }

    /**
     * Gets the modifiedSince value for this ReadTicketsSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadTicketsSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the schlagworteFilter value for this ReadTicketsSearchCriteriaType.
     *
     * @return schlagworteFilter
     */
    public String[] getSchlagworteFilter() {
        return schlagworteFilter;
    }

    /**
     * Sets the schlagworteFilter value for this ReadTicketsSearchCriteriaType.
     *
     * @param schlagworteFilter
     */
    public void setSchlagworteFilter(String[] schlagworteFilter) {
        this.schlagworteFilter = schlagworteFilter;
    }

    /**
     * Gets the benutzer value for this ReadTicketsSearchCriteriaType.
     *
     * @return benutzer
     */
    public String getBenutzer() {
        return benutzer;
    }

    /**
     * Sets the benutzer value for this ReadTicketsSearchCriteriaType.
     *
     * @param benutzer
     */
    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }

    /**
     * Gets the bis value for this ReadTicketsSearchCriteriaType.
     *
     * @return bis
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadTicketsSearchCriteriaType.
     *
     * @param bis
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the statusListe value for this ReadTicketsSearchCriteriaType.
     *
     * @return statusListe
     */
    public int[] getStatusListe() {
        return statusListe;
    }

    /**
     * Sets the statusListe value for this ReadTicketsSearchCriteriaType.
     *
     * @param statusListe
     */
    public void setStatusListe(int[] statusListe) {
        this.statusListe = statusListe;
    }

    /**
     * Gets the vorgangId value for this ReadTicketsSearchCriteriaType.
     *
     * @return vorgangId
     */
    public Integer getVorgangId() {
        return vorgangId;
    }

    /**
     * Sets the vorgangId value for this ReadTicketsSearchCriteriaType.
     *
     * @param vorgangId
     */
    public void setVorgangId(Integer vorgangId) {
        this.vorgangId = vorgangId;
    }

    /**
     * Gets the projektId value for this ReadTicketsSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadTicketsSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the abteilung value for this ReadTicketsSearchCriteriaType.
     *
     * @return abteilung
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this ReadTicketsSearchCriteriaType.
     *
     * @param abteilung
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the inklusiveUnterabteilung value for this ReadTicketsSearchCriteriaType.
     *
     * @return inklusiveUnterabteilung
     */
    public Boolean getInklusiveUnterabteilung() {
        return inklusiveUnterabteilung;
    }

    /**
     * Sets the inklusiveUnterabteilung value for this ReadTicketsSearchCriteriaType.
     *
     * @param inklusiveUnterabteilung
     */
    public void setInklusiveUnterabteilung(Boolean inklusiveUnterabteilung) {
        this.inklusiveUnterabteilung = inklusiveUnterabteilung;
    }

    /**
     * Gets the mitTeilaufgaben value for this ReadTicketsSearchCriteriaType.
     *
     * @return mitTeilaufgaben
     */
    public Boolean getMitTeilaufgaben() {
        return mitTeilaufgaben;
    }

    /**
     * Sets the mitTeilaufgaben value for this ReadTicketsSearchCriteriaType.
     *
     * @param mitTeilaufgaben
     */
    public void setMitTeilaufgaben(Boolean mitTeilaufgaben) {
        this.mitTeilaufgaben = mitTeilaufgaben;
    }

    /**
     * Gets the teilaufgabeStatusListe value for this ReadTicketsSearchCriteriaType.
     *
     * @return teilaufgabeStatusListe
     */
    public int[] getTeilaufgabeStatusListe() {
        return teilaufgabeStatusListe;
    }

    /**
     * Sets the teilaufgabeStatusListe value for this ReadTicketsSearchCriteriaType.
     *
     * @param teilaufgabeStatusListe
     */
    public void setTeilaufgabeStatusListe(int[] teilaufgabeStatusListe) {
        this.teilaufgabeStatusListe = teilaufgabeStatusListe;
    }

    /**
     * Gets the externeTicketnummer value for this ReadTicketsSearchCriteriaType.
     *
     * @return externeTicketnummer
     */
    public String getExterneTicketnummer() {
        return externeTicketnummer;
    }

    /**
     * Sets the externeTicketnummer value for this ReadTicketsSearchCriteriaType.
     *
     * @param externeTicketnummer
     */
    public void setExterneTicketnummer(String externeTicketnummer) {
        this.externeTicketnummer = externeTicketnummer;
    }

    /**
     * Gets the attributes value for this ReadTicketsSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadTicketsSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTicketsSearchCriteriaType)) return false;
        ReadTicketsSearchCriteriaType other = (ReadTicketsSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.ticketNr == null && other.getTicketNr() == null) ||
                        (this.ticketNr != null &&
                                this.ticketNr.equals(other.getTicketNr()))) &&
                ((this.kundenReferenz == null && other.getKundenReferenz() == null) ||
                        (this.kundenReferenz != null &&
                                this.kundenReferenz.equals(other.getKundenReferenz()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.kundenAnsprechpartner == null && other.getKundenAnsprechpartner() == null) ||
                        (this.kundenAnsprechpartner != null &&
                                this.kundenAnsprechpartner.equals(other.getKundenAnsprechpartner()))) &&
                ((this.ersteller == null && other.getErsteller() == null) ||
                        (this.ersteller != null &&
                                this.ersteller.equals(other.getErsteller()))) &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.betreff == null && other.getBetreff() == null) ||
                        (this.betreff != null &&
                                this.betreff.equals(other.getBetreff()))) &&
                ((this.prioritaet == null && other.getPrioritaet() == null) ||
                        (this.prioritaet != null &&
                                this.prioritaet.equals(other.getPrioritaet()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.schlagworteFilter == null && other.getSchlagworteFilter() == null) ||
                        (this.schlagworteFilter != null &&
                                java.util.Arrays.equals(this.schlagworteFilter, other.getSchlagworteFilter()))) &&
                ((this.benutzer == null && other.getBenutzer() == null) ||
                        (this.benutzer != null &&
                                this.benutzer.equals(other.getBenutzer()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.statusListe == null && other.getStatusListe() == null) ||
                        (this.statusListe != null &&
                                java.util.Arrays.equals(this.statusListe, other.getStatusListe()))) &&
                ((this.vorgangId == null && other.getVorgangId() == null) ||
                        (this.vorgangId != null &&
                                this.vorgangId.equals(other.getVorgangId()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.inklusiveUnterabteilung == null && other.getInklusiveUnterabteilung() == null) ||
                        (this.inklusiveUnterabteilung != null &&
                                this.inklusiveUnterabteilung.equals(other.getInklusiveUnterabteilung()))) &&
                ((this.mitTeilaufgaben == null && other.getMitTeilaufgaben() == null) ||
                        (this.mitTeilaufgaben != null &&
                                this.mitTeilaufgaben.equals(other.getMitTeilaufgaben()))) &&
                ((this.teilaufgabeStatusListe == null && other.getTeilaufgabeStatusListe() == null) ||
                        (this.teilaufgabeStatusListe != null &&
                                java.util.Arrays.equals(this.teilaufgabeStatusListe, other.getTeilaufgabeStatusListe()))) &&
                ((this.externeTicketnummer == null && other.getExterneTicketnummer() == null) ||
                        (this.externeTicketnummer != null &&
                                this.externeTicketnummer.equals(other.getExterneTicketnummer()))) &&
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
        if (getTicketNr() != null) {
            _hashCode += getTicketNr().hashCode();
        }
        if (getKundenReferenz() != null) {
            _hashCode += getKundenReferenz().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
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
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getBetreff() != null) {
            _hashCode += getBetreff().hashCode();
        }
        if (getPrioritaet() != null) {
            _hashCode += getPrioritaet().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getSchlagworteFilter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteFilter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteFilter(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBenutzer() != null) {
            _hashCode += getBenutzer().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getStatusListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getStatusListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStatusListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVorgangId() != null) {
            _hashCode += getVorgangId().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getInklusiveUnterabteilung() != null) {
            _hashCode += getInklusiveUnterabteilung().hashCode();
        }
        if (getMitTeilaufgaben() != null) {
            _hashCode += getMitTeilaufgaben().hashCode();
        }
        if (getTeilaufgabeStatusListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTeilaufgabeStatusListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTeilaufgabeStatusListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExterneTicketnummer() != null) {
            _hashCode += getExterneTicketnummer().hashCode();
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
