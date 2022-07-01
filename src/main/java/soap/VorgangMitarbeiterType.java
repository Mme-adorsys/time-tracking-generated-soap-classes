/**
 * VorgangMitarbeiterType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Mitarbeiters, der einem Vorgang zugeordnet wird.
 */
public class VorgangMitarbeiterType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(VorgangMitarbeiterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "VorgangMitarbeiterType"));
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
        elemField.setFieldName("preisgruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisgruppe"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
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
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    private Integer id;
    /* Pflicht beim Anlegen */
    private String userId;
    /* Die Preisgruppe, in der der Mitarbeiter
     *                 				dem Vorgang zugeordnet wird. */
    private String preisgruppe;
    /* Das Anfangsdatum des
     *                 				Zuordnungszeitraums. Format: JJJJ-MM-TT. */
    private String von;
    /* Das Enddatum des Zuordnungszeitraums.
     *                 				Format: JJJJ-MM-TT. */
    private String bis;
    /* Die bemerkung zur Zuordnung. */
    private String bemerkung;
    /* Die Nummer des Vorgangs, dem der
     *                 				Mitarbeiter zugeordnet wird. */
    private String vorgangNr;
    /* Die Nummer des Projektes, dem der
     *                 				Mitarbeiter zugeordnet wird. */
    private String projektNr;
    /* Aktion. Um Vorgangsmitarbeiter im Rahmen
     *                 				eines Updates zu löschen muss hier
     *                 				"delete" angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public VorgangMitarbeiterType() {
    }


    public VorgangMitarbeiterType(
            Integer id,
            String userId,
            String preisgruppe,
            String von,
            String bis,
            String bemerkung,
            String vorgangNr,
            String projektNr,
            String action) {
        this.id = id;
        this.userId = userId;
        this.preisgruppe = preisgruppe;
        this.von = von;
        this.bis = bis;
        this.bemerkung = bemerkung;
        this.vorgangNr = vorgangNr;
        this.projektNr = projektNr;
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
     * Gets the id value for this VorgangMitarbeiterType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this VorgangMitarbeiterType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this VorgangMitarbeiterType.
     *
     * @return userId   * Pflicht beim Anlegen
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this VorgangMitarbeiterType.
     *
     * @param userId   * Pflicht beim Anlegen
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the preisgruppe value for this VorgangMitarbeiterType.
     *
     * @return preisgruppe   * Die Preisgruppe, in der der Mitarbeiter
     *                 				dem Vorgang zugeordnet wird.
     */
    public String getPreisgruppe() {
        return preisgruppe;
    }

    /**
     * Sets the preisgruppe value for this VorgangMitarbeiterType.
     *
     * @param preisgruppe   * Die Preisgruppe, in der der Mitarbeiter
     *                 				dem Vorgang zugeordnet wird.
     */
    public void setPreisgruppe(String preisgruppe) {
        this.preisgruppe = preisgruppe;
    }

    /**
     * Gets the von value for this VorgangMitarbeiterType.
     *
     * @return von   * Das Anfangsdatum des
     *                 				Zuordnungszeitraums. Format: JJJJ-MM-TT.
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this VorgangMitarbeiterType.
     *
     * @param von   * Das Anfangsdatum des
     *                 				Zuordnungszeitraums. Format: JJJJ-MM-TT.
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this VorgangMitarbeiterType.
     *
     * @return bis   * Das Enddatum des Zuordnungszeitraums.
     *                 				Format: JJJJ-MM-TT.
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this VorgangMitarbeiterType.
     *
     * @param bis   * Das Enddatum des Zuordnungszeitraums.
     *                 				Format: JJJJ-MM-TT.
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the bemerkung value for this VorgangMitarbeiterType.
     *
     * @return bemerkung   * Die bemerkung zur Zuordnung.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this VorgangMitarbeiterType.
     *
     * @param bemerkung   * Die bemerkung zur Zuordnung.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the vorgangNr value for this VorgangMitarbeiterType.
     *
     * @return vorgangNr   * Die Nummer des Vorgangs, dem der
     *                 				Mitarbeiter zugeordnet wird.
     */
    public String getVorgangNr() {
        return vorgangNr;
    }

    /**
     * Sets the vorgangNr value for this VorgangMitarbeiterType.
     *
     * @param vorgangNr   * Die Nummer des Vorgangs, dem der
     *                 				Mitarbeiter zugeordnet wird.
     */
    public void setVorgangNr(String vorgangNr) {
        this.vorgangNr = vorgangNr;
    }

    /**
     * Gets the projektNr value for this VorgangMitarbeiterType.
     *
     * @return projektNr   * Die Nummer des Projektes, dem der
     *                 				Mitarbeiter zugeordnet wird.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this VorgangMitarbeiterType.
     *
     * @param projektNr   * Die Nummer des Projektes, dem der
     *                 				Mitarbeiter zugeordnet wird.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the action value for this VorgangMitarbeiterType.
     *
     * @return action   * Aktion. Um Vorgangsmitarbeiter im Rahmen
     *                 				eines Updates zu löschen muss hier
     *                 				"delete" angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this VorgangMitarbeiterType.
     *
     * @param action   * Aktion. Um Vorgangsmitarbeiter im Rahmen
     *                 				eines Updates zu löschen muss hier
     *                 				"delete" angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VorgangMitarbeiterType)) return false;
        VorgangMitarbeiterType other = (VorgangMitarbeiterType) obj;
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
                ((this.preisgruppe == null && other.getPreisgruppe() == null) ||
                        (this.preisgruppe != null &&
                                this.preisgruppe.equals(other.getPreisgruppe()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.vorgangNr == null && other.getVorgangNr() == null) ||
                        (this.vorgangNr != null &&
                                this.vorgangNr.equals(other.getVorgangNr()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
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
        if (getPreisgruppe() != null) {
            _hashCode += getPreisgruppe().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getVorgangNr() != null) {
            _hashCode += getVorgangNr().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
