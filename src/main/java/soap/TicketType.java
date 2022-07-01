/**
 * TicketType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Tickerts.
 */
public class TicketType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TicketType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnsprechpartnerType"));
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
        elemField.setFieldName("prioritaet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prioritaet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
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
        elemField.setFieldName("termin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termin"));
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
        elemField.setFieldName("anhangListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anhangListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "anhang"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planstunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planstunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamischePlanstunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanstunden"));
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
        elemField.setFieldName("abgenommendatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgenommendatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abgelehntdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abgelehntdatum"));
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
        elemField.setFieldName("teilaufgabeListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TeilaufgabeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "teilaufgabe"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externeTicketnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externeTicketnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bemerkungIstIntern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkungIstIntern"));
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

    /* Pflicht beim Bearbeiten. Wird bei der
     *                 				Ticket-Anlage nicht beachtet. */
    private Integer ticketNr;
    /* Der Benurtzername des Erstellers des
     *                 				Tickets. Pflicht bei der Anlage. */
    private String ersteller;
    /* Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage. */
    private String projektNr;
    /* Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage. */
    private String vorgangNr;
    /* Der Betreff des Tickets. Pflicht bei der
     *                 				Anlage. */
    private String betreff;
    /* Die Kundenreferenz des Tickets. */
    private String kundenReferenz;
    private String datum;
    private AnsprechpartnerType kundenAnsprechpartner;
    /* Der Benutzername des Bearbeiters des
     *                 				Tickets. */
    private String bearbeiter;
    /* Die Priorität des Tickets (1-5). */
    private Integer prioritaet;
    /* Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen). */
    private Integer status;
    /* Die Bemerkung zum Ticket. */
    private String bemerkung;
    /* Das Eingangsdatum des Tickets. Format:
     *                 				JJJJ-MM-TT. */
    private String eingangsdatum;
    /* Der Termin des Tickets. Format:
     *                 				JJJJ-MM-TT. */
    private String termin;
    /* Das Startdatum des Tickets. Format:
     *                 				JJJJ-MM-TT. */
    private String startdatum;
    /* Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				Rest wird ignoriert. */
    private AnhangType[] anhangListe;
    private Double planstunden;
    private Double dynamischePlanstunden;
    /* 0: Nein 1: nur fakturierbare Zeiten
     *                 				(inkl. Reisezeiten) 2: fakturierbare und
     *                 				nicht fakturierbare Zeiten (inkl.
     *                 				Reisezeiten) 3: nur fakturierbare Zeiten
     *                 				(ohne Reisezeiten) 4: fakturierbare und
     *                 				nicht fakturierbare Zeiten (ohne
     *                 				Reisezeiten) */
    private Integer ueberbuchenVerhindern;
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
    private String abgenommendatum;
    /* Nur fürs Lesen. */
    private String abgelehntdatum;
    /* Nur fürs Lesen. */
    private String historyUpdatedatum;
    private SchlagwortType[] schlagworteListe;
    /* gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für dieses
     *                 				Ticket überprüft. */
    private String benutzer;
    private Float istStunden;
    private Float istStundenFakt;
    private Integer vorgangId;
    private Integer projektId;
    private TeilaufgabeType[] teilaufgabeListe;
    private String externeTicketnummer;
    private Boolean bemerkungIstIntern;
    /* Attribute für kundenspezifische
     *                 				Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TicketType() {
    }


    public TicketType(
            Integer ticketNr,
            String ersteller,
            String projektNr,
            String vorgangNr,
            String betreff,
            String kundenReferenz,
            String datum,
            AnsprechpartnerType kundenAnsprechpartner,
            String bearbeiter,
            Integer prioritaet,
            Integer status,
            String bemerkung,
            String eingangsdatum,
            String termin,
            String startdatum,
            AnhangType[] anhangListe,
            Double planstunden,
            Double dynamischePlanstunden,
            Integer ueberbuchenVerhindern,
            KategorieListeType kategorieListe,
            String created,
            String modified,
            String inbearbeitungdatum,
            String fertigdatum,
            String abgenommendatum,
            String abgelehntdatum,
            String historyUpdatedatum,
            SchlagwortType[] schlagworteListe,
            String benutzer,
            Float istStunden,
            Float istStundenFakt,
            Integer vorgangId,
            Integer projektId,
            TeilaufgabeType[] teilaufgabeListe,
            String externeTicketnummer,
            Boolean bemerkungIstIntern,
            AttributeType[] attributes) {
        this.ticketNr = ticketNr;
        this.ersteller = ersteller;
        this.projektNr = projektNr;
        this.vorgangNr = vorgangNr;
        this.betreff = betreff;
        this.kundenReferenz = kundenReferenz;
        this.datum = datum;
        this.kundenAnsprechpartner = kundenAnsprechpartner;
        this.bearbeiter = bearbeiter;
        this.prioritaet = prioritaet;
        this.status = status;
        this.bemerkung = bemerkung;
        this.eingangsdatum = eingangsdatum;
        this.termin = termin;
        this.startdatum = startdatum;
        this.anhangListe = anhangListe;
        this.planstunden = planstunden;
        this.dynamischePlanstunden = dynamischePlanstunden;
        this.ueberbuchenVerhindern = ueberbuchenVerhindern;
        this.kategorieListe = kategorieListe;
        this.created = created;
        this.modified = modified;
        this.inbearbeitungdatum = inbearbeitungdatum;
        this.fertigdatum = fertigdatum;
        this.abgenommendatum = abgenommendatum;
        this.abgelehntdatum = abgelehntdatum;
        this.historyUpdatedatum = historyUpdatedatum;
        this.schlagworteListe = schlagworteListe;
        this.benutzer = benutzer;
        this.istStunden = istStunden;
        this.istStundenFakt = istStundenFakt;
        this.vorgangId = vorgangId;
        this.projektId = projektId;
        this.teilaufgabeListe = teilaufgabeListe;
        this.externeTicketnummer = externeTicketnummer;
        this.bemerkungIstIntern = bemerkungIstIntern;
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
     * Gets the ticketNr value for this TicketType.
     *
     * @return ticketNr   * Pflicht beim Bearbeiten. Wird bei der
     *                 				Ticket-Anlage nicht beachtet.
     */
    public Integer getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this TicketType.
     *
     * @param ticketNr   * Pflicht beim Bearbeiten. Wird bei der
     *                 				Ticket-Anlage nicht beachtet.
     */
    public void setTicketNr(Integer ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the ersteller value for this TicketType.
     *
     * @return ersteller   * Der Benurtzername des Erstellers des
     *                 				Tickets. Pflicht bei der Anlage.
     */
    public String getErsteller() {
        return ersteller;
    }

    /**
     * Sets the ersteller value for this TicketType.
     *
     * @param ersteller   * Der Benurtzername des Erstellers des
     *                 				Tickets. Pflicht bei der Anlage.
     */
    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    /**
     * Gets the projektNr value for this TicketType.
     *
     * @return projektNr   * Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this TicketType.
     *
     * @param projektNr   * Die Nummer des Projekts, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the vorgangNr value for this TicketType.
     *
     * @return vorgangNr   * Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this TicketType.
     *
     * @param vorgangNr   * Die Nummer des Vorgangs, dem das Ticket
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the betreff value for this TicketType.
     *
     * @return betreff   * Der Betreff des Tickets. Pflicht bei der
     *                 				Anlage.
     */
    public String getBetreff() {
        return betreff;
    }

    /**
     * Sets the betreff value for this TicketType.
     *
     * @param betreff   * Der Betreff des Tickets. Pflicht bei der
     *                 				Anlage.
     */
    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    /**
     * Gets the kundenReferenz value for this TicketType.
     *
     * @return kundenReferenz   * Die Kundenreferenz des Tickets.
     */
    public String getKundenReferenz() {
        return kundenReferenz;
    }

    /**
     * Sets the kundenReferenz value for this TicketType.
     *
     * @param kundenReferenz   * Die Kundenreferenz des Tickets.
     */
    public void setKundenReferenz(String kundenReferenz) {
        this.kundenReferenz = kundenReferenz;
    }

    /**
     * Gets the datum value for this TicketType.
     *
     * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this TicketType.
     *
     * @param datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the kundenAnsprechpartner value for this TicketType.
     *
     * @return kundenAnsprechpartner
     */
    public AnsprechpartnerType getKundenAnsprechpartner() {
        return kundenAnsprechpartner;
    }

    /**
     * Sets the kundenAnsprechpartner value for this TicketType.
     *
     * @param kundenAnsprechpartner
     */
    public void setKundenAnsprechpartner(AnsprechpartnerType kundenAnsprechpartner) {
        this.kundenAnsprechpartner = kundenAnsprechpartner;
    }

    /**
     * Gets the bearbeiter value for this TicketType.
     *
     * @return bearbeiter   * Der Benutzername des Bearbeiters des
     *                 				Tickets.
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this TicketType.
     *
     * @param bearbeiter   * Der Benutzername des Bearbeiters des
     *                 				Tickets.
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the prioritaet value for this TicketType.
     *
     * @return prioritaet   * Die Priorität des Tickets (1-5).
     */
    public Integer getPrioritaet() {
        return prioritaet;
    }

    /**
     * Sets the prioritaet value for this TicketType.
     *
     * @param prioritaet   * Die Priorität des Tickets (1-5).
     */
    public void setPrioritaet(Integer prioritaet) {
        this.prioritaet = prioritaet;
    }

    /**
     * Gets the status value for this TicketType.
     *
     * @return status   * Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen).
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this TicketType.
     *
     * @param status   * Der Status des Tickets (1=neu, 2=in
     *                 				Bearbeitung, 3=fertig, 4=abgelehnt,
     *                 				5=abgenommen).
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the bemerkung value for this TicketType.
     *
     * @return bemerkung   * Die Bemerkung zum Ticket.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this TicketType.
     *
     * @param bemerkung   * Die Bemerkung zum Ticket.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the eingangsdatum value for this TicketType.
     *
     * @return eingangsdatum   * Das Eingangsdatum des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getEingangsdatum() {
        return eingangsdatum;
    }

    /**
     * Sets the eingangsdatum value for this TicketType.
     *
     * @param eingangsdatum   * Das Eingangsdatum des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setEingangsdatum(String eingangsdatum) {
        this.eingangsdatum = eingangsdatum;
    }

    /**
     * Gets the termin value for this TicketType.
     *
     * @return termin   * Der Termin des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getTermin() {
        return termin;
    }

    /**
     * Sets the termin value for this TicketType.
     *
     * @param termin   * Der Termin des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setTermin(String termin) {
        this.termin = termin;
    }

    /**
     * Gets the startdatum value for this TicketType.
     *
     * @return startdatum   * Das Startdatum des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this TicketType.
     *
     * @param startdatum   * Das Startdatum des Tickets. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the anhangListe value for this TicketType.
     *
     * @return anhangListe   * Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				Rest wird ignoriert.
     */
    public AnhangType[] getAnhangListe() {
        return anhangListe;
    }

    /**
     * Sets the anhangListe value for this TicketType.
     *
     * @param anhangListe   * Es werden nur die zwei ersten Dateien in
     *                 				dieser Liste pro Request gespeichert der
     *                 				Rest wird ignoriert.
     */
    public void setAnhangListe(AnhangType[] anhangListe) {
        this.anhangListe = anhangListe;
    }

    /**
     * Gets the planstunden value for this TicketType.
     *
     * @return planstunden
     */
    public Double getPlanstunden() {
        return planstunden;
    }

    /**
     * Sets the planstunden value for this TicketType.
     *
     * @param planstunden
     */
    public void setPlanstunden(Double planstunden) {
        this.planstunden = planstunden;
    }

    /**
     * Gets the dynamischePlanstunden value for this TicketType.
     *
     * @return dynamischePlanstunden
     */
    public Double getDynamischePlanstunden() {
        return dynamischePlanstunden;
    }

    /**
     * Sets the dynamischePlanstunden value for this TicketType.
     *
     * @param dynamischePlanstunden
     */
    public void setDynamischePlanstunden(Double dynamischePlanstunden) {
        this.dynamischePlanstunden = dynamischePlanstunden;
    }

    /**
     * Gets the ueberbuchenVerhindern value for this TicketType.
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
     * Sets the ueberbuchenVerhindern value for this TicketType.
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
     * Gets the kategorieListe value for this TicketType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this TicketType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the created value for this TicketType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this TicketType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this TicketType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this TicketType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des
     *                 				Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the inbearbeitungdatum value for this TicketType.
     *
     * @return inbearbeitungdatum   * Nur fürs Lesen.
     */
    public String getInbearbeitungdatum() {
        return inbearbeitungdatum;
    }

    /**
     * Sets the inbearbeitungdatum value for this TicketType.
     *
     * @param inbearbeitungdatum   * Nur fürs Lesen.
     */
    public void setInbearbeitungdatum(String inbearbeitungdatum) {
        this.inbearbeitungdatum = inbearbeitungdatum;
    }

    /**
     * Gets the fertigdatum value for this TicketType.
     *
     * @return fertigdatum   * Nur fürs Lesen.
     */
    public String getFertigdatum() {
        return fertigdatum;
    }

    /**
     * Sets the fertigdatum value for this TicketType.
     *
     * @param fertigdatum   * Nur fürs Lesen.
     */
    public void setFertigdatum(String fertigdatum) {
        this.fertigdatum = fertigdatum;
    }

    /**
     * Gets the abgenommendatum value for this TicketType.
     *
     * @return abgenommendatum   * Nur fürs Lesen.
     */
    public String getAbgenommendatum() {
        return abgenommendatum;
    }

    /**
     * Sets the abgenommendatum value for this TicketType.
     *
     * @param abgenommendatum   * Nur fürs Lesen.
     */
    public void setAbgenommendatum(String abgenommendatum) {
        this.abgenommendatum = abgenommendatum;
    }

    /**
     * Gets the abgelehntdatum value for this TicketType.
     *
     * @return abgelehntdatum   * Nur fürs Lesen.
     */
    public String getAbgelehntdatum() {
        return abgelehntdatum;
    }

    /**
     * Sets the abgelehntdatum value for this TicketType.
     *
     * @param abgelehntdatum   * Nur fürs Lesen.
     */
    public void setAbgelehntdatum(String abgelehntdatum) {
        this.abgelehntdatum = abgelehntdatum;
    }

    /**
     * Gets the historyUpdatedatum value for this TicketType.
     *
     * @return historyUpdatedatum   * Nur fürs Lesen.
     */
    public String getHistoryUpdatedatum() {
        return historyUpdatedatum;
    }

    /**
     * Sets the historyUpdatedatum value for this TicketType.
     *
     * @param historyUpdatedatum   * Nur fürs Lesen.
     */
    public void setHistoryUpdatedatum(String historyUpdatedatum) {
        this.historyUpdatedatum = historyUpdatedatum;
    }

    /**
     * Gets the schlagworteListe value for this TicketType.
     *
     * @return schlagworteListe
     */
    public SchlagwortType[] getSchlagworteListe() {
        return schlagworteListe;
    }

    /**
     * Sets the schlagworteListe value for this TicketType.
     *
     * @param schlagworteListe
     */
    public void setSchlagworteListe(SchlagwortType[] schlagworteListe) {
        this.schlagworteListe = schlagworteListe;
    }

    /**
     * Gets the benutzer value for this TicketType.
     *
     * @return benutzer   * gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für dieses
     *                 				Ticket überprüft.
     */
    public String getBenutzer() {
        return benutzer;
    }

    /**
     * Sets the benutzer value for this TicketType.
     *
     * @param benutzer   * gilt als angemeldeter User für die
     *                 				Änderungshistorie., falls gesetzt,
     *                 				werden die Berechtigungen für dieses
     *                 				Ticket überprüft.
     */
    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }

    /**
     * Gets the istStunden value for this TicketType.
     *
     * @return istStunden
     */
    public Float getIstStunden() {
        return istStunden;
    }

    /**
     * Sets the istStunden value for this TicketType.
     *
     * @param istStunden
     */
    public void setIstStunden(Float istStunden) {
        this.istStunden = istStunden;
    }

    /**
     * Gets the istStundenFakt value for this TicketType.
     *
     * @return istStundenFakt
     */
    public Float getIstStundenFakt() {
        return istStundenFakt;
    }

    /**
     * Sets the istStundenFakt value for this TicketType.
     *
     * @param istStundenFakt
     */
    public void setIstStundenFakt(Float istStundenFakt) {
        this.istStundenFakt = istStundenFakt;
    }

    /**
     * Gets the vorgangId value for this TicketType.
     *
     * @return vorgangId
     */
    public Integer getVorgangId() {
        return vorgangId;
    }

    /**
     * Sets the vorgangId value for this TicketType.
     *
     * @param vorgangId
     */
    public void setVorgangId(Integer vorgangId) {
        this.vorgangId = vorgangId;
    }

    /**
     * Gets the projektId value for this TicketType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this TicketType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the teilaufgabeListe value for this TicketType.
     *
     * @return teilaufgabeListe
     */
    public TeilaufgabeType[] getTeilaufgabeListe() {
        return teilaufgabeListe;
    }

    /**
     * Sets the teilaufgabeListe value for this TicketType.
     *
     * @param teilaufgabeListe
     */
    public void setTeilaufgabeListe(TeilaufgabeType[] teilaufgabeListe) {
        this.teilaufgabeListe = teilaufgabeListe;
    }

    /**
     * Gets the externeTicketnummer value for this TicketType.
     *
     * @return externeTicketnummer
     */
    public String getExterneTicketnummer() {
        return externeTicketnummer;
    }

    /**
     * Sets the externeTicketnummer value for this TicketType.
     *
     * @param externeTicketnummer
     */
    public void setExterneTicketnummer(String externeTicketnummer) {
        this.externeTicketnummer = externeTicketnummer;
    }

    /**
     * Gets the bemerkungIstIntern value for this TicketType.
     *
     * @return bemerkungIstIntern
     */
    public Boolean getBemerkungIstIntern() {
        return bemerkungIstIntern;
    }

    /**
     * Sets the bemerkungIstIntern value for this TicketType.
     *
     * @param bemerkungIstIntern
     */
    public void setBemerkungIstIntern(Boolean bemerkungIstIntern) {
        this.bemerkungIstIntern = bemerkungIstIntern;
    }

    /**
     * Gets the attributes value for this TicketType.
     *
     * @return attributes   * Attribute für kundenspezifische
     *                 				Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this TicketType.
     *
     * @param attributes   * Attribute für kundenspezifische
     *                 				Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TicketType)) return false;
        TicketType other = (TicketType) obj;
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
                ((this.ersteller == null && other.getErsteller() == null) ||
                        (this.ersteller != null &&
                                this.ersteller.equals(other.getErsteller()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.betreff == null && other.getBetreff() == null) ||
                        (this.betreff != null &&
                                this.betreff.equals(other.getBetreff()))) &&
                ((this.kundenReferenz == null && other.getKundenReferenz() == null) ||
                        (this.kundenReferenz != null &&
                                this.kundenReferenz.equals(other.getKundenReferenz()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.kundenAnsprechpartner == null && other.getKundenAnsprechpartner() == null) ||
                        (this.kundenAnsprechpartner != null &&
                                this.kundenAnsprechpartner.equals(other.getKundenAnsprechpartner()))) &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.prioritaet == null && other.getPrioritaet() == null) ||
                        (this.prioritaet != null &&
                                this.prioritaet.equals(other.getPrioritaet()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.eingangsdatum == null && other.getEingangsdatum() == null) ||
                        (this.eingangsdatum != null &&
                                this.eingangsdatum.equals(other.getEingangsdatum()))) &&
                ((this.termin == null && other.getTermin() == null) ||
                        (this.termin != null &&
                                this.termin.equals(other.getTermin()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
                ((this.anhangListe == null && other.getAnhangListe() == null) ||
                        (this.anhangListe != null &&
                                java.util.Arrays.equals(this.anhangListe, other.getAnhangListe()))) &&
                ((this.planstunden == null && other.getPlanstunden() == null) ||
                        (this.planstunden != null &&
                                this.planstunden.equals(other.getPlanstunden()))) &&
                ((this.dynamischePlanstunden == null && other.getDynamischePlanstunden() == null) ||
                        (this.dynamischePlanstunden != null &&
                                this.dynamischePlanstunden.equals(other.getDynamischePlanstunden()))) &&
                ((this.ueberbuchenVerhindern == null && other.getUeberbuchenVerhindern() == null) ||
                        (this.ueberbuchenVerhindern != null &&
                                this.ueberbuchenVerhindern.equals(other.getUeberbuchenVerhindern()))) &&
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
                ((this.abgenommendatum == null && other.getAbgenommendatum() == null) ||
                        (this.abgenommendatum != null &&
                                this.abgenommendatum.equals(other.getAbgenommendatum()))) &&
                ((this.abgelehntdatum == null && other.getAbgelehntdatum() == null) ||
                        (this.abgelehntdatum != null &&
                                this.abgelehntdatum.equals(other.getAbgelehntdatum()))) &&
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
                ((this.vorgangId == null && other.getVorgangId() == null) ||
                        (this.vorgangId != null &&
                                this.vorgangId.equals(other.getVorgangId()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.teilaufgabeListe == null && other.getTeilaufgabeListe() == null) ||
                        (this.teilaufgabeListe != null &&
                                java.util.Arrays.equals(this.teilaufgabeListe, other.getTeilaufgabeListe()))) &&
                ((this.externeTicketnummer == null && other.getExterneTicketnummer() == null) ||
                        (this.externeTicketnummer != null &&
                                this.externeTicketnummer.equals(other.getExterneTicketnummer()))) &&
                ((this.bemerkungIstIntern == null && other.getBemerkungIstIntern() == null) ||
                        (this.bemerkungIstIntern != null &&
                                this.bemerkungIstIntern.equals(other.getBemerkungIstIntern()))) &&
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
        if (getErsteller() != null) {
            _hashCode += getErsteller().hashCode();
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
        if (getKundenReferenz() != null) {
            _hashCode += getKundenReferenz().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getKundenAnsprechpartner() != null) {
            _hashCode += getKundenAnsprechpartner().hashCode();
        }
        if (getBearbeiter() != null) {
            _hashCode += getBearbeiter().hashCode();
        }
        if (getPrioritaet() != null) {
            _hashCode += getPrioritaet().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getEingangsdatum() != null) {
            _hashCode += getEingangsdatum().hashCode();
        }
        if (getTermin() != null) {
            _hashCode += getTermin().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
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
        if (getPlanstunden() != null) {
            _hashCode += getPlanstunden().hashCode();
        }
        if (getDynamischePlanstunden() != null) {
            _hashCode += getDynamischePlanstunden().hashCode();
        }
        if (getUeberbuchenVerhindern() != null) {
            _hashCode += getUeberbuchenVerhindern().hashCode();
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
        if (getAbgenommendatum() != null) {
            _hashCode += getAbgenommendatum().hashCode();
        }
        if (getAbgelehntdatum() != null) {
            _hashCode += getAbgelehntdatum().hashCode();
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
        if (getVorgangId() != null) {
            _hashCode += getVorgangId().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getTeilaufgabeListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTeilaufgabeListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTeilaufgabeListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExterneTicketnummer() != null) {
            _hashCode += getExterneTicketnummer().hashCode();
        }
        if (getBemerkungIstIntern() != null) {
            _hashCode += getBemerkungIstIntern().hashCode();
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
