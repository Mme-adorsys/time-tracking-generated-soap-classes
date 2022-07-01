/**
 * FeiertagAusnahmeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class FeiertagAusnahmeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FeiertagAusnahmeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FeiertagAusnahmeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnungDe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnungDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnungEn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnungEn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnungFr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnungFr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wertigkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wertigkeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuschlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zuschlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zuschlagFolgetagBis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zuschlagFolgetagBis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
    }

    private String datum;
    private String userId;
    private String name;
    private String bezeichnungDe;
    private String bezeichnungEn;
    private String bezeichnungFr;
    private Integer wertigkeit;
    private Integer zuschlag;
    private String zuschlagFolgetagBis;
    private String created;
    private String modified;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FeiertagAusnahmeType() {
    }


    public FeiertagAusnahmeType(
            String datum,
            String userId,
            String name,
            String bezeichnungDe,
            String bezeichnungEn,
            String bezeichnungFr,
            Integer wertigkeit,
            Integer zuschlag,
            String zuschlagFolgetagBis,
            String created,
            String modified) {
        this.datum = datum;
        this.userId = userId;
        this.name = name;
        this.bezeichnungDe = bezeichnungDe;
        this.bezeichnungEn = bezeichnungEn;
        this.bezeichnungFr = bezeichnungFr;
        this.wertigkeit = wertigkeit;
        this.zuschlag = zuschlag;
        this.zuschlagFolgetagBis = zuschlagFolgetagBis;
        this.created = created;
        this.modified = modified;
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
     * Gets the datum value for this FeiertagAusnahmeType.
     *
     * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this FeiertagAusnahmeType.
     *
     * @param datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the userId value for this FeiertagAusnahmeType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this FeiertagAusnahmeType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the name value for this FeiertagAusnahmeType.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this FeiertagAusnahmeType.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the bezeichnungDe value for this FeiertagAusnahmeType.
     *
     * @return bezeichnungDe
     */
    public String getBezeichnungDe() {
        return bezeichnungDe;
    }

    /**
     * Sets the bezeichnungDe value for this FeiertagAusnahmeType.
     *
     * @param bezeichnungDe
     */
    public void setBezeichnungDe(String bezeichnungDe) {
        this.bezeichnungDe = bezeichnungDe;
    }

    /**
     * Gets the bezeichnungEn value for this FeiertagAusnahmeType.
     *
     * @return bezeichnungEn
     */
    public String getBezeichnungEn() {
        return bezeichnungEn;
    }

    /**
     * Sets the bezeichnungEn value for this FeiertagAusnahmeType.
     *
     * @param bezeichnungEn
     */
    public void setBezeichnungEn(String bezeichnungEn) {
        this.bezeichnungEn = bezeichnungEn;
    }

    /**
     * Gets the bezeichnungFr value for this FeiertagAusnahmeType.
     *
     * @return bezeichnungFr
     */
    public String getBezeichnungFr() {
        return bezeichnungFr;
    }

    /**
     * Sets the bezeichnungFr value for this FeiertagAusnahmeType.
     *
     * @param bezeichnungFr
     */
    public void setBezeichnungFr(String bezeichnungFr) {
        this.bezeichnungFr = bezeichnungFr;
    }

    /**
     * Gets the wertigkeit value for this FeiertagAusnahmeType.
     *
     * @return wertigkeit
     */
    public Integer getWertigkeit() {
        return wertigkeit;
    }

    /**
     * Sets the wertigkeit value for this FeiertagAusnahmeType.
     *
     * @param wertigkeit
     */
    public void setWertigkeit(Integer wertigkeit) {
        this.wertigkeit = wertigkeit;
    }

    /**
     * Gets the zuschlag value for this FeiertagAusnahmeType.
     *
     * @return zuschlag
     */
    public Integer getZuschlag() {
        return zuschlag;
    }

    /**
     * Sets the zuschlag value for this FeiertagAusnahmeType.
     *
     * @param zuschlag
     */
    public void setZuschlag(Integer zuschlag) {
        this.zuschlag = zuschlag;
    }

    /**
     * Gets the zuschlagFolgetagBis value for this FeiertagAusnahmeType.
     *
     * @return zuschlagFolgetagBis
     */
    public String getZuschlagFolgetagBis() {
        return zuschlagFolgetagBis;
    }

    /**
     * Sets the zuschlagFolgetagBis value for this FeiertagAusnahmeType.
     *
     * @param zuschlagFolgetagBis
     */
    public void setZuschlagFolgetagBis(String zuschlagFolgetagBis) {
        this.zuschlagFolgetagBis = zuschlagFolgetagBis;
    }

    /**
     * Gets the created value for this FeiertagAusnahmeType.
     *
     * @return created
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this FeiertagAusnahmeType.
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this FeiertagAusnahmeType.
     *
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this FeiertagAusnahmeType.
     *
     * @param modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FeiertagAusnahmeType)) return false;
        FeiertagAusnahmeType other = (FeiertagAusnahmeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.bezeichnungDe == null && other.getBezeichnungDe() == null) ||
                        (this.bezeichnungDe != null &&
                                this.bezeichnungDe.equals(other.getBezeichnungDe()))) &&
                ((this.bezeichnungEn == null && other.getBezeichnungEn() == null) ||
                        (this.bezeichnungEn != null &&
                                this.bezeichnungEn.equals(other.getBezeichnungEn()))) &&
                ((this.bezeichnungFr == null && other.getBezeichnungFr() == null) ||
                        (this.bezeichnungFr != null &&
                                this.bezeichnungFr.equals(other.getBezeichnungFr()))) &&
                ((this.wertigkeit == null && other.getWertigkeit() == null) ||
                        (this.wertigkeit != null &&
                                this.wertigkeit.equals(other.getWertigkeit()))) &&
                ((this.zuschlag == null && other.getZuschlag() == null) ||
                        (this.zuschlag != null &&
                                this.zuschlag.equals(other.getZuschlag()))) &&
                ((this.zuschlagFolgetagBis == null && other.getZuschlagFolgetagBis() == null) ||
                        (this.zuschlagFolgetagBis != null &&
                                this.zuschlagFolgetagBis.equals(other.getZuschlagFolgetagBis()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBezeichnungDe() != null) {
            _hashCode += getBezeichnungDe().hashCode();
        }
        if (getBezeichnungEn() != null) {
            _hashCode += getBezeichnungEn().hashCode();
        }
        if (getBezeichnungFr() != null) {
            _hashCode += getBezeichnungFr().hashCode();
        }
        if (getWertigkeit() != null) {
            _hashCode += getWertigkeit().hashCode();
        }
        if (getZuschlag() != null) {
            _hashCode += getZuschlag().hashCode();
        }
        if (getZuschlagFolgetagBis() != null) {
            _hashCode += getZuschlagFolgetagBis().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
