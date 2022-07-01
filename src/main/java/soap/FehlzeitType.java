/**
 * FehlzeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter einer Fehlzeit.
 */
public class FehlzeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FehlzeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehlzeitType"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enddatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehlgrund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehlgrund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istHalberTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istHalberTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genehmigt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genehmigt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonZeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisZeit"));
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
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailversandUnterdruecken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailversandUnterdruecken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

    /* Die Id der Fehlzeit. */
    private Integer id;
    /* Der Benutzer dem die Fehlzeit zugeordnet ist. */
    private String userId;
    /* Das Startdatum der Fehlzeit. */
    private String startdatum;
    /* Das Datum, bis zu dem die Fehlzeit gilt. Falls leer, so entspricht
     * das Endedatum dem Startdatum. */
    private String enddatum;
    /* Die Kurzbezeichnung des zugeordneten Fehlgrundes. */
    private String fehlgrund;
    /* true: Fehlzeit is halber Tag. leer/false: Fehlzeit ist ganzer
     * Tag. Wenn 'vonZeit' und 'bisZeit' gesetzt sind, so gilt die Fehlzeit
     * als Anzahl Stunden */
    private Boolean istHalberTag;
    /* Kennung bei einer genehmigungspflichtigen Fehlzeit, ob diese
     * genehmigt ist oder nicht. Falls die Fehlzeit nicht genehmigungspflicht
     * ist dann bleibt das Feld leer. */
    private Boolean genehmigt;
    /* Diese gilt nur für eine Fehlzeit mit Dauer in Stunden, das
     * Feld 'bisZeit' muss auch belegt sein. */
    private String vonZeit;
    /* Dies gilt nur für eine Fehlzeit m,it Dauer in Stunden, das
     * Feld 'vonZeit' muss auch belegt sein. */
    private String bisZeit;
    /* Die Bemerkung zur Fehlzeit. */
    private String bemerkung;
    /* gilt nur für Fehlzeiten mit von/bis-Zeiten. Beispiele: 'Europe/Berlin',
     * 'Africa/Abidjan', 'America/Argentina/Catamarca', 'Asia/Manila', 'Australia/Lindeman' */
    private String timezone;
    /* Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (create/update) unterdrückt. */
    private Boolean mailversandUnterdruecken;
    /* Der Zeitpunkt der Anlage des Objekts. */
    private String created;
    /* Der Zeitpunkt der letzten Änderung des Objekts. */
    private String modified;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FehlzeitType() {
    }


    public FehlzeitType(
            Integer id,
            String userId,
            String startdatum,
            String enddatum,
            String fehlgrund,
            Boolean istHalberTag,
            Boolean genehmigt,
            String vonZeit,
            String bisZeit,
            String bemerkung,
            String timezone,
            Boolean mailversandUnterdruecken,
            String created,
            String modified,
            AttributeType[] attributes) {
        this.id = id;
        this.userId = userId;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.fehlgrund = fehlgrund;
        this.istHalberTag = istHalberTag;
        this.genehmigt = genehmigt;
        this.vonZeit = vonZeit;
        this.bisZeit = bisZeit;
        this.bemerkung = bemerkung;
        this.timezone = timezone;
        this.mailversandUnterdruecken = mailversandUnterdruecken;
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
     * Gets the id value for this FehlzeitType.
     *
     * @return id   * Die Id der Fehlzeit.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this FehlzeitType.
     *
     * @param id   * Die Id der Fehlzeit.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this FehlzeitType.
     *
     * @return userId   * Der Benutzer dem die Fehlzeit zugeordnet ist.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this FehlzeitType.
     *
     * @param userId   * Der Benutzer dem die Fehlzeit zugeordnet ist.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the startdatum value for this FehlzeitType.
     *
     * @return startdatum   * Das Startdatum der Fehlzeit.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this FehlzeitType.
     *
     * @param startdatum   * Das Startdatum der Fehlzeit.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the enddatum value for this FehlzeitType.
     *
     * @return enddatum   * Das Datum, bis zu dem die Fehlzeit gilt. Falls leer, so entspricht
     * das Endedatum dem Startdatum.
     */
    public String getEnddatum() {
        return enddatum;
    }

    /**
     * Sets the enddatum value for this FehlzeitType.
     *
     * @param enddatum   * Das Datum, bis zu dem die Fehlzeit gilt. Falls leer, so entspricht
     * das Endedatum dem Startdatum.
     */
    public void setEnddatum(String enddatum) {
        this.enddatum = enddatum;
    }

    /**
     * Gets the fehlgrund value for this FehlzeitType.
     *
     * @return fehlgrund   * Die Kurzbezeichnung des zugeordneten Fehlgrundes.
     */
    public String getFehlgrund() {
        return fehlgrund;
    }

    /**
     * Sets the fehlgrund value for this FehlzeitType.
     *
     * @param fehlgrund   * Die Kurzbezeichnung des zugeordneten Fehlgrundes.
     */
    public void setFehlgrund(String fehlgrund) {
        this.fehlgrund = fehlgrund;
    }

    /**
     * Gets the istHalberTag value for this FehlzeitType.
     *
     * @return istHalberTag   * true: Fehlzeit is halber Tag. leer/false: Fehlzeit ist ganzer
     * Tag. Wenn 'vonZeit' und 'bisZeit' gesetzt sind, so gilt die Fehlzeit
     * als Anzahl Stunden
     */
    public Boolean getIstHalberTag() {
        return istHalberTag;
    }

    /**
     * Sets the istHalberTag value for this FehlzeitType.
     *
     * @param istHalberTag   * true: Fehlzeit is halber Tag. leer/false: Fehlzeit ist ganzer
     * Tag. Wenn 'vonZeit' und 'bisZeit' gesetzt sind, so gilt die Fehlzeit
     * als Anzahl Stunden
     */
    public void setIstHalberTag(Boolean istHalberTag) {
        this.istHalberTag = istHalberTag;
    }

    /**
     * Gets the genehmigt value for this FehlzeitType.
     *
     * @return genehmigt   * Kennung bei einer genehmigungspflichtigen Fehlzeit, ob diese
     * genehmigt ist oder nicht. Falls die Fehlzeit nicht genehmigungspflicht
     * ist dann bleibt das Feld leer.
     */
    public Boolean getGenehmigt() {
        return genehmigt;
    }

    /**
     * Sets the genehmigt value for this FehlzeitType.
     *
     * @param genehmigt   * Kennung bei einer genehmigungspflichtigen Fehlzeit, ob diese
     * genehmigt ist oder nicht. Falls die Fehlzeit nicht genehmigungspflicht
     * ist dann bleibt das Feld leer.
     */
    public void setGenehmigt(Boolean genehmigt) {
        this.genehmigt = genehmigt;
    }

    /**
     * Gets the vonZeit value for this FehlzeitType.
     *
     * @return vonZeit   * Diese gilt nur für eine Fehlzeit mit Dauer in Stunden, das
     * Feld 'bisZeit' muss auch belegt sein.
     */
    public String getVonZeit() {
        return vonZeit;
    }

    /**
     * Sets the vonZeit value for this FehlzeitType.
     *
     * @param vonZeit   * Diese gilt nur für eine Fehlzeit mit Dauer in Stunden, das
     * Feld 'bisZeit' muss auch belegt sein.
     */
    public void setVonZeit(String vonZeit) {
        this.vonZeit = vonZeit;
    }

    /**
     * Gets the bisZeit value for this FehlzeitType.
     *
     * @return bisZeit   * Dies gilt nur für eine Fehlzeit m,it Dauer in Stunden, das
     * Feld 'vonZeit' muss auch belegt sein.
     */
    public String getBisZeit() {
        return bisZeit;
    }

    /**
     * Sets the bisZeit value for this FehlzeitType.
     *
     * @param bisZeit   * Dies gilt nur für eine Fehlzeit m,it Dauer in Stunden, das
     * Feld 'vonZeit' muss auch belegt sein.
     */
    public void setBisZeit(String bisZeit) {
        this.bisZeit = bisZeit;
    }

    /**
     * Gets the bemerkung value for this FehlzeitType.
     *
     * @return bemerkung   * Die Bemerkung zur Fehlzeit.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this FehlzeitType.
     *
     * @param bemerkung   * Die Bemerkung zur Fehlzeit.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the timezone value for this FehlzeitType.
     *
     * @return timezone   * gilt nur für Fehlzeiten mit von/bis-Zeiten. Beispiele: 'Europe/Berlin',
     * 'Africa/Abidjan', 'America/Argentina/Catamarca', 'Asia/Manila', 'Australia/Lindeman'
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the timezone value for this FehlzeitType.
     *
     * @param timezone   * gilt nur für Fehlzeiten mit von/bis-Zeiten. Beispiele: 'Europe/Berlin',
     * 'Africa/Abidjan', 'America/Argentina/Catamarca', 'Asia/Manila', 'Australia/Lindeman'
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Gets the mailversandUnterdruecken value for this FehlzeitType.
     *
     * @return mailversandUnterdruecken   * Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (create/update) unterdrückt.
     */
    public Boolean getMailversandUnterdruecken() {
        return mailversandUnterdruecken;
    }

    /**
     * Sets the mailversandUnterdruecken value for this FehlzeitType.
     *
     * @param mailversandUnterdruecken   * Ist gleich false oder nicht mitgegeben dann werden mitarbeiter
     * benachrichtigt (falls sie benachritigt werden müssen). Ist gleich
     * true dann werden Benchrichtigungen beim (create/update) unterdrückt.
     */
    public void setMailversandUnterdruecken(Boolean mailversandUnterdruecken) {
        this.mailversandUnterdruecken = mailversandUnterdruecken;
    }

    /**
     * Gets the created value for this FehlzeitType.
     *
     * @return created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this FehlzeitType.
     *
     * @param created   * Der Zeitpunkt der Anlage des Objekts.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this FehlzeitType.
     *
     * @return modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this FehlzeitType.
     *
     * @param modified   * Der Zeitpunkt der letzten Änderung des Objekts.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the attributes value for this FehlzeitType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this FehlzeitType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FehlzeitType)) return false;
        FehlzeitType other = (FehlzeitType) obj;
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
                ((this.enddatum == null && other.getEnddatum() == null) ||
                        (this.enddatum != null &&
                                this.enddatum.equals(other.getEnddatum()))) &&
                ((this.fehlgrund == null && other.getFehlgrund() == null) ||
                        (this.fehlgrund != null &&
                                this.fehlgrund.equals(other.getFehlgrund()))) &&
                ((this.istHalberTag == null && other.getIstHalberTag() == null) ||
                        (this.istHalberTag != null &&
                                this.istHalberTag.equals(other.getIstHalberTag()))) &&
                ((this.genehmigt == null && other.getGenehmigt() == null) ||
                        (this.genehmigt != null &&
                                this.genehmigt.equals(other.getGenehmigt()))) &&
                ((this.vonZeit == null && other.getVonZeit() == null) ||
                        (this.vonZeit != null &&
                                this.vonZeit.equals(other.getVonZeit()))) &&
                ((this.bisZeit == null && other.getBisZeit() == null) ||
                        (this.bisZeit != null &&
                                this.bisZeit.equals(other.getBisZeit()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.timezone == null && other.getTimezone() == null) ||
                        (this.timezone != null &&
                                this.timezone.equals(other.getTimezone()))) &&
                ((this.mailversandUnterdruecken == null && other.getMailversandUnterdruecken() == null) ||
                        (this.mailversandUnterdruecken != null &&
                                this.mailversandUnterdruecken.equals(other.getMailversandUnterdruecken()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getEnddatum() != null) {
            _hashCode += getEnddatum().hashCode();
        }
        if (getFehlgrund() != null) {
            _hashCode += getFehlgrund().hashCode();
        }
        if (getIstHalberTag() != null) {
            _hashCode += getIstHalberTag().hashCode();
        }
        if (getGenehmigt() != null) {
            _hashCode += getGenehmigt().hashCode();
        }
        if (getVonZeit() != null) {
            _hashCode += getVonZeit().hashCode();
        }
        if (getBisZeit() != null) {
            _hashCode += getBisZeit().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getMailversandUnterdruecken() != null) {
            _hashCode += getMailversandUnterdruecken().hashCode();
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
