/**
 * RegelarbeitszeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Dies eingeben nur wenn Regelarbeitszeiten von Standard-Arbeitszeiten
 * in der Einstellungen abweichen soll, diese wird per default angelegt.
 */
public class RegelarbeitszeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RegelarbeitszeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RegelarbeitszeitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("startdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "montag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dienstag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dienstag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mittwoch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mittwoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donnerstag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "donnerstag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freitag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freitag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samstag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samstag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonntag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonntag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumStundenImMonat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumStundenImMonat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumStundenInWoche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumStundenInWoche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monatlich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monatlich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monatlicheStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monatlicheStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feiertagskalender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feiertagskalender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FeiertagskalenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pausenregelung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pausenregelung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PausenregelungType"));
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
    }

    /* Die Id des Regelarbeitszeit-Objektes. */
    private Integer id;
    /* Die Userid des Benutzers, dem diese
     *                 				Regelarbeitszeit zugeordnet ist. */
    private String userId;
    /* Das Datum, ab dem die Regelarbeitszeit
     *                 				gilt. Leer oder nicht angegeben =
     *                 				Beschaeftigungsbeginn. Es dürfen nicht
     *                 				zwei Regelarbeitszeiten mit leerem
     *                 				Starddatum angelegt werden. */
    private String startdatum;
    /* - Die Regelarbeitszeit am Montag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet. */
    private Double montag;
    /* - Die Regelarbeitszeit am Dienstag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet. */
    private Double dienstag;
    /* - Die Regelarbeitszeit am Mittwoch: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet. */
    private Double mittwoch;
    /* - Die Regelarbeitszeit am Donnerstag:
     *                 				Wenn gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet. */
    private Double donnerstag;
    /* - Die Regelarbeitszeit am Freitag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet. */
    private Double freitag;
    /* - Die Regelarbeitszeit am Samstag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet. */
    private Double samstag;
    /* - Die Regelarbeitszeit am Sonntag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet. */
    private Double sonntag;
    /* Die Stundenobergrenze im Monat. */
    private Double maximumStundenImMonat;
    private Double maximumStundenInWoche;
    /* Achtung: Bitte die Hilfe in ZEP-Frontend
     *                 				lesen bevor hier ein TRUE setzen.
     *                 				Default ist false und false bedeutet
     *                 				täglich. */
    private Boolean monatlich;
    /* wird wahr genommen nur wenn monatlich
     *                 				gleich true ist */
    private Double monatlicheStunden;
    private FeiertagskalenderType feiertagskalender;
    private PausenregelungType pausenregelung;
    /* Die auf dem Regelarbeitszeit-Objekt
     *                 				auszuführende Aktion. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public RegelarbeitszeitType() {
    }


    public RegelarbeitszeitType(
            Integer id,
            String userId,
            String startdatum,
            Double montag,
            Double dienstag,
            Double mittwoch,
            Double donnerstag,
            Double freitag,
            Double samstag,
            Double sonntag,
            Double maximumStundenImMonat,
            Double maximumStundenInWoche,
            Boolean monatlich,
            Double monatlicheStunden,
            FeiertagskalenderType feiertagskalender,
            PausenregelungType pausenregelung,
            String action) {
        this.id = id;
        this.userId = userId;
        this.startdatum = startdatum;
        this.montag = montag;
        this.dienstag = dienstag;
        this.mittwoch = mittwoch;
        this.donnerstag = donnerstag;
        this.freitag = freitag;
        this.samstag = samstag;
        this.sonntag = sonntag;
        this.maximumStundenImMonat = maximumStundenImMonat;
        this.maximumStundenInWoche = maximumStundenInWoche;
        this.monatlich = monatlich;
        this.monatlicheStunden = monatlicheStunden;
        this.feiertagskalender = feiertagskalender;
        this.pausenregelung = pausenregelung;
        this.action = action;
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
     * Gets the id value for this RegelarbeitszeitType.
     *
     * @return id   * Die Id des Regelarbeitszeit-Objektes.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this RegelarbeitszeitType.
     *
     * @param id   * Die Id des Regelarbeitszeit-Objektes.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this RegelarbeitszeitType.
     *
     * @return userId   * Die Userid des Benutzers, dem diese
     *                 				Regelarbeitszeit zugeordnet ist.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this RegelarbeitszeitType.
     *
     * @param userId   * Die Userid des Benutzers, dem diese
     *                 				Regelarbeitszeit zugeordnet ist.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the startdatum value for this RegelarbeitszeitType.
     *
     * @return startdatum   * Das Datum, ab dem die Regelarbeitszeit
     *                 				gilt. Leer oder nicht angegeben =
     *                 				Beschaeftigungsbeginn. Es dürfen nicht
     *                 				zwei Regelarbeitszeiten mit leerem
     *                 				Starddatum angelegt werden.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this RegelarbeitszeitType.
     *
     * @param startdatum   * Das Datum, ab dem die Regelarbeitszeit
     *                 				gilt. Leer oder nicht angegeben =
     *                 				Beschaeftigungsbeginn. Es dürfen nicht
     *                 				zwei Regelarbeitszeiten mit leerem
     *                 				Starddatum angelegt werden.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the montag value for this RegelarbeitszeitType.
     *
     * @return montag   * - Die Regelarbeitszeit am Montag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public Double getMontag() {
        return montag;
    }

    /**
     * Sets the montag value for this RegelarbeitszeitType.
     *
     * @param montag   * - Die Regelarbeitszeit am Montag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public void setMontag(Double montag) {
        this.montag = montag;
    }

    /**
     * Gets the dienstag value for this RegelarbeitszeitType.
     *
     * @return dienstag   * - Die Regelarbeitszeit am Dienstag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public Double getDienstag() {
        return dienstag;
    }

    /**
     * Sets the dienstag value for this RegelarbeitszeitType.
     *
     * @param dienstag   * - Die Regelarbeitszeit am Dienstag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public void setDienstag(Double dienstag) {
        this.dienstag = dienstag;
    }

    /**
     * Gets the mittwoch value for this RegelarbeitszeitType.
     *
     * @return mittwoch   * - Die Regelarbeitszeit am Mittwoch: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public Double getMittwoch() {
        return mittwoch;
    }

    /**
     * Sets the mittwoch value for this RegelarbeitszeitType.
     *
     * @param mittwoch   * - Die Regelarbeitszeit am Mittwoch: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public void setMittwoch(Double mittwoch) {
        this.mittwoch = mittwoch;
    }

    /**
     * Gets the donnerstag value for this RegelarbeitszeitType.
     *
     * @return donnerstag   * - Die Regelarbeitszeit am Donnerstag:
     *                 				Wenn gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public Double getDonnerstag() {
        return donnerstag;
    }

    /**
     * Sets the donnerstag value for this RegelarbeitszeitType.
     *
     * @param donnerstag   * - Die Regelarbeitszeit am Donnerstag:
     *                 				Wenn gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public void setDonnerstag(Double donnerstag) {
        this.donnerstag = donnerstag;
    }

    /**
     * Gets the freitag value for this RegelarbeitszeitType.
     *
     * @return freitag   * - Die Regelarbeitszeit am Freitag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public Double getFreitag() {
        return freitag;
    }

    /**
     * Sets the freitag value for this RegelarbeitszeitType.
     *
     * @param freitag   * - Die Regelarbeitszeit am Freitag: Wenn
     *                 				gleich -1 oder leer dann ist kein
     *                 				Arbeitstag, ansonnsten ist Arbeitstag. -
     *                 				Wenn 'monatlich' den Wert true hat und
     *                 				dieser Tag ein Arbeitstag sein soll dann
     *                 				irgend ein Wert > 0 eingeben, der
     *                 				gültige wird sowieso automatisch aus dem
     *                 				'monatlischeStunden' gerechnet.
     */
    public void setFreitag(Double freitag) {
        this.freitag = freitag;
    }

    /**
     * Gets the samstag value for this RegelarbeitszeitType.
     *
     * @return samstag   * - Die Regelarbeitszeit am Samstag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet.
     */
    public Double getSamstag() {
        return samstag;
    }

    /**
     * Sets the samstag value for this RegelarbeitszeitType.
     *
     * @param samstag   * - Die Regelarbeitszeit am Samstag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet.
     */
    public void setSamstag(Double samstag) {
        this.samstag = samstag;
    }

    /**
     * Gets the sonntag value for this RegelarbeitszeitType.
     *
     * @return sonntag   * - Die Regelarbeitszeit am Sonntag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet.
     */
    public Double getSonntag() {
        return sonntag;
    }

    /**
     * Sets the sonntag value for this RegelarbeitszeitType.
     *
     * @param sonntag   * - Die Regelarbeitszeit am Sonntag: Wenn
     *                 				größer oder gleich 0 dann ist
     *                 				Arbeitstag, ansonnsten ist kein
     *                 				Arbeitstag. - Wenn 'monatlich' den Wert
     *                 				true hat und dieser Tag ein Arbeitstag
     *                 				sein soll dann irgend ein Wert > 0
     *                 				eingeben, der gültige wird sowieso
     *                 				automatisch aus dem 'monatlischeStunden'
     *                 				gerechnet.
     */
    public void setSonntag(Double sonntag) {
        this.sonntag = sonntag;
    }

    /**
     * Gets the maximumStundenImMonat value for this RegelarbeitszeitType.
     *
     * @return maximumStundenImMonat   * Die Stundenobergrenze im Monat.
     */
    public Double getMaximumStundenImMonat() {
        return maximumStundenImMonat;
    }

    /**
     * Sets the maximumStundenImMonat value for this RegelarbeitszeitType.
     *
     * @param maximumStundenImMonat   * Die Stundenobergrenze im Monat.
     */
    public void setMaximumStundenImMonat(Double maximumStundenImMonat) {
        this.maximumStundenImMonat = maximumStundenImMonat;
    }

    /**
     * Gets the maximumStundenInWoche value for this RegelarbeitszeitType.
     *
     * @return maximumStundenInWoche
     */
    public Double getMaximumStundenInWoche() {
        return maximumStundenInWoche;
    }

    /**
     * Sets the maximumStundenInWoche value for this RegelarbeitszeitType.
     *
     * @param maximumStundenInWoche
     */
    public void setMaximumStundenInWoche(Double maximumStundenInWoche) {
        this.maximumStundenInWoche = maximumStundenInWoche;
    }

    /**
     * Gets the monatlich value for this RegelarbeitszeitType.
     *
     * @return monatlich   * Achtung: Bitte die Hilfe in ZEP-Frontend
     *                 				lesen bevor hier ein TRUE setzen.
     *                 				Default ist false und false bedeutet
     *                 				täglich.
     */
    public Boolean getMonatlich() {
        return monatlich;
    }

    /**
     * Sets the monatlich value for this RegelarbeitszeitType.
     *
     * @param monatlich   * Achtung: Bitte die Hilfe in ZEP-Frontend
     *                 				lesen bevor hier ein TRUE setzen.
     *                 				Default ist false und false bedeutet
     *                 				täglich.
     */
    public void setMonatlich(Boolean monatlich) {
        this.monatlich = monatlich;
    }

    /**
     * Gets the monatlicheStunden value for this RegelarbeitszeitType.
     *
     * @return monatlicheStunden   * wird wahr genommen nur wenn monatlich
     *                 				gleich true ist
     */
    public Double getMonatlicheStunden() {
        return monatlicheStunden;
    }

    /**
     * Sets the monatlicheStunden value for this RegelarbeitszeitType.
     *
     * @param monatlicheStunden   * wird wahr genommen nur wenn monatlich
     *                 				gleich true ist
     */
    public void setMonatlicheStunden(Double monatlicheStunden) {
        this.monatlicheStunden = monatlicheStunden;
    }

    /**
     * Gets the feiertagskalender value for this RegelarbeitszeitType.
     *
     * @return feiertagskalender
     */
    public FeiertagskalenderType getFeiertagskalender() {
        return feiertagskalender;
    }

    /**
     * Sets the feiertagskalender value for this RegelarbeitszeitType.
     *
     * @param feiertagskalender
     */
    public void setFeiertagskalender(FeiertagskalenderType feiertagskalender) {
        this.feiertagskalender = feiertagskalender;
    }

    /**
     * Gets the pausenregelung value for this RegelarbeitszeitType.
     *
     * @return pausenregelung
     */
    public PausenregelungType getPausenregelung() {
        return pausenregelung;
    }

    /**
     * Sets the pausenregelung value for this RegelarbeitszeitType.
     *
     * @param pausenregelung
     */
    public void setPausenregelung(PausenregelungType pausenregelung) {
        this.pausenregelung = pausenregelung;
    }

    /**
     * Gets the action value for this RegelarbeitszeitType.
     *
     * @return action   * Die auf dem Regelarbeitszeit-Objekt
     *                 				auszuführende Aktion.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this RegelarbeitszeitType.
     *
     * @param action   * Die auf dem Regelarbeitszeit-Objekt
     *                 				auszuführende Aktion.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RegelarbeitszeitType)) return false;
        RegelarbeitszeitType other = (RegelarbeitszeitType) obj;
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
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
                ((this.montag == null && other.getMontag() == null) ||
                        (this.montag != null &&
                                this.montag.equals(other.getMontag()))) &&
                ((this.dienstag == null && other.getDienstag() == null) ||
                        (this.dienstag != null &&
                                this.dienstag.equals(other.getDienstag()))) &&
                ((this.mittwoch == null && other.getMittwoch() == null) ||
                        (this.mittwoch != null &&
                                this.mittwoch.equals(other.getMittwoch()))) &&
                ((this.donnerstag == null && other.getDonnerstag() == null) ||
                        (this.donnerstag != null &&
                                this.donnerstag.equals(other.getDonnerstag()))) &&
                ((this.freitag == null && other.getFreitag() == null) ||
                        (this.freitag != null &&
                                this.freitag.equals(other.getFreitag()))) &&
                ((this.samstag == null && other.getSamstag() == null) ||
                        (this.samstag != null &&
                                this.samstag.equals(other.getSamstag()))) &&
                ((this.sonntag == null && other.getSonntag() == null) ||
                        (this.sonntag != null &&
                                this.sonntag.equals(other.getSonntag()))) &&
                ((this.maximumStundenImMonat == null && other.getMaximumStundenImMonat() == null) ||
                        (this.maximumStundenImMonat != null &&
                                this.maximumStundenImMonat.equals(other.getMaximumStundenImMonat()))) &&
                ((this.maximumStundenInWoche == null && other.getMaximumStundenInWoche() == null) ||
                        (this.maximumStundenInWoche != null &&
                                this.maximumStundenInWoche.equals(other.getMaximumStundenInWoche()))) &&
                ((this.monatlich == null && other.getMonatlich() == null) ||
                        (this.monatlich != null &&
                                this.monatlich.equals(other.getMonatlich()))) &&
                ((this.monatlicheStunden == null && other.getMonatlicheStunden() == null) ||
                        (this.monatlicheStunden != null &&
                                this.monatlicheStunden.equals(other.getMonatlicheStunden()))) &&
                ((this.feiertagskalender == null && other.getFeiertagskalender() == null) ||
                        (this.feiertagskalender != null &&
                                this.feiertagskalender.equals(other.getFeiertagskalender()))) &&
                ((this.pausenregelung == null && other.getPausenregelung() == null) ||
                        (this.pausenregelung != null &&
                                this.pausenregelung.equals(other.getPausenregelung()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getMontag() != null) {
            _hashCode += getMontag().hashCode();
        }
        if (getDienstag() != null) {
            _hashCode += getDienstag().hashCode();
        }
        if (getMittwoch() != null) {
            _hashCode += getMittwoch().hashCode();
        }
        if (getDonnerstag() != null) {
            _hashCode += getDonnerstag().hashCode();
        }
        if (getFreitag() != null) {
            _hashCode += getFreitag().hashCode();
        }
        if (getSamstag() != null) {
            _hashCode += getSamstag().hashCode();
        }
        if (getSonntag() != null) {
            _hashCode += getSonntag().hashCode();
        }
        if (getMaximumStundenImMonat() != null) {
            _hashCode += getMaximumStundenImMonat().hashCode();
        }
        if (getMaximumStundenInWoche() != null) {
            _hashCode += getMaximumStundenInWoche().hashCode();
        }
        if (getMonatlich() != null) {
            _hashCode += getMonatlich().hashCode();
        }
        if (getMonatlicheStunden() != null) {
            _hashCode += getMonatlicheStunden().hashCode();
        }
        if (getFeiertagskalender() != null) {
            _hashCode += getFeiertagskalender().hashCode();
        }
        if (getPausenregelung() != null) {
            _hashCode += getPausenregelung().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
