/**
 * VorgangType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Vorgangs.
 */
public class VorgangType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(VorgangType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent"));
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
        elemField.setFieldName("vorgangName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endeDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endeDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamischePlanStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planArbeitsentgelt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planArbeitsentgelt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamischePlanArbeitsentgelt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanArbeitsentgelt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planBelege");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planBelege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamischePlanKosten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamischePlanKosten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortierung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortierung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("kostenstelle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kostenstelle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangMitarbeiterListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangMitarbeiterListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangMitarbeiterListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultFakt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultFakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechenArt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechenArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ueberbuchung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ueberbuchung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorgangstaetigkeitListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorgangstaetigkeitListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangstaetigkeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "taetigkeit"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentId"));
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
        elemField.setFieldName("belegErfassung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegErfassung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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

    /* Die Nummer des Vorgangs. Pflicht bei
     *                 				Anlage, Update und beim Löschen. */
    private String vorgangNr;
    /* Die Nummer des übergeordneten Vorgangs. */
    private String parent;
    /* Die Nummer des Projekts, dem der Vorgang
     *                 				zugeordnet ist. Pflicht bei der Anlage. */
    private String projektNr;
    /* Die Bezeichnung des Vorgangs. */
    private String vorgangName;
    /* Das Start-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT */
    private String startDatum;
    /* Das Ende-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT */
    private String endeDatum;
    /* Der geplante Aufwand (in Stunden) für
     *                 				den Vorgang. */
    private Double planStunden;
    private Double dynamischePlanStunden;
    /* Das geplante Arbeitsentgelt für den
     *                 				Vorgang. */
    private Double planArbeitsentgelt;
    private Double dynamischePlanArbeitsentgelt;
    /* Der eingeplante Betrag für Belege und
     *                 				VMA für diesen Vorgang. */
    private Double planBelege;
    private Double dynamischePlanKosten;
    /* Eine Bemerkung zum Vorgang. */
    private String bemerkung;
    /* Der Status des Vorgangs. */
    private String status;
    /* Ein Zahl zur Festlegung der
     *                 				Sortier-Reihenfolge. */
    private Integer sortierung;
    /* Der diesem Vorgang zugeordnete
     *                 				Kostenträger. */
    private String kostentraeger;
    /* Die diesem Vorgang zugeordnete
     *                 				Kostenstelle. */
    private String kostenstelle;
    /* Die Liste der dem Vorgang zugeordneten
     *                 				Mitarbeiter. */
    private VorgangMitarbeiterListeType vorgangMitarbeiterListe;
    /* 0 = Fakturierbarkeit geerbt vom Projekt
     *                 				1=Fakturierbar änderbar(durch
     *                 				Mitarbeiter ) 2=Fakturierbar nicht
     *                 				änderbar (durch Mitarbeiter ) 3=Nicht
     *                 				fakturierbar änderbar (durch
     *                 				Mitarbeiter) 4=Nicht fakturierbar nciht
     *                 				änderbar (durch Mitarbeiter ) */
    private Integer defaultFakt;
    /* 0=wie Projekt 1=Abrechnung Stundensatz
     *                 				2=Abrechnung Tagessatz 3=Abrechnung
     *                 				Pauschal */
    private Integer rechenArt;
    /* 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern (für alle Zeiten).
     *                 				3=Fakturierbar ohne Reise. 4=Alle ohne
     *                 				Reise. */
    private Integer ueberbuchung;
    private VorgangstaetigkeitType[] vorgangstaetigkeitListe;
    private Float istStunden;
    private Float istStundenFakt;
    /* NUR für updateVorgang bzw. deleteVorgang Operationen, vor allem
     * um den übergeordneten Vorgang zu ändern. */
    private Integer id;
    /* NUR für Operationen createVorgang bzw.
     *                 				updateVorgang. Wenn Vorgang kein Parent
     *                 				hat dann bitte mit 0 belegen bei
     *                 				updateVorgang. */
    private Integer parentId;
    private Integer projektId;
    private Boolean belegErfassung;
    /* Aktion. Um den Vorgang im Rahmen eines
     *                 				Updates zu löschen muss hier "delete"
     *                 				angegeben werden. */
    private String action;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public VorgangType() {
    }


    public VorgangType(
            String vorgangNr,
            String parent,
            String projektNr,
            String vorgangName,
            String startDatum,
            String endeDatum,
            Double planStunden,
            Double dynamischePlanStunden,
            Double planArbeitsentgelt,
            Double dynamischePlanArbeitsentgelt,
            Double planBelege,
            Double dynamischePlanKosten,
            String bemerkung,
            String status,
            Integer sortierung,
            String kostentraeger,
            String kostenstelle,
            VorgangMitarbeiterListeType vorgangMitarbeiterListe,
            Integer defaultFakt,
            Integer rechenArt,
            Integer ueberbuchung,
            VorgangstaetigkeitType[] vorgangstaetigkeitListe,
            Float istStunden,
            Float istStundenFakt,
            Integer id,
            Integer parentId,
            Integer projektId,
            Boolean belegErfassung,
            String action,
            AttributeType[] attributes) {
        this.vorgangNr = vorgangNr;
        this.parent = parent;
        this.projektNr = projektNr;
        this.vorgangName = vorgangName;
        this.startDatum = startDatum;
        this.endeDatum = endeDatum;
        this.planStunden = planStunden;
        this.dynamischePlanStunden = dynamischePlanStunden;
        this.planArbeitsentgelt = planArbeitsentgelt;
        this.dynamischePlanArbeitsentgelt = dynamischePlanArbeitsentgelt;
        this.planBelege = planBelege;
        this.dynamischePlanKosten = dynamischePlanKosten;
        this.bemerkung = bemerkung;
        this.status = status;
        this.sortierung = sortierung;
        this.kostentraeger = kostentraeger;
        this.kostenstelle = kostenstelle;
        this.vorgangMitarbeiterListe = vorgangMitarbeiterListe;
        this.defaultFakt = defaultFakt;
        this.rechenArt = rechenArt;
        this.ueberbuchung = ueberbuchung;
        this.vorgangstaetigkeitListe = vorgangstaetigkeitListe;
        this.istStunden = istStunden;
        this.istStundenFakt = istStundenFakt;
        this.id = id;
        this.parentId = parentId;
        this.projektId = projektId;
        this.belegErfassung = belegErfassung;
        this.action = action;
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
     * Gets the vorgangNr value for this VorgangType.
     *
     * @return vorgangNr   * Die Nummer des Vorgangs. Pflicht bei
     *                 				Anlage, Update und beim Löschen.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this VorgangType.
     *
     * @param vorgangNr   * Die Nummer des Vorgangs. Pflicht bei
     *                 				Anlage, Update und beim Löschen.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the parent value for this VorgangType.
     *
     * @return parent   * Die Nummer des übergeordneten Vorgangs.
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the parent value for this VorgangType.
     *
     * @param parent   * Die Nummer des übergeordneten Vorgangs.
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * Gets the projektNr value for this VorgangType.
     *
     * @return projektNr   * Die Nummer des Projekts, dem der Vorgang
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this VorgangType.
     *
     * @param projektNr   * Die Nummer des Projekts, dem der Vorgang
     *                 				zugeordnet ist. Pflicht bei der Anlage.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the vorgangName value for this VorgangType.
     *
     * @return vorgangName   * Die Bezeichnung des Vorgangs.
     */
    public String getVorgangName() {
        return vorgangName;
    }

    /**
     * Sets the vorgangName value for this VorgangType.
     *
     * @param vorgangName   * Die Bezeichnung des Vorgangs.
     */
    public void setVorgangName(String vorgangName) {
        this.vorgangName = vorgangName;
    }

    /**
     * Gets the startDatum value for this VorgangType.
     *
     * @return startDatum   * Das Start-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT
     */
    public String getStartDatum() {
        return startDatum;
    }

    /**
     * Sets the startDatum value for this VorgangType.
     *
     * @param startDatum   * Das Start-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT
     */
    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    /**
     * Gets the endeDatum value for this VorgangType.
     *
     * @return endeDatum   * Das Ende-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT
     */
    public String getEndeDatum() {
        return endeDatum;
    }

    /**
     * Sets the endeDatum value for this VorgangType.
     *
     * @param endeDatum   * Das Ende-Datum des Vorgangs. Format:
     *                 				JJJJ-MM-TT
     */
    public void setEndeDatum(String endeDatum) {
        this.endeDatum = endeDatum;
    }

    /**
     * Gets the planStunden value for this VorgangType.
     *
     * @return planStunden   * Der geplante Aufwand (in Stunden) für
     *                 				den Vorgang.
     */
    public Double getPlanStunden() {
        return planStunden;
    }

    /**
     * Sets the planStunden value for this VorgangType.
     *
     * @param planStunden   * Der geplante Aufwand (in Stunden) für
     *                 				den Vorgang.
     */
    public void setPlanStunden(Double planStunden) {
        this.planStunden = planStunden;
    }

    /**
     * Gets the dynamischePlanStunden value for this VorgangType.
     *
     * @return dynamischePlanStunden
     */
    public Double getDynamischePlanStunden() {
        return dynamischePlanStunden;
    }

    /**
     * Sets the dynamischePlanStunden value for this VorgangType.
     *
     * @param dynamischePlanStunden
     */
    public void setDynamischePlanStunden(Double dynamischePlanStunden) {
        this.dynamischePlanStunden = dynamischePlanStunden;
    }

    /**
     * Gets the planArbeitsentgelt value for this VorgangType.
     *
     * @return planArbeitsentgelt   * Das geplante Arbeitsentgelt für den
     *                 				Vorgang.
     */
    public Double getPlanArbeitsentgelt() {
        return planArbeitsentgelt;
    }

    /**
     * Sets the planArbeitsentgelt value for this VorgangType.
     *
     * @param planArbeitsentgelt   * Das geplante Arbeitsentgelt für den
     *                 				Vorgang.
     */
    public void setPlanArbeitsentgelt(Double planArbeitsentgelt) {
        this.planArbeitsentgelt = planArbeitsentgelt;
    }

    /**
     * Gets the dynamischePlanArbeitsentgelt value for this VorgangType.
     *
     * @return dynamischePlanArbeitsentgelt
     */
    public Double getDynamischePlanArbeitsentgelt() {
        return dynamischePlanArbeitsentgelt;
    }

    /**
     * Sets the dynamischePlanArbeitsentgelt value for this VorgangType.
     *
     * @param dynamischePlanArbeitsentgelt
     */
    public void setDynamischePlanArbeitsentgelt(Double dynamischePlanArbeitsentgelt) {
        this.dynamischePlanArbeitsentgelt = dynamischePlanArbeitsentgelt;
    }

    /**
     * Gets the planBelege value for this VorgangType.
     *
     * @return planBelege   * Der eingeplante Betrag für Belege und
     *                 				VMA für diesen Vorgang.
     */
    public Double getPlanBelege() {
        return planBelege;
    }

    /**
     * Sets the planBelege value for this VorgangType.
     *
     * @param planBelege   * Der eingeplante Betrag für Belege und
     *                 				VMA für diesen Vorgang.
     */
    public void setPlanBelege(Double planBelege) {
        this.planBelege = planBelege;
    }

    /**
     * Gets the dynamischePlanKosten value for this VorgangType.
     *
     * @return dynamischePlanKosten
     */
    public Double getDynamischePlanKosten() {
        return dynamischePlanKosten;
    }

    /**
     * Sets the dynamischePlanKosten value for this VorgangType.
     *
     * @param dynamischePlanKosten
     */
    public void setDynamischePlanKosten(Double dynamischePlanKosten) {
        this.dynamischePlanKosten = dynamischePlanKosten;
    }

    /**
     * Gets the bemerkung value for this VorgangType.
     *
     * @return bemerkung   * Eine Bemerkung zum Vorgang.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this VorgangType.
     *
     * @param bemerkung   * Eine Bemerkung zum Vorgang.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the status value for this VorgangType.
     *
     * @return status   * Der Status des Vorgangs.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this VorgangType.
     *
     * @param status   * Der Status des Vorgangs.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the sortierung value for this VorgangType.
     *
     * @return sortierung   * Ein Zahl zur Festlegung der
     *                 				Sortier-Reihenfolge.
     */
    public Integer getSortierung() {
        return sortierung;
    }

    /**
     * Sets the sortierung value for this VorgangType.
     *
     * @param sortierung   * Ein Zahl zur Festlegung der
     *                 				Sortier-Reihenfolge.
     */
    public void setSortierung(Integer sortierung) {
        this.sortierung = sortierung;
    }

    /**
     * Gets the kostentraeger value for this VorgangType.
     *
     * @return kostentraeger   * Der diesem Vorgang zugeordnete
     *                 				Kostenträger.
     */
    public String getKostentraeger() {
        return kostentraeger;
    }

    /**
     * Sets the kostentraeger value for this VorgangType.
     *
     * @param kostentraeger   * Der diesem Vorgang zugeordnete
     *                 				Kostenträger.
     */
    public void setKostentraeger(String kostentraeger) {
        this.kostentraeger = kostentraeger;
    }

    /**
     * Gets the kostenstelle value for this VorgangType.
     *
     * @return kostenstelle   * Die diesem Vorgang zugeordnete
     *                 				Kostenstelle.
     */
    public String getKostenstelle() {
        return kostenstelle;
    }

    /**
     * Sets the kostenstelle value for this VorgangType.
     *
     * @param kostenstelle   * Die diesem Vorgang zugeordnete
     *                 				Kostenstelle.
     */
    public void setKostenstelle(String kostenstelle) {
        this.kostenstelle = kostenstelle;
    }

    /**
     * Gets the vorgangMitarbeiterListe value for this VorgangType.
     *
     * @return vorgangMitarbeiterListe   * Die Liste der dem Vorgang zugeordneten
     *                 				Mitarbeiter.
     */
    public VorgangMitarbeiterListeType getVorgangMitarbeiterListe() {
        return vorgangMitarbeiterListe;
    }

    /**
     * Sets the vorgangMitarbeiterListe value for this VorgangType.
     *
     * @param vorgangMitarbeiterListe   * Die Liste der dem Vorgang zugeordneten
     *                 				Mitarbeiter.
     */
    public void setVorgangMitarbeiterListe(VorgangMitarbeiterListeType vorgangMitarbeiterListe) {
        this.vorgangMitarbeiterListe = vorgangMitarbeiterListe;
    }

    /**
     * Gets the defaultFakt value for this VorgangType.
     *
     * @return defaultFakt   * 0 = Fakturierbarkeit geerbt vom Projekt
     *                 				1=Fakturierbar änderbar(durch
     *                 				Mitarbeiter ) 2=Fakturierbar nicht
     *                 				änderbar (durch Mitarbeiter ) 3=Nicht
     *                 				fakturierbar änderbar (durch
     *                 				Mitarbeiter) 4=Nicht fakturierbar nciht
     *                 				änderbar (durch Mitarbeiter )
     */
    public Integer getDefaultFakt() {
        return defaultFakt;
    }

    /**
     * Sets the defaultFakt value for this VorgangType.
     *
     * @param defaultFakt   * 0 = Fakturierbarkeit geerbt vom Projekt
     *                 				1=Fakturierbar änderbar(durch
     *                 				Mitarbeiter ) 2=Fakturierbar nicht
     *                 				änderbar (durch Mitarbeiter ) 3=Nicht
     *                 				fakturierbar änderbar (durch
     *                 				Mitarbeiter) 4=Nicht fakturierbar nciht
     *                 				änderbar (durch Mitarbeiter )
     */
    public void setDefaultFakt(Integer defaultFakt) {
        this.defaultFakt = defaultFakt;
    }

    /**
     * Gets the rechenArt value for this VorgangType.
     *
     * @return rechenArt   * 0=wie Projekt 1=Abrechnung Stundensatz
     *                 				2=Abrechnung Tagessatz 3=Abrechnung
     *                 				Pauschal
     */
    public Integer getRechenArt() {
        return rechenArt;
    }

    /**
     * Sets the rechenArt value for this VorgangType.
     *
     * @param rechenArt   * 0=wie Projekt 1=Abrechnung Stundensatz
     *                 				2=Abrechnung Tagessatz 3=Abrechnung
     *                 				Pauschal
     */
    public void setRechenArt(Integer rechenArt) {
        this.rechenArt = rechenArt;
    }

    /**
     * Gets the ueberbuchung value for this VorgangType.
     *
     * @return ueberbuchung   * 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern (für alle Zeiten).
     *                 				3=Fakturierbar ohne Reise. 4=Alle ohne
     *                 				Reise.
     */
    public Integer getUeberbuchung() {
        return ueberbuchung;
    }

    /**
     * Sets the ueberbuchung value for this VorgangType.
     *
     * @param ueberbuchung   * 0=Überbuchung nicht verhindern.
     *                 				1=Überbuchung verhindern nur für
     *                 				fakturierbare Zeiten. 2=Überbuchung
     *                 				verhindern (für alle Zeiten).
     *                 				3=Fakturierbar ohne Reise. 4=Alle ohne
     *                 				Reise.
     */
    public void setUeberbuchung(Integer ueberbuchung) {
        this.ueberbuchung = ueberbuchung;
    }

    /**
     * Gets the vorgangstaetigkeitListe value for this VorgangType.
     *
     * @return vorgangstaetigkeitListe
     */
    public VorgangstaetigkeitType[] getVorgangstaetigkeitListe() {
        return vorgangstaetigkeitListe;
    }

    /**
     * Sets the vorgangstaetigkeitListe value for this VorgangType.
     *
     * @param vorgangstaetigkeitListe
     */
    public void setVorgangstaetigkeitListe(VorgangstaetigkeitType[] vorgangstaetigkeitListe) {
        this.vorgangstaetigkeitListe = vorgangstaetigkeitListe;
    }

    /**
     * Gets the istStunden value for this VorgangType.
     *
     * @return istStunden
     */
    public Float getIstStunden() {
        return istStunden;
    }

    /**
     * Sets the istStunden value for this VorgangType.
     *
     * @param istStunden
     */
    public void setIstStunden(Float istStunden) {
        this.istStunden = istStunden;
    }

    /**
     * Gets the istStundenFakt value for this VorgangType.
     *
     * @return istStundenFakt
     */
    public Float getIstStundenFakt() {
        return istStundenFakt;
    }

    /**
     * Sets the istStundenFakt value for this VorgangType.
     *
     * @param istStundenFakt
     */
    public void setIstStundenFakt(Float istStundenFakt) {
        this.istStundenFakt = istStundenFakt;
    }

    /**
     * Gets the id value for this VorgangType.
     *
     * @return id   * NUR für updateVorgang bzw. deleteVorgang Operationen, vor allem
     * um den übergeordneten Vorgang zu ändern.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this VorgangType.
     *
     * @param id   * NUR für updateVorgang bzw. deleteVorgang Operationen, vor allem
     * um den übergeordneten Vorgang zu ändern.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the parentId value for this VorgangType.
     *
     * @return parentId   * NUR für Operationen createVorgang bzw.
     *                 				updateVorgang. Wenn Vorgang kein Parent
     *                 				hat dann bitte mit 0 belegen bei
     *                 				updateVorgang.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId value for this VorgangType.
     *
     * @param parentId   * NUR für Operationen createVorgang bzw.
     *                 				updateVorgang. Wenn Vorgang kein Parent
     *                 				hat dann bitte mit 0 belegen bei
     *                 				updateVorgang.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the projektId value for this VorgangType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this VorgangType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the belegErfassung value for this VorgangType.
     *
     * @return belegErfassung
     */
    public Boolean getBelegErfassung() {
        return belegErfassung;
    }

    /**
     * Sets the belegErfassung value for this VorgangType.
     *
     * @param belegErfassung
     */
    public void setBelegErfassung(Boolean belegErfassung) {
        this.belegErfassung = belegErfassung;
    }

    /**
     * Gets the action value for this VorgangType.
     *
     * @return action   * Aktion. Um den Vorgang im Rahmen eines
     *                 				Updates zu löschen muss hier "delete"
     *                 				angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this VorgangType.
     *
     * @param action   * Aktion. Um den Vorgang im Rahmen eines
     *                 				Updates zu löschen muss hier "delete"
     *                 				angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Gets the attributes value for this VorgangType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this VorgangType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VorgangType)) return false;
        VorgangType other = (VorgangType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.parent == null && other.getParent() == null) ||
                        (this.parent != null &&
                                this.parent.equals(other.getParent()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.vorgangName == null && other.getVorgangName() == null) ||
                        (this.vorgangName != null &&
                                this.vorgangName.equals(other.getVorgangName()))) &&
                ((this.startDatum == null && other.getStartDatum() == null) ||
                        (this.startDatum != null &&
                                this.startDatum.equals(other.getStartDatum()))) &&
                ((this.endeDatum == null && other.getEndeDatum() == null) ||
                        (this.endeDatum != null &&
                                this.endeDatum.equals(other.getEndeDatum()))) &&
                ((this.planStunden == null && other.getPlanStunden() == null) ||
                        (this.planStunden != null &&
                                this.planStunden.equals(other.getPlanStunden()))) &&
                ((this.dynamischePlanStunden == null && other.getDynamischePlanStunden() == null) ||
                        (this.dynamischePlanStunden != null &&
                                this.dynamischePlanStunden.equals(other.getDynamischePlanStunden()))) &&
                ((this.planArbeitsentgelt == null && other.getPlanArbeitsentgelt() == null) ||
                        (this.planArbeitsentgelt != null &&
                                this.planArbeitsentgelt.equals(other.getPlanArbeitsentgelt()))) &&
                ((this.dynamischePlanArbeitsentgelt == null && other.getDynamischePlanArbeitsentgelt() == null) ||
                        (this.dynamischePlanArbeitsentgelt != null &&
                                this.dynamischePlanArbeitsentgelt.equals(other.getDynamischePlanArbeitsentgelt()))) &&
                ((this.planBelege == null && other.getPlanBelege() == null) ||
                        (this.planBelege != null &&
                                this.planBelege.equals(other.getPlanBelege()))) &&
                ((this.dynamischePlanKosten == null && other.getDynamischePlanKosten() == null) ||
                        (this.dynamischePlanKosten != null &&
                                this.dynamischePlanKosten.equals(other.getDynamischePlanKosten()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.sortierung == null && other.getSortierung() == null) ||
                        (this.sortierung != null &&
                                this.sortierung.equals(other.getSortierung()))) &&
                ((this.kostentraeger == null && other.getKostentraeger() == null) ||
                        (this.kostentraeger != null &&
                                this.kostentraeger.equals(other.getKostentraeger()))) &&
                ((this.kostenstelle == null && other.getKostenstelle() == null) ||
                        (this.kostenstelle != null &&
                                this.kostenstelle.equals(other.getKostenstelle()))) &&
                ((this.vorgangMitarbeiterListe == null && other.getVorgangMitarbeiterListe() == null) ||
                        (this.vorgangMitarbeiterListe != null &&
                                this.vorgangMitarbeiterListe.equals(other.getVorgangMitarbeiterListe()))) &&
                ((this.defaultFakt == null && other.getDefaultFakt() == null) ||
                        (this.defaultFakt != null &&
                                this.defaultFakt.equals(other.getDefaultFakt()))) &&
                ((this.rechenArt == null && other.getRechenArt() == null) ||
                        (this.rechenArt != null &&
                                this.rechenArt.equals(other.getRechenArt()))) &&
                ((this.ueberbuchung == null && other.getUeberbuchung() == null) ||
                        (this.ueberbuchung != null &&
                                this.ueberbuchung.equals(other.getUeberbuchung()))) &&
                ((this.vorgangstaetigkeitListe == null && other.getVorgangstaetigkeitListe() == null) ||
                        (this.vorgangstaetigkeitListe != null &&
                                java.util.Arrays.equals(this.vorgangstaetigkeitListe, other.getVorgangstaetigkeitListe()))) &&
                ((this.istStunden == null && other.getIstStunden() == null) ||
                        (this.istStunden != null &&
                                this.istStunden.equals(other.getIstStunden()))) &&
                ((this.istStundenFakt == null && other.getIstStundenFakt() == null) ||
                        (this.istStundenFakt != null &&
                                this.istStundenFakt.equals(other.getIstStundenFakt()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.parentId == null && other.getParentId() == null) ||
                        (this.parentId != null &&
                                this.parentId.equals(other.getParentId()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.belegErfassung == null && other.getBelegErfassung() == null) ||
                        (this.belegErfassung != null &&
                                this.belegErfassung.equals(other.getBelegErfassung()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction()))) &&
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
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getVorgangName() != null) {
            _hashCode += getVorgangName().hashCode();
        }
        if (getStartDatum() != null) {
            _hashCode += getStartDatum().hashCode();
        }
        if (getEndeDatum() != null) {
            _hashCode += getEndeDatum().hashCode();
        }
        if (getPlanStunden() != null) {
            _hashCode += getPlanStunden().hashCode();
        }
        if (getDynamischePlanStunden() != null) {
            _hashCode += getDynamischePlanStunden().hashCode();
        }
        if (getPlanArbeitsentgelt() != null) {
            _hashCode += getPlanArbeitsentgelt().hashCode();
        }
        if (getDynamischePlanArbeitsentgelt() != null) {
            _hashCode += getDynamischePlanArbeitsentgelt().hashCode();
        }
        if (getPlanBelege() != null) {
            _hashCode += getPlanBelege().hashCode();
        }
        if (getDynamischePlanKosten() != null) {
            _hashCode += getDynamischePlanKosten().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSortierung() != null) {
            _hashCode += getSortierung().hashCode();
        }
        if (getKostentraeger() != null) {
            _hashCode += getKostentraeger().hashCode();
        }
        if (getKostenstelle() != null) {
            _hashCode += getKostenstelle().hashCode();
        }
        if (getVorgangMitarbeiterListe() != null) {
            _hashCode += getVorgangMitarbeiterListe().hashCode();
        }
        if (getDefaultFakt() != null) {
            _hashCode += getDefaultFakt().hashCode();
        }
        if (getRechenArt() != null) {
            _hashCode += getRechenArt().hashCode();
        }
        if (getUeberbuchung() != null) {
            _hashCode += getUeberbuchung().hashCode();
        }
        if (getVorgangstaetigkeitListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getVorgangstaetigkeitListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getVorgangstaetigkeitListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIstStunden() != null) {
            _hashCode += getIstStunden().hashCode();
        }
        if (getIstStundenFakt() != null) {
            _hashCode += getIstStundenFakt().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getBelegErfassung() != null) {
            _hashCode += getBelegErfassung().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
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
