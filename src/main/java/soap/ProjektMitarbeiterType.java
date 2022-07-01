/**
 * ProjektMitarbeiterType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Zuordnung eines Mitarbeiters zu einem Projekt.
 */
public class ProjektMitarbeiterType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ProjektMitarbeiterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektMitarbeiterType"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("von");
        elemField.setXmlName(new javax.xml.namespace.QName("", "von"));
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
        elemField.setFieldName("preisgruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisgruppe"));
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
        elemField.setFieldName("istProjektleiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istProjektleiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internersatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internersatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("satztype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "satztype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verfuegbarkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verfuegbarkeit"));
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

    private Integer id;
    /* Die Nummer des Projekts. */
    private String projektNr;
    /* Der Benutzername des Mitarbeiters.
     *                 				Pflicht bei Anlage. */
    private String userId;
    /* Das Datum, ab dem der Mitarbeiter dem
     *                 				Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT. */
    private String von;
    /* Das Datum, bis zu dem der Mitarbeiter
     *                 				dem Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT. */
    private String bis;
    /* Die Bezeichnung der Preisgruppe, in der
     *                 				der Mitarbeiter dem Projekt zugeordnet
     *                 				ist. */
    private String preisgruppe;
    /* Eine Bemerkung zur Zuordnung. */
    private String bemerkung;
    /* Flagge, ob der Mitarbeiter dem Projekt
     *                 				als Projektleiter zugeordnet ist:
     *
     *                 				0 => Projektmitarbeiter 1 =>
     *                 				Projektleiter mit Budjetverantwortung 2
     *                 				=> Projektleiter ohne
     *                 				Budjetverantwortung */
    private Integer istProjektleiter;
    private Double internersatz;
    /* Steuert den 'internersatz': 1 =
     *                 				Stundensatz 2 = Tagessatz (Dies gilt nur
     *                 				beim Freelancer) */
    private int satztype;
    /* dies gilt nur für Resourceplanung Module */
    private Integer verfuegbarkeit;
    private Integer projektId;
    /* Aktion. Um den Mitarbeiter im Rahmen
     *                 				eines Updates aus dem Projekt zu
     *                 				entfernen muss hier "delete" angegeben
     *                 				werden. */
    private String action;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ProjektMitarbeiterType() {
    }


    public ProjektMitarbeiterType(
            Integer id,
            String projektNr,
            String userId,
            String von,
            String bis,
            String preisgruppe,
            String bemerkung,
            Integer istProjektleiter,
            Double internersatz,
            int satztype,
            Integer verfuegbarkeit,
            Integer projektId,
            String action,
            AttributeType[] attributes) {
        this.id = id;
        this.projektNr = projektNr;
        this.userId = userId;
        this.von = von;
        this.bis = bis;
        this.preisgruppe = preisgruppe;
        this.bemerkung = bemerkung;
        this.istProjektleiter = istProjektleiter;
        this.internersatz = internersatz;
        this.satztype = satztype;
        this.verfuegbarkeit = verfuegbarkeit;
        this.projektId = projektId;
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
     * Gets the id value for this ProjektMitarbeiterType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ProjektMitarbeiterType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the projektNr value for this ProjektMitarbeiterType.
     *
     * @return projektNr   * Die Nummer des Projekts.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this ProjektMitarbeiterType.
     *
     * @param projektNr   * Die Nummer des Projekts.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the userId value for this ProjektMitarbeiterType.
     *
     * @return userId   * Der Benutzername des Mitarbeiters.
     *                 				Pflicht bei Anlage.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ProjektMitarbeiterType.
     *
     * @param userId   * Der Benutzername des Mitarbeiters.
     *                 				Pflicht bei Anlage.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the von value for this ProjektMitarbeiterType.
     *
     * @return von   * Das Datum, ab dem der Mitarbeiter dem
     *                 				Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ProjektMitarbeiterType.
     *
     * @param von   * Das Datum, ab dem der Mitarbeiter dem
     *                 				Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ProjektMitarbeiterType.
     *
     * @return bis   * Das Datum, bis zu dem der Mitarbeiter
     *                 				dem Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ProjektMitarbeiterType.
     *
     * @param bis   * Das Datum, bis zu dem der Mitarbeiter
     *                 				dem Projekt zugeordnet ist. Format:
     *                 				JJJJ-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the preisgruppe value for this ProjektMitarbeiterType.
     *
     * @return preisgruppe   * Die Bezeichnung der Preisgruppe, in der
     *                 				der Mitarbeiter dem Projekt zugeordnet
     *                 				ist.
     */
    public String getPreisgruppe() {
        return preisgruppe;
    }

    /**
     * Sets the preisgruppe value for this ProjektMitarbeiterType.
     *
     * @param preisgruppe   * Die Bezeichnung der Preisgruppe, in der
     *                 				der Mitarbeiter dem Projekt zugeordnet
     *                 				ist.
     */
    public void setPreisgruppe(String preisgruppe) {
        this.preisgruppe = preisgruppe;
    }

    /**
     * Gets the bemerkung value for this ProjektMitarbeiterType.
     *
     * @return bemerkung   * Eine Bemerkung zur Zuordnung.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this ProjektMitarbeiterType.
     *
     * @param bemerkung   * Eine Bemerkung zur Zuordnung.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the istProjektleiter value for this ProjektMitarbeiterType.
     *
     * @return istProjektleiter   * Flagge, ob der Mitarbeiter dem Projekt
     *                 				als Projektleiter zugeordnet ist:
     *
     *                 				0 => Projektmitarbeiter 1 =>
     *                 				Projektleiter mit Budjetverantwortung 2
     *                 				=> Projektleiter ohne
     *                 				Budjetverantwortung
     */
    public Integer getIstProjektleiter() {
        return istProjektleiter;
    }

    /**
     * Sets the istProjektleiter value for this ProjektMitarbeiterType.
     *
     * @param istProjektleiter   * Flagge, ob der Mitarbeiter dem Projekt
     *                 				als Projektleiter zugeordnet ist:
     *
     *                 				0 => Projektmitarbeiter 1 =>
     *                 				Projektleiter mit Budjetverantwortung 2
     *                 				=> Projektleiter ohne
     *                 				Budjetverantwortung
     */
    public void setIstProjektleiter(Integer istProjektleiter) {
        this.istProjektleiter = istProjektleiter;
    }

    /**
     * Gets the internersatz value for this ProjektMitarbeiterType.
     *
     * @return internersatz
     */
    public Double getInternersatz() {
        return internersatz;
    }

    /**
     * Sets the internersatz value for this ProjektMitarbeiterType.
     *
     * @param internersatz
     */
    public void setInternersatz(Double internersatz) {
        this.internersatz = internersatz;
    }

    /**
     * Gets the satztype value for this ProjektMitarbeiterType.
     *
     * @return satztype   * Steuert den 'internersatz': 1 =
     *                 				Stundensatz 2 = Tagessatz (Dies gilt nur
     *                 				beim Freelancer)
     */
    public int getSatztype() {
        return satztype;
    }

    /**
     * Sets the satztype value for this ProjektMitarbeiterType.
     *
     * @param satztype   * Steuert den 'internersatz': 1 =
     *                 				Stundensatz 2 = Tagessatz (Dies gilt nur
     *                 				beim Freelancer)
     */
    public void setSatztype(int satztype) {
        this.satztype = satztype;
    }

    /**
     * Gets the verfuegbarkeit value for this ProjektMitarbeiterType.
     *
     * @return verfuegbarkeit   * dies gilt nur für Resourceplanung Module
     */
    public Integer getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    /**
     * Sets the verfuegbarkeit value for this ProjektMitarbeiterType.
     *
     * @param verfuegbarkeit   * dies gilt nur für Resourceplanung Module
     */
    public void setVerfuegbarkeit(Integer verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    /**
     * Gets the projektId value for this ProjektMitarbeiterType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ProjektMitarbeiterType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the action value for this ProjektMitarbeiterType.
     *
     * @return action   * Aktion. Um den Mitarbeiter im Rahmen
     *                 				eines Updates aus dem Projekt zu
     *                 				entfernen muss hier "delete" angegeben
     *                 				werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this ProjektMitarbeiterType.
     *
     * @param action   * Aktion. Um den Mitarbeiter im Rahmen
     *                 				eines Updates aus dem Projekt zu
     *                 				entfernen muss hier "delete" angegeben
     *                 				werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Gets the attributes value for this ProjektMitarbeiterType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ProjektMitarbeiterType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjektMitarbeiterType)) return false;
        ProjektMitarbeiterType other = (ProjektMitarbeiterType) obj;
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
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.preisgruppe == null && other.getPreisgruppe() == null) ||
                        (this.preisgruppe != null &&
                                this.preisgruppe.equals(other.getPreisgruppe()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.istProjektleiter == null && other.getIstProjektleiter() == null) ||
                        (this.istProjektleiter != null &&
                                this.istProjektleiter.equals(other.getIstProjektleiter()))) &&
                ((this.internersatz == null && other.getInternersatz() == null) ||
                        (this.internersatz != null &&
                                this.internersatz.equals(other.getInternersatz()))) &&
                this.satztype == other.getSatztype() &&
                ((this.verfuegbarkeit == null && other.getVerfuegbarkeit() == null) ||
                        (this.verfuegbarkeit != null &&
                                this.verfuegbarkeit.equals(other.getVerfuegbarkeit()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getPreisgruppe() != null) {
            _hashCode += getPreisgruppe().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getIstProjektleiter() != null) {
            _hashCode += getIstProjektleiter().hashCode();
        }
        if (getInternersatz() != null) {
            _hashCode += getInternersatz().hashCode();
        }
        _hashCode += getSatztype();
        if (getVerfuegbarkeit() != null) {
            _hashCode += getVerfuegbarkeit().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
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
