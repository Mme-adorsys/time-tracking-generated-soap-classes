<?xml version="1.0" encoding="UTF-8" standalone="no"?>
        <wsdl:definitions name="zep" targetNamespace="http://zep.provantis.de" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://zep.provantis.de" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
    <wsdl:types>
        <xsd:schema targetNamespace="http://zep.provantis.de">
            <xsd:complexType name="ReadProjektzeitenRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Projektzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readProjektzeitenSearchCriteria" type="tns:ReadProjektzeitenSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche von Zeitbuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadProjektzeitenResponseType">
                <xsd:annotation>
                    <xsd:documentation>Ergebnis der Projektzeiten-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektzeitListe" type="tns:ProjektzeitenListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Zeitbuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadProjektzeitenSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Suchkriterien für die Suche von Projektzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="von" type="tns:IsoDate"
                		minOccurs="0" maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, ab dem Projektzeiten
                				geliefert werden sollen. Falls keine
                				anderen Suchkriterien spezifiziert
                				werden müssen von und bis angegeben
                				werden. Format: JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bis" type="tns:IsoDate"
                		minOccurs="0" maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, bis zu dem Projektzeiten
                				geliefert werden sollen. Falls keine
                				anderen Suchkriterien spezifiziert
                				werden müssen von und bis angegeben
                				werden. Format: JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektNrListe"
                		type="tns:ProjektNrListeType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste der Projekt-Nummern der zu
                				berücksichtigenden Projekte.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="userIdListe"
                		type="tns:UserIdListeType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste der Benutzernamen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="modifiedSince"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="fakturierbar" type="tns:int0_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>2=fakturierbare, 1=nicht fakturierbare, 0 oder leer = alle</xsd:documentation>
                		</xsd:annotation></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjektNrListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Projektnummern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektNr" type="tns:String64" minOccurs="0" maxOccurs="unbounded">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Projektnummer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UserIdListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Benutzernamen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="tns:String32" minOccurs="0" maxOccurs="unbounded">
                        <xsd:annotation>
                            <xsd:documentation>Der Anmeldename eines Benutzers
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ResponseHeaderType">
                <xsd:annotation>
                    <xsd:documentation>Allgemeiner Antwort-Header, der in jeder Response mitgeliefert wird und Informationen zur Request-Ausführung enthält.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="version" type="xsd:string" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Versionsnummer der SOAP Schnittstelle.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="returnCode" type="xsd:string" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Fehlercode der Request-Ausführung. 0 falls kein Fehler.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="message" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Eine Fehlermeldung oder Information der Request-Ausführung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="RequestHeaderType">
                <xsd:annotation>
                    <xsd:documentation>Der allgemeine ZEP Request-Header. Muss in Request-Header oder Request-Body vorkommen, wenn die Authentifizierung-Method in Administration > Einstellungen via Token ausgewählt.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="authorizationToken" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das SOAP-Token zur Autorisierung des Requests, siehe ZEP: Administration - Einstellungen - SOAP
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjektzeitenListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Zeitbuchungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektzeiten" type="tns:ProjektzeitType" minOccurs="0" maxOccurs="unbounded">
                        <xsd:annotation>
                            <xsd:documentation>Die einzelnen Zeitbuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Zeitbuchungen in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="ProjektzeitType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die eindeutige Id der Zeitbuchung. Leer bei Anlage, Pflicht bei Update und Löschen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Anmeldename des Benutzers, dem die Zeitbuchung zugeordnet ist. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum der Zeitbuchung. Pflicht bei Anlage. Format: JJJJ-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="von" type="tns:IsoTime" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Anfangszeit der Zeitbuchung. Diese muss dem aktuell eingestellten Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bis" type="tns:IsoTime" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Ende-Zeit der Zeitbuchung. Diese muss dem aktuell eingestellten Raster entsprechen. Pflicht bei Anlage. Format: HH:MM.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="dauer" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Dauer der Zeitbuchung. Format: HH:MM.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="istFakturierbar" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob die Zeitbuchung fakturierbar ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="istOrtProjektRelevant" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob der Arbeitsort der Zeitbuchung projektrelevant ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ort" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Arbeitsort der Zeitbuchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bemerkung" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bemerkung zur Zeitbuchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektNr" type="tns:String64" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Projektes, auf das sich die Zeitbuchung bezieht. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vorgangNr" type="tns:String64" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Vorgangs, auf den sich die Zeitbuchung bezieht. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="taetigkeit" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Tätigkeit der Zeitbuchung. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="start" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: der Startort der Reise. Pflicht bei Anlage von Reisebuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ziel" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: der Zielort der Reise. Pflicht bei Anlage von Reisebuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="km" type="xsd:int" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: die gefahrenen Kilometer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="anzahlMitfahrer" type="xsd:int" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: die Anzahl der Mitfahrer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fahrzeug" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: das verwendete Fahrzeug.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketNr" type="xsd:int" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Tickets, auf das sich die Zeitbuchung bezieht.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabeNr" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer der Teilaufgabe, auf die sich die Zeitbuchung bezieht.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="reiseRichtung" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen. Die Richtung der Reise (Wertebereich: "hin", "weiter", "rueck"). Pflicht bei Anlage von Reisebuchungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="istPrivatFahrzeug" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Bei Reise-Buchungen: Flagge, ob die Fahrt mit einem Privat-Fahrzeug unternommen wurde.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="vorgangId" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die technische Id des Vorgangs (nur Lesen).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die technische Id des Projekts (nur Lesen).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der Anlage des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der letzten Änderung des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadProjekteRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readProjekteSearchCriteria" type="tns:ReadProjekteSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche von Projekten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadProjekteResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektListe" type="tns:ProjektListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Projekte.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjektListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projekt" type="tns:ProjektType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in dieser Liste enthaltenen Projekte.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Projekte in dieser Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="ProjektType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="projektNr" type="tns:String64"
                		minOccurs="0" maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projekts. Wenn die
                				Nummernkreis in der
                				Projekt-Einstellungen definiert ist und
                				dies beutzt werden soll, dann bitte bei
                				Anlage leer lassen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Kunden, dem dieses
                				Projekt zugeordnet ist. Pflicht bei der
                				Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bezeichnung" type="tns:String255"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Projektes. Pflicht
                				beim Anlegen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Abteilung, der das Projekt
                				zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="startDatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Start-Datum des Projekts. Format:
                				JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="endeDatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Ende-Datum des Projekts. Format:
                				JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Bemerkung zum Projekt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="planKosten"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die geplanten Kosten des Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="dynamischePlanKosten"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="planStunden"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die geplanten Stunden des Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="dynamischePlanStunden"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="planArbeitsentgelt"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Plan Arbeitsentgelt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="dynamischePlanArbeitsentgelt"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="planPauschal"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der geplante Pauschalpreis des Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kostenstelle" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kostenstelle des Projekts (bei
                				Einsatz des Moduls 'Export für
                				Buchhaltung').
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenAuftrag"
                		type="tns:String64" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Aufragsnummer des Kunden für dieses
                				Projekt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kostentraeger"
                		type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Kostenträger des Projekts (bei
                				Einsatz des Moduls 'Export für
                				Buchhaltung').
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="status" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status des Projekts. Dieses ist die
                				Kurzbezeichnung eines der in den
                				Stammdaten definierten Status.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektortListe"
                		type="tns:ProjektortListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der Projektorte.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangListe"
                		type="tns:VorgangListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der Vorgänge des Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektmitarbeiterListe"
                		type="tns:ProjektMitarbeiterListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der Projektmitarbeiter.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projekttaetigkeitListe"
                		type="tns:ProjekttaetigkeitListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der projektspezifischen
                				Tätigkeiten.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="preistabelleListe"
                		type="tns:PreistabelleListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der Projekt-Preistabellen des
                				Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="defaultFakt" type="tns:int1_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				1=Fakturierbar änderbar(durchMitarbeiter
                				) 2=Fakturierbar nicht änderbar (durch
                				Mitarbeiter) 3=Nicht fakturierbar
                				änderbar (durch Mitarbeiter) 4=Nicht
                				fakturierbar nciht änderbar (durch
                				Mitarbeiter )
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechenArt" type="tns:int1_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				1=Abrechnung Stundensatz 2=Abrechnung
                				Tagessatz 3=Abrechnung Pauschal
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ueberbuchung" type="tns:int0_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=Überbuchung nicht verhindern.
                				1=Überbuchung verhindern nur für
                				fakturierbare Zeiten. 2=Überbuchung
                				verhindern alle Zeiten. 3=Fakturierbar
                				ohne Reise. 4=Alle ohne Reise.

                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="waehrung" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Projektwährung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="projektbundesland"
                		type="tns:String64" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="projektland" type="tns:String32"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="projekttagessatzListe"
                		type="tns:TagessatzanteilListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="kundenansprechpartner"
                		type="tns:AnsprechpartnerType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Dieser soll der Benutzername von
                				Kundenansprechpartner sein, wenn nicht
                				vorhanden dann bleibt leer
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="voreinstFakturierbarkeit"
                		type="tns:int1_4" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				1=Voreinstellung Fakturierbar, durch den
                				Mitarbeiter änderbar 2=Voreinstellung
                				Fakturierbar, durch den Mitarbeiter
                				nicht änderbar 3=Voreinstellung Nicht
                				Fakturierbar, durch den Mitarbeiter
                				änderbar 4=Voreinstellung Nicht
                				Fakturierbar, durch den Mitarbeiter
                				nicht änderbar
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektzusatzfelder"
                		type="tns:ZusatzfelderType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="kategorieListe"
                		type="tns:KategorieListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="schlagworteListe"
                		type="tns:SchlagworteListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="istStunden"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="istStundenFakt"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="sprache" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Leer = ZEP-Standarsprache de : deutsch
                				en : englisch fr : französisch de_at :
                				deutsch-Österreich de_ch :
                				deutsch-Schweitz en_de : englisch mit
                				deutscher Formatierung en_eu :
                				englisch-Europa en_gb :
                				englisch-Großbritannien en_us :
                				englisch-USA fr_de : französisch mit
                				deutscher Formatierung fr_ch :
                				französisch-Schweitz
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>


                	<xsd:element name="url" type="tns:String255"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="vorgaengeEinzelnAbrechnen"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Vorgänge werden einzeln abgerechnet
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="belegeinstellungen" type="tns:BelegeinstellungenType" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="created" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der Anlage des Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="modified" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der letzten Änderung des
                				Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="VorgangListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Vorgängen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="vorgang" type="tns:VorgangType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Vorgänge.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjekttaetigkeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Projekttätigkeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:ProjekttaetigkeitType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Tätigkeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadProjekteSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Suche nach Projekten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                	
                    <xsd:element name="von" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfangsdatum des Zeitraums, in dem
                				die zu liefernden Projekte liegen
                				müssen. Format: YYYY-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="bis" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Enddatum des Zeitraums, in dem die
                				zu liefernden Projekte liegen müssen.
                				Format: YYYY-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des zu liefernden Projektes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Abteilung, der die zu liefernden
                				Projekte zugeordnet sein müssen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="status" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status der zu liefernden Projekte.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="modifiedSince"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0"/>
                	

                	<xsd:element name="schlagworteFilter"
                		type="tns:SchlagworteFilterType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				BItte dies n SearchCriteria statt
                				schlagworteListe benutzen. Das
                				Schlagwort kann hier egal in welcher
                				Sprachen eingeben werden. -ohne- oder
                				-without- oder -sans- lieferen Objekte
                				Ohne Schlagworte
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines neuen Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticket" type="tns:TicketType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des neuen Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateTicketResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Ticket-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines neuen Projekts.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projekt" type="tns:ProjektType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des neuen Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateProjektResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Projekt-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="TicketType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Tickerts.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="ticketNr" type="xsd:int"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Pflicht beim Bearbeiten. Wird bei der
                				Ticket-Anlage nicht beachtet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ersteller" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benurtzername des Erstellers des
                				Tickets. Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projekts, dem das Ticket
                				zugeordnet ist. Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Vorgangs, dem das Ticket
                				zugeordnet ist. Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="betreff" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Betreff des Tickets. Pflicht bei der
                				Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenReferenz"
                		type="tns:String255" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kundenreferenz des Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="datum" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="kundenAnsprechpartner"
                		type="tns:AnsprechpartnerType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="bearbeiter" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Bearbeiters des
                				Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="prioritaet" maxOccurs="1"
                		minOccurs="0" type="tns:Int1_5">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Priorität des Tickets (1-5).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="status" type="tns:int1_20"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status des Tickets (1=neu, 2=in
                				Bearbeitung, 3=fertig, 4=abgelehnt,
                				5=abgenommen).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bemerkung zum Ticket.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="eingangsdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Eingangsdatum des Tickets. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="termin" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Termin des Tickets. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="startdatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Startdatum des Tickets. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="anhangListe"
                		type="tns:AnhangListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Es werden nur die zwei ersten Dateien in
                				dieser Liste pro Request gespeichert der
                				Rest wird ignoriert.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="planstunden"
                		type="tns:Decimal10_2" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="dynamischePlanstunden"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="ueberbuchenVerhindern"
                		type="tns:int0_4" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0: Nein 1: nur fakturierbare Zeiten
                				(inkl. Reisezeiten) 2: fakturierbare und
                				nicht fakturierbare Zeiten (inkl.
                				Reisezeiten) 3: nur fakturierbare Zeiten
                				(ohne Reisezeiten) 4: fakturierbare und
                				nicht fakturierbare Zeiten (ohne
                				Reisezeiten)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kategorieListe"
                		type="tns:KategorieListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="created" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der Anlage des Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="modified" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der letzten Änderung des
                				Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="inbearbeitungdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="fertigdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abgenommendatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abgelehntdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="historyUpdatedatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="schlagworteListe"
                		type="tns:SchlagworteListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="benutzer" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				gilt als angemeldeter User für die
                				Änderungshistorie., falls gesetzt,
                				werden die Berechtigungen für dieses
                				Ticket überprüft.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="istStunden"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="istStundenFakt"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="vorgangId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="teilaufgabeListe"
                		type="tns:TeilaufgabeListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="externeTicketnummer"
                		type="tns:String255" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="bemerkungIstIntern" type="xsd:boolean" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Attribute für kundenspezifische
                				Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines neuen Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mitarbeiter" type="tns:MitarbeiterType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des Mitarbeiters.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateMitarbeiterResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Mitarbeiter-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="MitarbeiterType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:annotation>
                		<xsd:documentation>
                			Die Daten eines einzelnen Mitarbeiters.
                		</xsd:documentation>
                	</xsd:annotation>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername. Pflicht bei Anlage,
                				Update und Löschen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="nachname" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Nachname des Mitarbeiters. Pflicht
                				bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorname" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Vorname des Mitarbeiters. Pflicht
                				bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="email" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der EMail-Adresse des Mitarbeiters.
                				Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="personalNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Personalnummer des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="strasse" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Strasse der Adresse des
                				Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="plz" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die PLZ der Adresse des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ort" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Ort der Adresse des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="land" type="tns:String64"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="telefon" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Telefonnummer des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="fax" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Faxnummer des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="mobil" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Mobilnummer des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="telefonPrivat"
                		type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die private Telefonnummer des
                				Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Bemerkung zum Mitarbeiter.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="sprache" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die (ZEP-)Sprache des Mitarbeiters. Muss
                				bei Anlage und Updates eine der in ZEP
                				definierten Sprachen sein. Wertebereich:
                				Locale, z.B. de, en, fr.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="anrede" type="tns:String20"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Anrede des Mitarbeiters
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="geburtsdatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Geburtsdatum des Mitarbeiter
                				(Format: JJJJ-MM-TT)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kostentraeger"
                		type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der dem Mitarbeiter zugeordnete
                				Kostentraeger (bei Einsatz des Moduls
                				Buchhaltungsexport)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="iban" type="tns:String34"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die IBAN des Kontos des Mitarbeiters
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bic" type="tns:String11"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die BIC des Kontos des Mitarbeiters
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kontoNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kontonummer des Mitarbeiters.
                				Pflicht bei Anlage und Update falls die
                				BLZ gesetzt ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="blz" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die BLZ des Kontos des Mitarbeiters.
                				Pflicht bei Anlage falls die Kontonummer
                				gesetzt ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bankname" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Name der Bank des Kontos des
                				Mitarbeiters
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Abteilung, der der Mitarbeiter
                				zugeordnet ist (mit dem
                				Abteilungs-Modul). Muss bei Anlage und
                				Update eine existierende Abteiung sein
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="preisgruppe" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Preisgruppe des Mitarbeiters.
                				Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="beschaeftigungszeitListe"
                		type="tns:BeschaeftigungszeitListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Liste von Beschäftigungszeiträumen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="regelarbeitszeitListe"
                		type="tns:RegelarbeitszeitListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Liste von
                				Regelarbeitszeit-Definitionen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="freigabedatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, bis zu dem der Mitarbeiter
                				seine Zeiten und Belege freigegeben hat.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="titel" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Titel des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="internersatzListe"
                		type="tns:InternersatzListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von internen Stunden-/Tagessätzen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="waehrung" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Bei Freelancern mit Gutschrift: Währung
                				für Gutschrift.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="mwst" type="tns:Decimal6_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Bei Freelancern mit Gutschrift:
                				MwSt-Satz für Gutschrift.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="freelancer" type="tns:int0_2"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0 oder leer=Mitarbeiter, 1=Freelancer,
                				2=Freelancer mit Gutschrift.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="created" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der Anlage des Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="modified" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der letzten Änderung des
                				Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kurzzeichen" type="tns:String32"
                		minOccurs="0" maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Kurzzeichen des Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechte" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Rolle des Mitarbeiters. 0 oder
                				leer=User, 1=Admin, 2=Controller, 3=User
                				mit Zusatzrechten.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>



                	<xsd:element name="kategorieListe"
                		type="tns:KategorieListeType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="abgeglicheneZeitenListe"
                		type="tns:AbgeglicheneZeitenListeType" maxOccurs="1"
                		minOccurs="0">
                	</xsd:element>
                	<xsd:element name="ueberstundenBerechnenUndAnzeigen"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0">
                	</xsd:element>
                	<xsd:element name="personioId" type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Die Employee-Id des Benutzers in Personio</xsd:documentation>
                		</xsd:annotation></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines neuen Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kunde" type="tns:KundeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des neu anzulegenden Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Kunden-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="KundeType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Die Kundennummer. Pflicht bei Anlage, Update und Löschen.
Wenn die Nummernkreis in der Kunde-Einstellungen definiert ist und dies beutzt werden soll, dann bitte bei Anlage leer lassen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="name" type="tns:String120" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Name des Kunden. Pflicht bei der Anlage eines neuen Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="namenszusatz" type="tns:String120" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung des Kunden (Währungssysmbol, z. B. EUR).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eine Bemerkung zum Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Abteilung, der der Kunde zugeordnet werden soll. Bei der Kundenanlage muss diese bereits in ZEP vorhanden sein.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="branche" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Branche, die dem Kunden zugeordnet ist. Bei der Kundenanlage muss diese bereits in ZEP vorhanden sein.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mwst" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der MsWt-Satz des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bic" type="tns:String11" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die BIC des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="iban" type="tns:String34" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die IBAN des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fax" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Fax-Nummer des Kunden
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="www" type="tns:String120" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der URL der Web-Site des Kunden. Der URL muss ggf. als CDATA angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="email" type="tns:String120" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die EMail-Adresse des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zahlungsziel" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das dem Kunden eingeräumte Zahlungsziel.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ustId" type="tns:String16" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die USt.Id-Nr des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="telefon" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Telefonnummer des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inaktiv" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob der Kunde aktiv oder inaktiv ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="adressenListe" type="tns:AdressenListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Adressen des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ansprechpartnerListe" type="tns:AnsprechpartnerListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Ansprechpartner des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="preistabelleListe" type="tns:PreistabelleListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Preistabellen des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="skontofrist" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Skontofrist in Tagen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenverantwortlicherListe" type="tns:KundenverantwortlicherListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Hier wird die userId erwartet (optional)
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kundenzusatzfelder" type="tns:ZusatzfelderType" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="kategorieListe" type="tns:KategorieListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation/>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der Anlage des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der letzten Änderung des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticket" type="tns:TicketType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten zur Aktualisierung des Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateTicketResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Aktualisierung eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTicketsSearchCriteria" type="tns:ReadTicketsSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Kriterien zur Suche von Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTicketResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen von Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="ticketListe" type="tns:TicketListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTicketsSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Suche von Ticket-Status in den Stammdaten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="ticketNr" type="xsd:int"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des zu lesenden Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kundenReferenz"
                		type="tns:String255" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kunden-Referenz der zu suchenden
                				Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="datum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum der zu suchenden Tickets. Wenn
                				'bis' einen Wert hat, dann werden
                				Tickets zwischen 'datum' und 'bis'
                				geliefert, andernfalls werden nur
                				Tickets an diesem Datum geliefert.
                				Format: JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kundenAnsprechpartner"
                		type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Name des Ansprechpartners beim
                				Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ersteller" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Erstellers des
                				Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bearbeiter" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Bearbeiters des
                				Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projekts, dem das Ticket
                				zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Vorgangs, dem das Ticket
                				zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="betreff" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Betreff oder ein Teil vom Betreff der zu
                				suchenden Tickets.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="prioritaet" maxOccurs="1"
                		minOccurs="0" type="tns:Int1_5">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Priorität des Tickets (1-5).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="modifiedSince"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="schlagworteFilter"
                		type="tns:SchlagworteFilterType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="benutzer" type="tns:String32"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="bis" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="statusListe"
                		type="tns:StatusListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="inklusiveUnterabteilung"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="mitTeilaufgaben"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                	
                	<xsd:element name="teilaufgabeStatusListe"
                		type="tns:StatusListeType" maxOccurs="1"
                		minOccurs="0"/>
                	
                	<xsd:element name="externeTicketnummer" type="tns:String255" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TicketListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ticket" type="tns:TicketType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Tickets.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Tickets in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="UpdateProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung eines Projekts.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projekt" type="tns:ProjektType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten zur Aktualisierung des Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateProjektResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Aktualisierung eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ProjektortType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines einzelnen, einem Projekt zugeordneten Arbeitsortes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                	<xsd:element name="ort" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Arbeitsort, der dem Projekt
                				zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Aktion. Um den Ort im Rahmen eines
                				Updates aus dem Projekt zu entfernen
                				muss hier "delete" angegeben werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="String64">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="64"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String32">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="32"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String255">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="255"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="IsoDate">
                <xsd:annotation>
                    <xsd:documentation>Eine Datumsangabe im ISO-Format: YYYY-MM-DD
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:string">

                    <xsd:pattern value="^\d{4}-\d{2}-\d{2}$"/>

                    <xsd:length value="10"/>

                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="Decimal12_2">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 12 und der Nachkommastellen = 2
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="999999999999.99"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String20">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="20"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String120">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="120"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="Decimal6_4">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 6 und der Nachkommastellen = 4
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="999999.9999"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="Int1_5">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="1"/>
                    <xsd:maxInclusive value="5"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:complexType name="UpdateKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Aktualisieren von Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kunde" type="tns:KundeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten zur Aktualisierung des Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Aktualisierung eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="AttributesType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Attributen für kundenspezifische Erweiterungen
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="attribute" type="tns:AttributeType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="AttributeType">
                <xsd:annotation>
                    <xsd:documentation>Ein kundenspezifisches Attribut (Key-Value).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="value" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Wert des kundenspezifischen Attributes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="name" type="xsd:string">
                    <xsd:annotation>
                        <xsd:documentation>Der Name des kundenspezifischen Attributes.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="UpdateMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Aktualisieren eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mitarbeiter" type="tns:MitarbeiterType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten zur Aktualisierung des Mitarbeiters.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateMitarbeiterResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Aktualisierung eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:simpleType name="String34">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="34"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String11">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="11"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String10">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="10"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="String16">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="16"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:complexType name="AnsprechpartnerType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Kunden-Ansprechpartners.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Id des Ansprechpartners. Pflicht bei
                				Update und Löschen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorname" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Vorname des Ansprechpartners.
                				Pflicht bei Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="name" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Name des Ansprechpartners. Pflicht
                				bei Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="anrede" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Anrede des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="titel" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Titel des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="telefon" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Telefonnummer des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="handy" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Mobilnummer des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="fax" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Faxnummer des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="email" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die EMail-Adresse des Ansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="isPrimary" type="xsd:boolean"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob es sich um den primären
                				Ansprechpartner des Kunden handelt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Wird nur beim Lesen zurückgegeben (wird
                				nicht benötigt für create oder update)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kategorieListe"
                		type="tns:KategorieListeType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="adresse" type="tns:AdresseType"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="berufsbezeichnung"
                		type="tns:String64" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="benutzername" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Zum Löschen des Ansprechpartner im
                				Rahmen des UpdateKunde-Requests auf
                				'delete' setzen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readKundenSearchCriteria" type="tns:ReadKundenSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Kundensuche.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kundeListe" type="tns:KundeListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Mitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readMitarbeiterSearchCriteria" type="tns:ReadMitarbeiterSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche von Mitarbeitern.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadMitarbeiterResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="mitarbeiterListe" type="tns:MitarbeiterListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Mitarbeiter.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="KundeListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kunde" type="tns:KundeType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Kunden in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="MitarbeiterListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Mitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="mitarbeiter" type="tns:MitarbeiterType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Mitarbeiter.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Mitarbeiter in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="ReadKundenSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Kriterien für die Suche nach Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kundennummer des gesuchten Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Abteilung der zu liefernden Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kategorie" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				wir empfehlen 'kategorienKurzform' zu
                				benutzen dies kann mehr als dies (dieses
                				Element wird in Zukunft entfernt)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="branche" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Branche der zu liefernden Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="inklusiveUnterabteilung"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob Kunden, die untergeordneten
                				Abteilungen zugeordnet sind, ebenfalls
                				geliefert werden sollen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="inaktiv" type="xsd:boolean"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob auch inaktive Kunden
                				geliefert werden sollen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="modifiedSince"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="name" type="tns:String120" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadMitarbeiterSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Kriterien für die Suche nach Mitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des zu liefernden
                				Mitarbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="von" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Startdatum des Intervalls, in dem
                				die zu liefernden Mitarbeiter
                				beschäftigt sein müssen. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bis" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des Intervalls, in dem die
                				zu liefernden Mitarbeiter beschäftigt
                				sein müssen. Format: JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="abteilung" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Abteilung der zu liefernden
                				Mitarbeiter.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="inklusiveUnterabteilung"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob Mitarbeiter, die
                				untergeordneten Abteilungen zugeordnet
                				sind, ebenfalls geliefert werden sollen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="modifiedSince"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="email" type="tns:String64"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadKategorieSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Kriterien zum Lesen von Kategorien.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="kurzform" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>mehrere Kategorien können mit Komma getrennt abgefargt werden
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="VorgangType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Vorgangs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Vorgangs. Pflicht bei
                				Anlage, Update und beim Löschen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="parent" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des übergeordneten Vorgangs.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projekts, dem der Vorgang
                				zugeordnet ist. Pflicht bei der Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangName" type="tns:String255"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Vorgangs.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="startDatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Start-Datum des Vorgangs. Format:
                				JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="endeDatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Ende-Datum des Vorgangs. Format:
                				JJJJ-MM-TT
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="planStunden"
                		type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der geplante Aufwand (in Stunden) für
                				den Vorgang.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="dynamischePlanStunden"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0"/>
                	
                	<xsd:element name="planArbeitsentgelt"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das geplante Arbeitsentgelt für den
                				Vorgang.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="dynamischePlanArbeitsentgelt" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="planBelege"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der eingeplante Betrag für Belege und
                				VMA für diesen Vorgang.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="dynamischePlanKosten"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0"/>
                	
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Bemerkung zum Vorgang.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="status" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status des Vorgangs.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="sortierung" type="xsd:int"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Ein Zahl zur Festlegung der
                				Sortier-Reihenfolge.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kostentraeger"
                		type="tns:String32" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der diesem Vorgang zugeordnete
                				Kostenträger.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kostenstelle" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die diesem Vorgang zugeordnete
                				Kostenstelle.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangMitarbeiterListe"
                		type="tns:VorgangMitarbeiterListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der dem Vorgang zugeordneten
                				Mitarbeiter.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="defaultFakt" type="tns:int0_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0 = Fakturierbarkeit geerbt vom Projekt
                				1=Fakturierbar änderbar(durch
                				Mitarbeiter ) 2=Fakturierbar nicht
                				änderbar (durch Mitarbeiter ) 3=Nicht
                				fakturierbar änderbar (durch
                				Mitarbeiter) 4=Nicht fakturierbar nciht
                				änderbar (durch Mitarbeiter )
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechenArt" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=wie Projekt 1=Abrechnung Stundensatz
                				2=Abrechnung Tagessatz 3=Abrechnung
                				Pauschal
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ueberbuchung" type="tns:int0_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=Überbuchung nicht verhindern.
                				1=Überbuchung verhindern nur für
                				fakturierbare Zeiten. 2=Überbuchung
                				verhindern (für alle Zeiten).
                				3=Fakturierbar ohne Reise. 4=Alle ohne
                				Reise.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangstaetigkeitListe"
                		type="tns:VorgangstaetigkeitListeType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="istStunden"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="istStundenFakt"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>NUR für updateVorgang bzw. deleteVorgang Operationen, vor allem um den übergeordneten Vorgang zu ändern.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="parentId" type="xsd:int"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				NUR für Operationen createVorgang bzw.
                				updateVorgang. Wenn Vorgang kein Parent
                				hat dann bitte mit 0 belegen bei
                				updateVorgang.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0" />
                    <xsd:element name="belegErfassung" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Aktion. Um den Vorgang im Rahmen eines
                				Updates zu löschen muss hier "delete"
                				angegeben werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="Decimal10_2">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 10 und der Nachkommastellen = 2
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="9999999999.99"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="Decimal12_4">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 12 und der Nachkommastellen = 4
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="999999999999.9999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="Decimal12_6">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 12 und der Nachkommastellen = 6
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="999999999999.999999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="ProjektMitarbeiterType">
                <xsd:annotation>
                    <xsd:documentation>Die Zuordnung eines Mitarbeiters zu einem Projekt.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Mitarbeiters.
                				Pflicht bei Anlage.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="von" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, ab dem der Mitarbeiter dem
                				Projekt zugeordnet ist. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bis" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, bis zu dem der Mitarbeiter
                				dem Projekt zugeordnet ist. Format:
                				JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="preisgruppe" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung der Preisgruppe, in der
                				der Mitarbeiter dem Projekt zugeordnet
                				ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Bemerkung zur Zuordnung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="istProjektleiter"
                		type="tns:int0_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob der Mitarbeiter dem Projekt
                				als Projektleiter zugeordnet ist:

                				0 => Projektmitarbeiter 1 =>
                				Projektleiter mit Budjetverantwortung 2
                				=> Projektleiter ohne
                				Budjetverantwortung
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="internersatz"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="satztype" type="tns:int0_2"
                		maxOccurs="1" minOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Steuert den 'internersatz': 1 =
                				Stundensatz 2 = Tagessatz (Dies gilt nur
                				beim Freelancer)

                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="verfuegbarkeit"
                		type="tns:int0_100" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				dies gilt nur für Resourceplanung Module
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0"/>
                	
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Aktion. Um den Mitarbeiter im Rahmen
                				eines Updates aus dem Projekt zu
                				entfernen muss hier "delete" angegeben
                				werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="VorgangMitarbeiterType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Mitarbeiters, der einem Vorgang zugeordnet wird.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Pflicht beim Anlegen
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="preisgruppe" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Preisgruppe, in der der Mitarbeiter
                				dem Vorgang zugeordnet wird.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="von" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfangsdatum des
                				Zuordnungszeitraums. Format: JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bis" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Enddatum des Zuordnungszeitraums.
                				Format: JJJJ-MM-TT.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die bemerkung zur Zuordnung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Vorgangs, dem der
                				Mitarbeiter zugeordnet wird.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projektes, dem der
                				Mitarbeiter zugeordnet wird.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Aktion. Um Vorgangsmitarbeiter im Rahmen
                				eines Updates zu löschen muss hier
                				"delete" angegeben werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="KategorieType">
                <xsd:annotation>
                    <xsd:documentation>für Update oder Create ist nur Kurzform einzugeben
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="bezeichnung_de" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                beim Esrtellen oder Bearbeiten wird ignoriert
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung_en" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                beim Esrtellen oder Bearbeiten wird ignoriert
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung_fr" type="xsd:string" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                beim Esrtellen oder Bearbeiten wird ignoriert
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um die Kategorie-Zuordnung zum Object im Rahmen eines Updates zu entfernen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="Decimal13_10">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 13 und der Nachkommastellen = 10
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="9999999999999.9999999999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="ProjektMitarbeiterListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Projektmitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektmitarbeiter" type="tns:ProjektMitarbeiterType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Projektmitarbeiter.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="KategorieListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Kategorien.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="kategorie"
                		type="tns:KategorieType" minOccurs="0"
                		maxOccurs="unbounded">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Liste der Kategorien.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="alteUeberschreiben" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>

            </xsd:complexType>
            <xsd:complexType name="CreateProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage einer neuen Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektzeit" type="tns:ProjektzeitType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten der Zeitbuchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateProjektzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Projektzeit-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ids" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Ids der angelegten Projektzeiten durch Komma getrennt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektzeit" type="tns:ProjektzeitType">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten zur Aktualisierung der Zeitbuchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateProjektzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Aktualisierung einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ids" type="xsd:string">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der id der aktualisierte Projektzeit und ids der eventuell durch Splitung angelegte Projektzeiten, durch Komma getrennt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="Int1_7">
            	<xsd:restriction base="xsd:int">
            		<xsd:minInclusive value="1" />
            		<xsd:maxInclusive value="7" />
            	</xsd:restriction>
            </xsd:simpleType>
            <xsd:complexType name="DeleteProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Id der zu löschenden Zeitbuchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteProjektzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Löschen einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKategorieRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage von Kategorien.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kategorieArt" type="xsd:string" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                kategorieArt muss ein Wert haben (Klein oder Groß geschrieben): mitarbeiter, projekt, kunde, ansprechpartner, angebot, ticket oder dokument
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readKategorieSearchCriteria" type="tns:ReadKategorieSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKategorieResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kategorieListe" type="tns:KategorieListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTaetigkeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zum Lesen von Tätigkeiten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader"
                                 type="tns:RequestHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTaetigkeitSearchCriteria" type="tns:ReadTaetigkeitSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTaetigkeitResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader"
                                 type="tns:ResponseHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="taetigkeitListe" type="tns:TaetigkeitListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gefundenen Tätigkeiten.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadEinstellungenRequestType">
                <xsd:sequence>
                    <xsd:element name="requestHeader"
                                 type="tns:RequestHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadEinstellungenResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader"
                                 type="tns:ResponseHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektzeitUndBelege" type="tns:ProjektzeitUndBelegeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadOrtslisteRequestType">
                <xsd:sequence>
                    <xsd:element name="requestHeader"
                                 type="tns:RequestHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readOrtslisteSearchCriteria" type="tns:ReadOrtslisteSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadOrtslisteResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader"
                                 type="tns:ResponseHeaderType" minOccurs="0"
                                 maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ortslisteListe"
                                 type="tns:OrtslisteListeType" maxOccurs="1"
                                 minOccurs="0"/>
                    
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKommtGehtRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der allgemeine ZEP Response-Header.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="readKommtGehtSearchCriteria" type="tns:ReadKommtGehtSearchCriteriaType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKommtGehtResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der allgemeine ZEP Response-Header.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kommtGehtListe" type="tns:KommtGehtListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zum Lesen von Rechnungen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der allgemeine ZEP Response-Header.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="readRechnungSearchCriteria" type="tns:RechnungSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kriterien zur Suche von Rechnungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" minOccurs="0"
                		maxOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der allgemeine ZEP Response-Header.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungListe" type="tns:RechnungListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der gefundenen Rechnungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadSchlagworteRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zum Lesen von Schlagworten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="schlagwortArt" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>'ticket' => Stammdaten-Schlagworte des Ticket-System,
                                'projekt' => Stammdaten-Schlagworte des Projektes
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadSchlagworteResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="schlagworteListe" type="tns:SchlagworteListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gefundenen Schlagworte.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateMassenRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Massenanlage von Objekten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="massenListe" type="tns:MassenListeType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateMassenResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="version" type="xsd:string" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="returnCode" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>gibt den maximalen returnCode der allen Operations (falls dies nicht 0 ist dann sehe einzelne Responses)
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="responseListe" type="tns:MassenResponseListeType" maxOccurs="1" minOccurs="1"/>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadEinplanungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Einplanungen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="readEinplanungSearchCriteria" type="tns:ReadEinplanungSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadEinplanungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="einplanungListe" type="tns:EinplanungListeType" maxOccurs="1" minOccurs="0"/>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateEinplanungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage einer Einplanung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="einplanung" type="tns:EinplanungType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateEinplanungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateEinplanungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung einer Einplanung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="einplanung" type="tns:EinplanungType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateEinplanungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteEinplanungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen einer Einplanung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteEinplanungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadVorgangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Vorgängen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="readVorgangSearchCriteria" type="tns:ReadVorgangSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadVorgangResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="vorgangListe" type="tns:VorgangListeType" maxOccurs="1" minOccurs="0"/>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateVorgangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage von Vorgängen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="vorgang" type="tns:VorgangType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateVorgangResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateVorgangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung von Vorgängen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="vorgang" type="tns:VorgangType" maxOccurs="1" minOccurs="1"/>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateVorgangResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteVorgangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen von Vorgängen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteVorgangResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CheckCreateUserRequestType">
                <xsd:annotation>
                    <xsd:documentation>Prüft, ob die Anlage weiterer Benutzer möglich wäre.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="checkCreateUserCriteria" type="tns:CheckCreateUserCriteriaType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CheckCreateUserResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="wirdLizenzVerletzt" type="xsd:boolean" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="anzahlLizenzen" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="freieLizenzen" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateAbteilungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage einer Abteilung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="abteilung" type="tns:AbteilungType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateAbteilungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateAbteilungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung einer Abteilung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="abteilung" type="tns:AbteilungType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateAbteilungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteAbteilungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen einer Abteilung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>entweder id oder kurzform eingeben</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kurzform" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>entweder id oder kurzform eingeben</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteAbteilungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="FilterProjekteResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="projektDataListe" type="tns:ProjektDataListeType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="FilterProjekteRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Paramater zum Filtern von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="filterProjekteSearchCriteria" type="tns:FilterProjekteSearchCriteriaType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="GetProjektResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="projekt" type="tns:ProjektType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="GetProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage eines Projektes</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRfidChipsRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request-Type zur Abfrage von RFID-Chips.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readRfidChipsSearchCriteria" type="tns:ReadRfidChipsSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kriterien zur Suche der zu lesenden RFID-Chips.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRfidChipsResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="1" />
                    <xsd:element name="rfidChipListe" type="tns:RfidChipListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gefundenen RFID-Chips.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateRfidChipRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Erstellung der RFID-Chip / User-Zuordnung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader"
                                 type="tns:RequestHeaderType" maxOccurs="1"
                                 minOccurs="0" />
                    <xsd:element name="rfidChip" type="tns:RfidChipType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die RFID-Chip / User Zuordnung.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateRfidChipResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateRfidChipsRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Aktualsiierung der RFID-Chip / User-Zuordnung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                    <xsd:element name="rfidChip" type="tns:RfidChipType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die RFID-Chip / User Zuordnung.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateRfidChipsResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteRfidChipsRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="rfidChip" type="tns:RfidChipType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteRfidChipsResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadGeraetRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readGeraetSearchCriteria" type="tns:ReadGeraetSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadGeraetResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="1" />
                	<xsd:element name="geraetListe" type="tns:GeraetListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateGeraetRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="geraet" type="tns:GeraetType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteGeraetRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="geraet" type="tns:GeraetType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateGeraetRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="geraet" type="tns:GeraetType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateGeraetResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteGeraetResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateGeraetResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="1" />
                	<xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadPreisgruppeRequestType">
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0" />
                    <xsd:element name="readPreisgruppeSearchCriteria" type="tns:ReadPreisgruppeSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadPreisgruppeResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="1" />
                	<xsd:element name="preisgruppeListe" type="tns:PreisgruppeListeType"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreatePreisgruppeRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="preisgruppe" type="tns:PreisgruppeType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreatePreisgruppeResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="1" />

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdatePreisgruppeRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="preisgruppe" type="tns:PreisgruppeType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdatePreisgruppeResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeletePreisgruppeRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="kurzform" type="tns:String32" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeletePreisgruppeResponseType">
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadAngebotRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readAngebotSearchCriteria" type="tns:ReadAngebotSearchCriteriaType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadAngebotResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="angebotListe" type="tns:AngebotListeType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTerminRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readTerminSearchCriteria" type="tns:ReadTerminSearchCriteriaType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTerminResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="terminListe" type="tns:TerminListeType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadZahlungseingangRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readZahlungseingangSearchCriteria" type="tns:ReadZahlungseingangSearchCriteriaType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadZahlungseingangResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="zahlungseingangListe" type="tns:ZahlungseingangListeType" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFeiertagskalenderRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readFeiertagskalenderSearchCriteria" type="tns:ReadFeiertagskalenderSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadFeiertagskalenderResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="feiertagskalenderListe" type="tns:FeiertagskalenderListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFeiertagAusnahmeRequestType">
                <xsd:sequence>
                	<xsd:element name="requestHeader"
                		type="tns:RequestHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="readFeiertagAusnahmeSearchCriteria" type="tns:ReadFeiertagAusnahmeSearchCriteriaType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadFeiertagAusnahmeResponseType">
                <xsd:sequence>
                	<xsd:element name="responseHeader"
                		type="tns:ResponseHeaderType" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="feiertagAusnahmeListe" type="tns:FeiertagAusnahmeListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="IsoTime">
                <xsd:annotation>
                    <xsd:documentation>
                        Eine Zeitangabe im ISO-Format: HH:MM
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="4"/>
                    <xsd:maxLength value="8"/>
                    <xsd:pattern value="^\d{1,2}:\d{2}(:\d{2})?$"/>

                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="VorgangMitarbeiterListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste der Mitarbeiter eines Vorgangs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="vorgangMitarbeiter" type="tns:VorgangMitarbeiterType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Vorgangsmitarbeiter.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um alle Vorgangsmitarbeiter im Rahmen eines Updates zu löschen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:element name="ReadProjektzeitenResponse" type="tns:ReadProjektzeitenResponseType"/>

            <xsd:element name="ReadProjektzeitenRequestElement" type="tns:ReadProjektzeitenRequestType"/>

            <xsd:element name="ReadProjekteRequest" type="tns:ReadProjekteRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="ReadProjekteResponse" type="tns:ReadProjekteResponseType"/>

            <xsd:element name="ReadKundeRequest" type="tns:ReadKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Kunden.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="ReadKundeResponse" type="tns:ReadKundeResponseType"/>

            <xsd:element name="ReadMitarbeiterRequest" type="tns:ReadMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Mitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="ReadMitarbeiterResponse" type="tns:ReadMitarbeiterResponseType"/>

            <xsd:element name="ReadTicketRequest" type="tns:ReadTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Tickets.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="ReadTicketResponse" type="tns:ReadTicketResponseType"/>

            <xsd:element name="CreateProjektzeitRequest" type="tns:CreateProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="CreateProjektRequest" type="tns:CreateProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="CreateProjektResponse" type="tns:CreateProjektResponseType"/>

            <xsd:element name="CreateKundeRequest" type="tns:CreateKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Kundenanlage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateKundeResponse" type="tns:CreateKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Kundenanlage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateMitarbeiterRequest" type="tns:CreateMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Mitarbeiteranlage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateMitarbeiterResponse" type="tns:CreateMitarbeiterResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Mitarbeiteranlage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateTicketRequest" type="tns:CreateTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="CreateTicketResponse" type="tns:CreateTicketResponseType"/>

            <xsd:element name="UpdateProjektzeitRequest" type="tns:UpdateProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Zeitbuchungen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="UpdateProjektzeitResponse" type="tns:UpdateProjektzeitResponseType"/>

            <xsd:element name="UpdateProjektRequest" type="tns:UpdateProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Projekten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="UpdateProjektResponse" type="tns:UpdateProjektResponseType"/>

            <xsd:element name="UpdateKundeRequest" type="tns:UpdateKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Kunden.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="UpdateKundeResponse" type="tns:UpdateKundeResponseType"/>

            <xsd:element name="UpdateMitarbeiterRequest" type="tns:UpdateMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Mitarbeitern.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="UpdateMitarbeiterResponse" type="tns:UpdateMitarbeiterResponseType"/>

            <xsd:element name="UpdateTicketRequest" type="tns:UpdateTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Aktualisierung eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="UpdateTicketResponse" type="tns:UpdateTicketResponseType"/>

            <xsd:element name="DeleteProjektzeitRequest" type="tns:DeleteProjektzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen einer Zeitbuchung.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="DeleteProjektzeitResponse" type="tns:DeleteProjektzeitResponseType"/>

            <xsd:element name="ReadProjektzeitenRequest" type="tns:ReadProjektzeitenRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Zeitbuchungen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:element name="ReadKategorieRequest" type="tns:ReadKategorieRequestType"/>
            <xsd:element name="ReadKategorieResponse" type="tns:ReadKategorieResponseType"/>
            <xsd:element name="ReadSchlagworteRequest" type="tns:ReadSchlagworteRequestType"/>
            <xsd:element name="ReadSchlagworteResponse" type="tns:ReadSchlagworteResponseType"/>
            <xsd:element name="CreateMassenRequest" type="tns:CreateMassenRequestType"/>
            <xsd:element name="CreateMassenResponse" type="tns:CreateMassenResponseType"/>

            <xsd:element name="ReadEinplanungRequest" type="tns:ReadEinplanungRequestType"/>
            <xsd:element name="ReadEinplanungResponse" type="tns:ReadEinplanungResponseType"/>
            <xsd:element name="CreateEinplanungRequest" type="tns:CreateEinplanungRequestType"/>
            <xsd:element name="CreateEinplanungResponse" type="tns:CreateEinplanungResponseType"/>
            <xsd:element name="UpdateEinplanungRequest" type="tns:UpdateEinplanungRequestType"/>
            <xsd:element name="UpdateEinplanungResponse" type="tns:UpdateEinplanungResponseType"/>
            <xsd:element name="DeleteEinplanungRequest" type="tns:DeleteEinplanungRequestType"/>
            <xsd:element name="DeleteEinplanungResponse" type="tns:DeleteEinplanungResponseType"/>

            <xsd:element name="ReadVorgangRequest" type="tns:ReadVorgangRequestType"/>
            <xsd:element name="ReadVorgangResponse" type="tns:ReadVorgangResponseType"/>
            <xsd:element name="CreateVorgangRequest" type="tns:CreateVorgangRequestType"/>
            <xsd:element name="CreateVorgangResponse" type="tns:CreateVorgangResponseType"/>
            <xsd:element name="UpdateVorgangRequest" type="tns:UpdateVorgangRequestType"/>
            <xsd:element name="UpdateVorgangResponse" type="tns:UpdateVorgangResponseType"/>
            <xsd:element name="DeleteVorgangRequest" type="tns:DeleteVorgangRequestType"/>
            <xsd:element name="DeleteVorgangResponse" type="tns:DeleteVorgangResponseType"/>
            <xsd:element name="CheckCreateUserRequest" type="tns:CheckCreateUserRequestType"/>
            <xsd:element name="CheckCreateUserResponse" type="tns:CheckCreateUserResponseType"/>
            <xsd:element name="CreateAbteilungRequest" type="tns:CreateAbteilungRequestType"/>
            <xsd:element name="CreateAbteilungResponse" type="tns:CreateAbteilungResponseType"/>
            <xsd:element name="UpdateAbteilungRequest" type="tns:UpdateAbteilungRequestType"/>
            <xsd:element name="UpdateAbteilungResponse" type="tns:UpdateAbteilungResponseType"/>
            <xsd:element name="DeleteAbteilungRequest" type="tns:DeleteAbteilungRequestType"/>
            <xsd:element name="DeleteAbteilungResponse" type="tns:DeleteAbteilungResponseType"/>
            <xsd:element name="FilterProjekteRequest" type="tns:FilterProjekteRequestType"/>
            <xsd:element name="FilterProjekteResponse" type="tns:FilterProjekteResponseType"/>
            <xsd:element name="GetProjektRequest" type="tns:GetProjektRequestType"/>
            <xsd:element name="GetProjektResponse" type="tns:GetProjektResponseType"/>
            <xsd:element name="CreateProjektzeitResponse" type="tns:CreateProjektzeitResponseType"/>
            <xsd:element name="ReadTaetigkeitRequest" type="tns:ReadTaetigkeitRequestType"/>
            <xsd:element name="ReadTaetigkeitResponse" type="tns:ReadTaetigkeitResponseType"/>
            <xsd:element name="ReadEinstellungenRequest" type="tns:ReadEinstellungenRequestType"/>
            <xsd:element name="ReadEinstellungenResponse" type="tns:ReadEinstellungenResponseType"/>
            <xsd:element name="ReadOrtslisteRequest" type="tns:ReadOrtslisteRequestType"/>
            <xsd:element name="ReadOrtslisteResponse" type="tns:ReadOrtslisteResponseType"/>
            <xsd:element name="ReadKommtGehtRequest" type="tns:ReadKommtGehtRequestType"/>
            <xsd:element name="ReadKommtGehtResponse" type="tns:ReadKommtGehtResponseType"/>
            <xsd:element name="ReadRechnungRequest" type="tns:ReadRechnungRequestType"/>
            <xsd:element name="ReadRechnungResponse" type="tns:ReadRechnungResponseType"/>
            <xsd:element name="ReadRfidChipsRequest" type="tns:ReadRfidChipsRequestType"/>
            <xsd:element name="ReadRfidChipsResponse" type="tns:ReadRfidChipsResponseType"/>
            <xsd:element name="CreateRfidChipRequest" type="tns:CreateRfidChipRequestType"/>
            <xsd:element name="CreateRfidChipResponse" type="tns:CreateRfidChipResponseType"/>
            <xsd:element name="UpdateRfidChipsRequest" type="tns:UpdateRfidChipsRequestType"/>
            <xsd:element name="UpdateRfidChipsResponse" type="tns:UpdateRfidChipsResponseType"/>
            <xsd:element name="DeleteRfidChipsRequest" type="tns:DeleteRfidChipsRequestType"/>
            <xsd:element name="DeleteRfidChipsResponse" type="tns:DeleteRfidChipsResponseType"/>
            <xsd:element name="ReadGeraetRequest" type="tns:ReadGeraetRequestType"/>
            <xsd:element name="ReadGeraetResponse" type="tns:ReadGeraetResponseType"/>
            <xsd:element name="UpdateGeraetRequest" type="tns:UpdateGeraetRequestType"/>
            <xsd:element name="UpdateGeraetResponse" type="tns:UpdateGeraetResponseType"/>
            <xsd:element name="DeleteGeraetRequest" type="tns:DeleteGeraetRequestType"/>
            <xsd:element name="DeleteGeraetResponse" type="tns:DeleteGeraetResponseType"/>
            <xsd:element name="CreateGeraetRequest" type="tns:CreateGeraetRequestType"/>
            <xsd:element name="CreateGeraetResponse" type="tns:CreateGeraetResponseType"/>

            <xsd:element name="ReadPreisgruppeRequest" type="tns:ReadPreisgruppeRequestType"/>
            <xsd:element name="ReadPreisgruppeResponse" type="tns:ReadPreisgruppeResponseType"/>
            <xsd:element name="CreatePreisgruppeRequest" type="tns:CreatePreisgruppeRequestType"/>
            <xsd:element name="CreatePreisgruppeResponse" type="tns:CreatePreisgruppeResponseType"/>
            <xsd:element name="UpdatePreisgruppeRequest" type="tns:UpdatePreisgruppeRequestType"/>
            <xsd:element name="UpdatePreisgruppeResponse" type="tns:UpdatePreisgruppeResponseType"/>
            <xsd:element name="DeletePreisgruppeRequest" type="tns:DeletePreisgruppeRequestType"/>
            <xsd:element name="DeletePreisgruppeResponse" type="tns:DeletePreisgruppeResponseType"/>
            <xsd:element name="ReadAngebotRequest" type="tns:ReadAngebotRequestType"/>
            <xsd:element name="ReadAngebotResponse" type="tns:ReadAngebotResponseType"/>
            <xsd:element name="ReadTerminRequest" type="tns:ReadTerminRequestType"/>
            <xsd:element name="ReadTerminResponse" type="tns:ReadTerminResponseType"/>
            <xsd:element name="ReadZahlungseingangRequest" type="tns:ReadZahlungseingangRequestType"/>
            <xsd:element name="ReadZahlungseingangResponse" type="tns:ReadZahlungseingangResponseType"/>
            <xsd:element name="ReadFeiertagskalenderRequest" type="tns:ReadFeiertagskalenderRequestType"/>
            <xsd:element name="ReadFeiertagskalenderResponse" type="tns:ReadFeiertagskalenderResponseType"/>
            <xsd:element name="ReadFeiertagAusnahmeRequest" type="tns:ReadFeiertagAusnahmeRequestType"/>
            <xsd:element name="ReadFeiertagAusnahmeResponse" type="tns:ReadFeiertagAusnahmeResponseType"/>

            <xsd:complexType name="AdresseType">
                <xsd:annotation>
                    <xsd:documentation>Eine einzelne Adresse.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eindeutige Id der Adresse. Pflicht bei
                				Änderung und Löschen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="name" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Firmenname o.ä.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="namenszusatz"
                		type="tns:String120" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="adressZeile1"
                		type="tns:String120" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Erste Zeile der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="adressZeile2"
                		type="tns:String120" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Zweite Zeile der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="adressZeile3"
                		type="tns:String120" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Dritte Zeile der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="plz" type="tns:String16"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Postleitzahl (PLZ) der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ort" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Ort der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="land" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Land der Adresse.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="istStandard" type="xsd:boolean"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob es sich um die
                				Standard-Adresse handelt. Wenn nur eine
                				Adresse gegeben ist und nicht explizit
                				isStandard den Wert false hat wird dies
                				als Standard gesetzt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="alsRechnungsadresse"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Flagge, ob die Adresse als
                				Rechnungsadresse verwendet werden soll.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="alsLieferadresse" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="rechnungsversandMailAdresse"
                		type="xsd:string" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine oder mehrere Empfängeradressen
                				separiert durch Komma oder Semikolon
                				angeben. (optional)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element
                		name="maschinenlesbaresRechnungsversand"
                		type="xsd:int" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=nein , 1=ZUGFeRD1 , 2=ZUGFeRD2 ,
                				99=Swiss QR Code
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				in Kunde: "delete" um die Adresse beim
                				Update zu löschenmuss hier "delete"
                				angegeben werden.

                				in Ansprechpartner: Aktion um: 1.
                				"create" um die Adresse in
                				Kundenadressen anzulegen damit dann dem
                				Ansprechpartner zugordnen zu können. 2.
                				"delete", um die Zuordnung dieser
                				Adresse zu Ansprechpartnet zu löschen (
                				nur die Zuordnung nicht die Adresse
                				selbst).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AdressenListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Adressen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="adresse" type="tns:AdresseType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Adressen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AnsprechpartnerListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Ansprechpartnern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ansprechpartner" type="tns:AnsprechpartnerType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Ansprechpartner.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:element name="DeleteProjektRequest" type="tns:DeleteProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteProjektResponse" type="tns:DeleteProjektResponseType"/>
            <xsd:element name="DeleteKundeResponse" type="tns:DeleteKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteKundeResquest" type="tns:DeleteKundeRequestType"/>
            <xsd:element name="DeleteMitarbeiterRequest" type="tns:DeleteMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteMitarbeiterResponse" type="tns:DeleteMitarbeiterResponseType"/>
            <xsd:element name="DeleteTicketRequest" type="tns:DeleteTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteTicketResponse" type="tns:DeleteTicketResponseType"/>
            <xsd:element name="ReadKostenDatevRequest" type="tns:ReadKostenDatevRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Kostenexports im DATEV-Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadKostenDatevResponse" type="tns:ReadKostenDatevResponseType"/>
            <xsd:element name="ReadKostenLexwareRequest" type="tns:ReadKostenLexwareRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Kostenexports im Lexware-Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadKostenLexwareResponse" type="tns:ReadKostenLexwareResponseType"/>
            <xsd:element name="ReadKostenGenericRequest" type="tns:ReadKostenGenericRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Kostenexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadKostenGenericResponse" type="tns:ReadKostenGenericResponseType"/>
            <xsd:element name="ReadRechnungDatevRequest" type="tns:ReadRechnungDatevRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Rechnungsexports im DATEV-Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungDatevResponse" type="tns:ReadRechnungDatevResponseType"/>
            <xsd:element name="ReadRechnungLexwareRequest" type="tns:ReadRechnungLexwareRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Rechnungsexports im Lexware-Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungLexwareResponse" type="tns:ReadRechnungLexwareResponseType"/>
            <xsd:element name="ReadRechnungGenericRequest" type="tns:ReadRechnungGenericRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Buchungen des Rechnungsexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungGenericResponse" type="tns:ReadRechnungGenericResponseType"/>
            <xsd:element name="ReadBelegartRequest" type="tns:ReadBelegartRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Belegarten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadBelegartResponse" type="tns:ReadBelegartResponseType"/>
            <xsd:element name="ReadZahlungsartRequest" type="tns:ReadZahlungsartRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Zahlungsarten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadZahlungsartResponse" type="tns:ReadZahlungsartResponseType"/>
            <xsd:element name="ReadWechselkursRequest" type="tns:ReadWechselkursRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Wechselkursen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadWechselkursResponse" type="tns:ReadWechselkursResponseType"/>
            <xsd:element name="ReadSteuersatzRequest" type="tns:ReadSteuersatzRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Steuersätzen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadSteuersatzResponse" type="tns:ReadSteuersatzResponseType"/>
            <xsd:element name="ReadBelegRequest" type="tns:ReadBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Belegen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadBelegResponse" type="tns:ReadBelegResponseType"/>
            <xsd:element name="ReadBelegAnhangRequest" type="tns:ReadBelegAnhangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage eines Beleganhangs.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadBelegAnhangResponse" type="tns:ReadBelegAnhangResponseType"/>
            <xsd:element name="ReadErloeskontoRequest" type="tns:ReadErloeskontoRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Erlöskonten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadErloeskontoResponse" type="tns:ReadErloeskontoResponseType"/>
            <xsd:element name="ReadFehlzeitRequest" type="tns:ReadFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Request-Struktur zur Abfrage von Fehlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadFehlzeitResponse" type="tns:ReadFehlzeitResponseType"/>
            <xsd:element name="ReadFehlgrundRequest" type="tns:ReadFehlgrundRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Fehlgründen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadFehlgrundResponse" type="tns:ReadFehlgrundResponseType"/>
            <xsd:element name="ReadAbteilungRequest" type="tns:ReadAbteilungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Abfrage von Abteilungen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadAbteilungResponse" type="tns:ReadAbteilungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort-Struktur zum Lesen von Abteilungen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateBelegRequest" type="tns:CreateBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage eines Beleges.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateBelegResponse" type="tns:CreateBelegResponseType"/>
            <xsd:element name="CreateRechnungspositionFestpreisRequest" type="tns:CreateRechnungspositionFestpreisRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Festpreis-Rechnungsposition..
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateRechnungspositionFestpreisResponse" type="tns:CreateRechnungspositionFestpreisResponseType"/>
            <xsd:element name="CreateArtikelRechnungspositionRequest" type="tns:CreateArtikelRechnungspositionRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Festpreis-Rechnungsposition..
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateArtikelRechnungspositionResponse" type="tns:CreateArtikelRechnungspositionResponseType"/>
            <xsd:element name="CreateFehlzeitRequest" type="tns:CreateFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateFehlzeitResponse" type="tns:CreateFehlzeitResponseType"/>
            <xsd:element name="UpdateBelegRequest" type="tns:UpdateBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Belegen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="UpdateBelegResponse" type="tns:UpdateBelegResponseType"/>
            <xsd:element name="UpdateFehlzeitRequest" type="tns:UpdateFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Aktualisierung von Fehlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="UpdateFehlzeitResponse" type="tns:UpdateFehlzeitResponseType"/>
            <xsd:element name="DeleteBelegRequest" type="tns:DeleteBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen eines Beleges.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteBelegResponse" type="tns:DeleteBelegResponseType"/>
            <xsd:element name="CreateTeilaufgabeRequest" type="tns:CreateTeilaufgabeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateTeilaufgabeResponse" type="tns:CreateTeilaufgabeResponseType"/>
            <xsd:element name="UpdateTeilaufgabeRequest" type="tns:UpdateTeilaufgabeRequestType"/>
            <xsd:element name="UpdateTeilaufgabeResponse" type="tns:UpdateTeilaufgabeResponseType"/>
            <xsd:element name="DeleteTeilaufgabeRequest" type="tns:DeleteTeilaufgabeRequestType"/>
            <xsd:element name="DeleteTeilaufgabeResponse" type="tns:DeleteTeilaufgabeResponseType"/>
            <xsd:element name="DeleteFehlzeitRequest" type="tns:DeleteFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zum Löschen einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteFehlzeitResponse" type="tns:DeleteFehlzeitResponseType"/>
            <xsd:element name="ReadTeilaufgabeRequest" type="tns:ReadTeilaufgabeRequestType"/>
            <xsd:element name="ReadTeilaufgabeResponse" type="tns:ReadTeilaufgabeResponseType"/>
            <xsd:element name="ReadTeilaufgabeHistoryRequest" type="tns:ReadTeilaufgabeHistoryRequestType"/>
            <xsd:element name="ReadTeilaufgabeHistoryResponse" type="tns:ReadTeilaufgabeHistoryResponseType"/>
            <xsd:element name="ReadTicketHistoryRequest" type="tns:ReadTicketHistoryRequestType"/>
            <xsd:element name="ReadTicketHistoryResponse" type="tns:ReadTicketHistoryResponseType"/>
            <xsd:element name="ReadTicketStatusRequest" type="tns:ReadTicketStatusRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Abfrage einer Ticket-Status Definition aus den Stammdaten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadTicketStatusResponse" type="tns:ReadTicketStatusResponseType"/>
            <xsd:element name="ReadAbgeglicheneZeitenRequest" type="tns:ReadAbgeglicheneZeitenRequestType"/>
            <xsd:element name="ReadAbgeglicheneZeitenResponse" type="tns:ReadAbgeglicheneZeitenResponseType"/>
            <xsd:element name="UpdateAbgeglicheneZeitenRequest" type="tns:UpdateAbgeglicheneZeitenRequestType"/>
            <xsd:element name="UpdateAbgeglicheneZeitenResponse" type="tns:UpdateAbgeglicheneZeitenResponseType"/>
            <xsd:element name="ReadTagessatzanteileResponse" type="tns:ReadTagessatzanteileResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort mit den gelesenen Tagessatzanteilen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungspositionFestpreisRequest" type="tns:ReadRechnungspositionFestpreisRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request-Struktur zur Abfrage von Festpreis-Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungspositionFestpreisResponse" type="tns:ReadRechnungspositionFestpreisResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response-Struktur mit dem Ergebnis der Festpreis-Rechnungspositions-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungspositionRequest" type="tns:ReadRechnungspositionRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request-Struktur zur Abfrage von Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadRechnungspositionResponse" type="tns:ReadRechnungspositionResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response-Struktur mit dem Ergebnis der Rechnungspositions-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadTagessatzanteileRequest" type="tns:ReadTagessatzanteileRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request zum Lesen der Tagessatzanteile.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="ReadMahlzeitRequest" type="tns:ReadMahlzeitRequestType"/>
            <xsd:element name="ReadMahlzeitResponse" type="tns:ReadMahlzeitResponseType"/>

            <xsd:element name="ReadArtikelRequest" type="tns:ReadArtikelRequestType"/>
            <xsd:element name="ReadArtikelResponse" type="tns:ReadArtikelResponseType"/>
            <xsd:complexType name="ReadArtikelRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Paramater zum Lesen von Artikeln.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readArtikelSearchCriteria" type="tns:ReadArtikelSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zum Lesen von Artikeln.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadArtikelResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="artikelListe" type="tns:ArtikelListeType"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:element name="CreateArtikelRequest" type="tns:CreateArtikelRequestType"/>
            <xsd:element name="CreateArtikelResponse" type="tns:CreateArtikelResponseType"/>
            <xsd:complexType name="CreateArtikelRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines Artikels.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="artikel" type="tns:ArtikelType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateArtikelResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:element name="UpdateArtikelRequest" type="tns:UpdateArtikelRequestType"/>
            <xsd:element name="UpdateArtikelResponse" type="tns:UpdateArtikelResponseType"/>
            <xsd:complexType name="UpdateArtikelRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung eines Artikels.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="artikel" type="tns:ArtikelType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateArtikelResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:element name="DeleteArtikelRequest" type="tns:DeleteArtikelRequestType"/>
            <xsd:element name="DeleteArtikelResponse" type="tns:DeleteArtikelResponseType"/>
            <xsd:complexType name="DeleteArtikelRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Artikels.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="artikelnummer" type="tns:String128" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteArtikelResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Paramater zum Lesen von Mahlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readMahlzeitSearchCriteria" type="tns:ReadMahlzeitSearchCriteriaType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mahlzeitListe" type="tns:MahlzeitListeType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:element name="CreateMahlzeitResponse" type="tns:CreateMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response nach dem Anlegen einer Mahlzeit.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="CreateMahlzeitRequest" type="tns:CreateMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request zum Anlegen einer Mahlzeit.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>

            <xsd:complexType name="CreateMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request-Struktur zum Anlegen einer Mahlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mahlzeit" type="tns:MahlzeitType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Struktur mit den Daten der anzulegenden Mahlzeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteProjektRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Projekts.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0" />
                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des zu löschenden Projektes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteProjektResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Löschen eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteKundeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Kundennummer des zu löschenden Kunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteKundeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Löschen eines Kunden.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteMitarbeiterRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Benutzername des zu löschenden Benutzers.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteMitarbeiterResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Löschen eines Mitarbeiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteTicketRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des zu löschenden Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteTicketResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Löschen eines Tickets.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenDatevRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen des Kostenexports im DATEV Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readKostenSearchCriteria" type="tns:ReadKostenSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Buchungen im DATEV Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenDatevResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Abfrage des Kostenexports im DATEV Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="datevListe" type="tns:DatevListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste mit den gelesenen Buchungen im DATEV-Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenLexwareRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen des Kostenexports im Lexware Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readKostenSearchCriteria" type="tns:ReadKostenSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Buchungen im Lexware Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenLexwareResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Abfrage des Kostenexports im Lexware Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="lexwareListe" type="tns:LexwareListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste mit den gelesenen Buchungen im Lexware Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenGenericRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen des Kostenexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="readKostenSearchCriteria" type="tns:ReadKostenSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Buchungen im generischen Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadKostenGenericResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Abfrage des Kostenexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="buchhaltungGenericListe" type="tns:BuchhaltungGenericListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste mit den gelesenen Buchungen im generischen Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungDatevRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage des Rechnungsexports im DATEV Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readRechnungSearchCriteria" type="tns:ReadRechnungSearchCriteriaType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Rechnungsdaten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungDatevResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage des Rechnungsexports im DATEV Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="datevListe" type="tns:DatevListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Buchungen im DATEV-Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungLexwareRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage des Rechnungsexports im Lexware Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="readRechnungSearchCriteria" type="tns:ReadRechnungSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Rechnungsdaten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungLexwareResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage des Rechnungsexports im Lexware Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="lexwareListe" type="tns:LexwareListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Buchungen im Lexware Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungGenericRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage des Rechnungsexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readRechnungSearchCriteria" type="tns:ReadRechnungSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Rechnungsdaten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungGenericResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage des Rechnungsexports im generischen Format.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="genericListe" type="tns:BuchhaltungGenericListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Buchungen im generischen Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegartRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Belgarten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readBelegartSearchCriteria" type="tns:ReadBelegartSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach Belegarten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadBelegartResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen von Belegarten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegartListeType" type="tns:BelegartListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Belegarten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadZahlungsartRequestType">
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readZahlungsartSearchCriteria" type="tns:ReadZahlungsartSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach Zahlungsarten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadZahlungsartResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zahlungsartListe" type="tns:ZahlungsartListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Zahlungsarten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadWechselkursRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Wechselkursen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readWechselkursSearchCriteria" type="tns:ReadWechselkursSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach Wechselkursen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadWechselkursResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="wechselkursListe" type="tns:WechselkursListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Wechselkurse.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadSteuersatzRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage von Steuersätzen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readSteuersatzSearchCriteria" type="tns:ReadSteuersatzSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach Steuersätzen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadSteuersatzResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage von Steuersätzen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="steuersatzListe" type="tns:SteuersatzListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Steuersätze.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Belegen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readBelegSearchCriteria" type="tns:ReadBelegSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Belegen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen von Belegen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegListe" type="tns:BelegListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Belege.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegAnhangRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten zum Lesen eines Beleganhangs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readBelegAnhangSearchCriteria" type="tns:ReadBelegAnhangSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach einem Beleganhang.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegAnhangResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen eines Beleganhangs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="anhang" type="tns:AnhangType">
                        <xsd:annotation>
                            <xsd:documentation>Der gelesene Beleganhang.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadErloeskontoRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Erlöskonten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readErloeskontoSearchCriteria" type="tns:ReadErloeskontoSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Suche nach Erlöskonten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadErloeskontoResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort beim Lesen von Erlöskonten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="erloeskontoListe" type="tns:ErloeskontoListeType">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Erlöskonten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage von Fehlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readFehlzeitSearchCriteria" type="tns:ReadFehlzeitSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Suche nach Fehlzeiten
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadFehlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage von Fehlgzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlzeitListe" type="tns:FehlzeitListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gefundenen Fehlzeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="FehlgrundType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter eines Fehlgrunds
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kurzbezeichnung des Fehlgrundes
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung des Fehlgrundes
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="genehmigungspflichtig" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob Fehlzeiten mit diesem Fehlgrund genehmigungspflichtig sind
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="selbstErfassen" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob ein Benutzer Fehlzeiten mit diesem Fehlgrund selbst erfassen darf
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehldauer" type="tns:FehldauerType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFehlgrundSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Abfrage von Fehlgründen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Kurzbezeichnung des gesuchten Fehlgrundes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="genehmigungspflichtig" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Suche nach der Genehmigungspflicht einschränken.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="selbstErfassen" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Suche nach der Möglichkeit der Erfassung durch den Mitarbeiter einschränken.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadAbteilungRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Request-Struktur zum Lesen einer Abteilung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readAbteilungSearchCriteria" type="tns:ReadAbteilungSearchCriteriaType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Kriterien zur Suche nach Abteilungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadAbteilungResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort-Struktur mit den gelesenen Abteilungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1"/>
                    <xsd:element name="abteilungListe" type="tns:AbteilungListeType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadAbteilungSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von Abteilungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="kurzform" type="tns:String64"
                		minOccurs="0" maxOccurs="1" />
                	<xsd:element name="oberAbteilung"
                		type="tns:String64" minOccurs="0" maxOccurs="1" />

                	<xsd:element name="inaktiv" type="xsd:boolean"
                		minOccurs="0" maxOccurs="1" />
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Technische Id der Abteilung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="parentId" type="xsd:int"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Technische Id der übergeordneten
                				Abteilung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="beiAbteilungsleiterAuchNichtAktuellBeschaeftigteMitarbeiter" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Liefert auch Abteilungsleiter die aktuell nicht beschaeftigte Mitarbeiter sind.
Default = false.</xsd:documentation>
                		</xsd:annotation></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="AbteilungListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Abteilungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="abteilung" type="tns:AbteilungType" minOccurs="0" maxOccurs="unbounded">
                        <xsd:annotation>
                            <xsd:documentation>Die Abteilungen der Liste.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Abteilungen in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="AbteilungType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter einer Abteilung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="kurzform" type="tns:String64" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kurzbezeichnung der Abteilung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung" type="tns:String255" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung der Abteilung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="waehrung" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung der Abteilung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="inaktiv" type="xsd:boolean" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob die Abteilung aktiv oder inaktiv ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungsnummerPrefix" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Präfix des Rechnungsnummernkreises dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in der Administration abhängig.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungsnummerSuffix" type="tns:String32" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Suffix des Rechnungsnummernkreises dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in der Administration abhängig.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungsnummerLaenge" type="xsd:int" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Stelelnanzahlen der Nummerirung im Rechnungsnummernkreis dieser Abteilung für die Rechnunngsnummern-Generierung. Is von Faktura-Einxtellungen in der Administration abhängig.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="oberAbteilung" type="tns:String64" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die übergeorndete Abteilung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abteilungsleiterListe" type="tns:AbteilungsleiterListeType" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="parentId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="FehlgrundListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Fehlgründen</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="fehlgrund" type="tns:FehlgrundType" minOccurs="0" maxOccurs="unbounded">
                        <xsd:annotation>
                            <xsd:documentation>Die Fehlgründe der LIste
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Fehlgründe in der Liste
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="ReadFehlgrundRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Abfrage von Fehlgründen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readFehlgrundSearchCriteria" type="tns:ReadFehlgrundSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Abfrage von Fehlgründen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFehlgrundResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort der Abfrage von Fehlgründen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlgrundListe" type="tns:FehlgrundListeType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Liste der gefundenen Fehlgründe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage eines Belegs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="beleg" type="tns:BelegType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des anzulegenden Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateBelegResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Beleg-Anlage
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des neu angelegten Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateRechnungspositionFestpreisRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zu Anlage einer neuen Festpreis-Rechnungsposition
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungspositionFestpreis" type="tns:RechnungspositionFestpreisType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten der anzulegenden Festpreis-Rechnungsposition.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateArtikelRechnungspositionRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zu Anlage einer neuen Artikel-Rechnungsposition
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="artikelRechnungsposition" type="tns:ArtikelRechnungspositionType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten der anzulegenden Festpreis-Rechnungsposition.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateRechnungspositionFestpreisResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Anlage einer neuen Festpreis-Rechnungsposition
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateArtikelRechnungspositionResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Anlage einer neuen Artikel-Rechnungsposition
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Anlage einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlzeit" type="tns:FehlzeitType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die anzulegende Fehlzeit.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CreateFehlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Fehlzeit-Anlage
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ids" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Ids der angelegten Fehlzeiten durch Komma getrennt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Daten zur Aktualisierung einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlzeit" type="tns:FehlzeitType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die zu aktualisierende Fehlzeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateFehlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Der Antwort-Daten zur Aktualisierung einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteFehlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Fehlgrunds
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="mailversandUnterdruecken" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Ist gleich false oder nicht mitgegeben dann werden mitarbeiter benachrichtigt (falls sie benachritigt werden müssen). Ist gleich true dann werden Benchrichtigungen beim (delete) unterdrückt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteFehlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt bei Löschen eines Fehlgrunds
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung eines Beleges.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="beleg" type="tns:BelegType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten des zu aktualisierenden Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateBelegResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort bei der Aktualisierung eines Beleges.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteBelegRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen eines Beleges.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Nummer des zu löschenden Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteBelegResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt bei Löschen eines Beleges
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="TeilaufgabeType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="ticketNr" type="xsd:int"
                		maxOccurs="1" minOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Tickets, zu dem die
                				Teilaufgabe gehört.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="teilaufgabeNr"
                		type="tns:String32" maxOccurs="1" minOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer der Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="betreff" type="xsd:string"
                		maxOccurs="1" minOccurs="1">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Betreff der Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenReferenz"
                		type="tns:String255" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kundenreferenz.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenAnsprechpartner"
                		type="tns:AnsprechpartnerType" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Id des Kundenansprechpartners.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ersteller" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Erstellers.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bearbeiter" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Benutzername des Bearbeiters.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="startdatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Startdatum der Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="termin" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Termin der Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="eingangsdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Eingangsdatum der Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="planstunden"
                		type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der geplante Aufwand der Teilaufgabe (in
                				Stunden).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="ueberbuchenVerhindern"
                		type="tns:int0_4" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0: Nein 1: nur fakturierbare Zeiten
                				(inkl. Reisezeiten) 2: fakturierbare und
                				nicht fakturierbare Zeiten (inkl.
                				Reisezeiten) 3: nur fakturierbare Zeiten
                				(ohne Reisezeiten) 4: fakturierbare und
                				nicht fakturierbare Zeiten (ohne
                				Reisezeiten)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Ene Bemerkung zur Teilaufgabe.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="anhangListe"
                		type="tns:AnhangListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Es werden nur die zwei ersten Dateien in
                				dieser Liste pro Request gespeichert der
                				rest wird ignoriert.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kategorieListe"
                		type="tns:KategorieListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="created" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der Anlage des Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="modified" type="tns:IsoDateTime"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Zeitpunkt der letzten Änderung des
                				Objekts.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="inbearbeitungdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="fertigdatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="historyUpdatedatum"
                		type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Nur fürs Lesen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="schlagworteListe"
                		type="tns:SchlagworteListeType" maxOccurs="1"
                		minOccurs="0" />

                	<xsd:element name="benutzer" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				gilt als angemeldeter User für die
                				Änderungshistorie., falls gesetzt,
                				werden die Berechtigungen für diesee
                				Teilaufgabe überprüft.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="istStunden"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="istStundenFakt"
                		type="tns:Decimal8_10" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="status" type="tns:int1_20" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status des Tickets (1=neu, 2=in
                				Bearbeitung, 3=fertig, 4=abgelehnt,
                				5=abgenommen).
                			</xsd:documentation></xsd:annotation></xsd:element>
                	<xsd:element name="attribues"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0..1 Attribute für kundenspezifische
                				Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateTeilaufgabeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Das Request-Objekt zur Anlage einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabe" type="tns:TeilaufgabeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten der Teilaufgabe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="CreateTeilaufgabeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Anlage der Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="teilaufgabeNr" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateTeilaufgabeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabe" type="tns:TeilaufgabeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Daten der zu aktualisierenden Teilaufgabe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="UpdateTeilaufgabeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt der Aktualisierung einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteTeilaufgabeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Löschen einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Tickets, zu dem die Teilaufgabe gehört.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabeNr" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Dei Nummer der zu löschenden Teilaufgabe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteTeilaufgabeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt des Löschens einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTeilaufgabeRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen von Teilaufgaben.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTeilaufgabeSearchCriteria" type="tns:ReadTeilaufgabeSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zum Lesen von Teilaufgaben.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTeilaufgabeResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Antwort-Objekt beim Lesen von Teilaufgaben.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabeListe" type="tns:TeilaufgabeListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste mit Teilaufgaben.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjekttaetigkeitType">
                <xsd:annotation>
                    <xsd:documentation>Definiert eine einzelne, einem Projekt zugeordnete Tätigkeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Tätigkeit, die dem Projekt zugeordnet ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um die Tätigkeit im Rahmen eines Updates aus dem Projekt zu entfernen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ProjektortListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Arbeitsorten, die einem Projekt zugeordnet sind.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ort" type="tns:ProjektortType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Projektorte.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreistabelleListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Preistabellen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="preistabelle" type="tns:PreistabelleType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Preistabellen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreistabelleType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer einzelnen Preistabelle. Diese wird sowohl als Projekt- als auch als Kundenpreistabelle verwendet, abhängig davon, ob eine Projektnummer oder eine Kundennummer angegeben wurde.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Id der Preistabelle. Pflicht bei Update und Löschen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="gueltigAb" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum, ab dem die Preistabelle gilt. Format: JJJJ-MM-TT. Pflicht.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Kunden, für den die Preistabelle gilt (Kundenpreistabelle). Ist dieses Feld gesetzt, so darf keine Projektnummer angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Projektes, für das die Preistabelle gilt (Projektpreistabelle). Ist dieses Feld gesetzt, so darf keine Kundennummer angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="preisListe" type="tns:PreisListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Preise dieser Preistabelle.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="preisfaktorListe" type="tns:PreisfaktorListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Liste der Preisfaktoren dieser Preistabelle.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Aktion. Um die Preistabelle im Rahmen eines Updates zu löschen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreisfaktorListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Preisfaktoren.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="preisfaktor" type="tns:PreisfaktorType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Preisfaktoren.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreisfaktorType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Preisfaktors.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Id des Preisfaktors.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="tag" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Wochentag, für den der Preisfaktor gilt. Wertebereich: 0=Sonntag,...,6=Samstag,7=Feiertag. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="von" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Uhrzeit, ab der der Preisfaktor gilt. Pflicht bei Anlage. Format: HH:MM
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bis" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Uhrzeit, bis zu der der Preisfaktor gilt. Pflicht bei Anlage. Format: HH:MM
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="faktor" type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Preisfaktor (in Prozent). Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="taetigkeit" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Tätigkeit, für die der Preisfaktor gilt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um den Preisfaktor im Rahmen eines Updates zu löschen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreisListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Preisen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="preis" type="tns:PreisType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Preise.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="PreisType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Preises.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Id des Preises. Pflicht bei Update und Löschen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="preisgruppe" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Preisgruppe, der der Preis zugeordnet ist. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="tagessatz" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Tagessatz.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="stundensatz" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Stundensatz.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="speziellStundensatz" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Ein spezieller Stundensatz für die im Preis angegebene Tätigkeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="taetigkeit" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Tätigkeit, für die ein spezieller Stundensatz gilt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um den Preis im Rahmen eines Updates zu löschen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:simpleType name="int0_1">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="1"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="int0_3">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="3"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="int0_4">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="4"/>
                </xsd:restriction>
            </xsd:simpleType>
            <xsd:simpleType name="int1_4">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="1"/>
                    <xsd:maxInclusive value="4"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="int1_3">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="1"/>
                    <xsd:maxInclusive value="3"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="ReadKostenSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für die Abfrage des Kostenexports.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="von" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Anfang des Zeitraums, in dem die zu lesenden Buchungsdaten liegen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bis" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Ende des Zeitraums, in dem die zu lesenden Buchungsdaten liegen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Abteilung, zu der die gelesenen Buchungsdaten gehören.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inklusiveUnterabteilung" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob auch die Buchungsdaten von Unter-Abteilungen geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Id des Benutzers, zu dem die Buchungsdaten geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inklBereitsExportierter" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="alsExportiertMarkieren" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadRechnungSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für die Abfrage des Rechnungsexports.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="von" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Anfang des Zeitraums, in dem das Rechnungsdamtum liegen soll. Format: JJJJ-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bis" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Ende des Zeitraums, in dem das Rechnungsdamtum liegen soll. Format: JJJJ-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung der Abteilung des Kunden, zu der Rechnungsdaten geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inklusiveUnterabteilung" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob auch Unterabteilungen beachtet werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inklBereitsExportierter" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob auch Daten die bereits exportiert wurden, erneut geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="alsExportiertMarkieren" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DatevListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Buchungsdaten im DATEV Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="datev" type="tns:DatevType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Buchungen im DATEV-Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Buchungen in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="DatevType">
                <xsd:annotation>
                    <xsd:documentation>Datensatz des Buchhaltungs-Exports im DATEV Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="umsatz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Rechnungsbetrag der Rechnungsposition als absoluter Betrag (ggf. in Fremdwährung).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="soll_haben_kz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>„S“ oder „H“</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="wkz_umsatz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Währung des Umsatzes, 3-stelliges Währungskennzeichen (z. B. „EUR“)
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kurs" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Leer falls Umsatz in Basiswährung, sonst der Wechselkurs für die Umrechnung der Rechnungswährung in die Basiswährung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="basis_umsatz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Leer falls Umsatz in Basiswährung, sonst der in die Basiswährung umgerechnete Umsatz.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="wkz_basis_umsatz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Leer falls Umsatz in Basiswährung, sonst Währungskennzeichen der Basiswährung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="konto" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kundennummer.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="gegenkonto" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das in der Rechnungsposition eingestellte Erlöskonto
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="steuerschluessel" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegdatum" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Rechnungsdatum im Format „TTMM“ (gem. DATEV-Spezifikation).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegfeld1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Rechnungsnummer
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegfeld2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="skonto" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="buchungstext" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kundenname</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="postensperre" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="diverse_adressNr" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="geschaeftspartnerbank" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="sachverhalt" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zinssperre" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="beleglink" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="beleginfo_art1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art3" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt3" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art4" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt4" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art5" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt5" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art6" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt6" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art7" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt7" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_art8" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beleginfo_inhalt8" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kost1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kostenstelle</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kost2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kostenträger</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kost_menge" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="euLand_UStID" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>UID des Kunden
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="eu_steuersatz" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abw_versteuerungsart" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="sachverhalt_LL" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="funktionsergaenzung_LL" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bu49_hauptfunktionstyp" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bu49_hauptfunktionsnummer" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bu49_funktionsergaenzung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="zusatzinformation_art1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt1" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt2" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art3" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt3" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art4" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt4" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art5" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt5" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art6" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt6" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art7" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt7" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art8" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt8" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art9" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt9" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art10" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt10" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art11" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt11" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art12" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt12" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art13" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt13" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art14" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt14" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art15" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt15" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art16" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt16" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art17" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt17" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art18" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt18" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art19" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt19" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_art20" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zusatzinformation_inhalt20" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ggf. gesetzt gem. kundenspezifischer Anforderung, sonst leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="stueck" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="gewicht" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="zahlweise" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="forderungsart" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="veranlagungsjahr" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="zugeordnete_faelligkeit" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>leer</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="LexwareListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Buchungssätzen im Lexware Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="lexware" type="tns:LexwareType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Buchungssätze im Lexware Format.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Buchungssätze in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="LexwareType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Buchungssatzes im Lexware Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegdatum" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Datum des Beleges bzw. der Buchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegnummer" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="buchungstext" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Buchungstext, z.B. Text der Rechnungsposition.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="buchungsbetrag" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der zu buchende Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="sollkonto" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Soll-Konto, zu dessen Lasten die Buchung erfolgt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="habenkonto" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Haben-Konto, zu dessen Gunsten die Buchung erfolgt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="steuerschluessel" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Steuerschlüssel.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kostenstelle" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kostenstelle (falls das Modu 'Export für Buchhaltung' aktiv ist und Kostenstellen verwendet werden).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kostentraeger" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Kostenträge (falls das Modu 'Export für Buchhaltung' aktiv ist und Kostenträger verwendet werden).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="waehrung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Währung der Buchung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BuchhaltungGenericListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Buchhaltungs-Records im generischen Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="buchhaltungGeneric" type="tns:BuchhaltungGenericType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Buchungen im generischen Format).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Buchungen in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="BuchhaltungGenericType">
                <xsd:annotation>
                    <xsd:documentation>Datensatz aus dem Buchhaltungs-Export im generischen Format
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="datum" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum der Buchung (z.B.
                				Rechnungsdatum).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="belegnummer" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Beleges bzw. der
                				Rechnung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="betrag" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Betrag der Buchung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="waehrung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Währung der Buchung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="mwst" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der MwSt. Satz der Buchung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="sollkonto" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Soll-Konto, zu dessen Lasten die
                				Buchung erfolgt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="habenkonto" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Haben-Konto, zu dessen Gunsten die
                				Buchung erfolgt.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="buchungsschluessel"
                		type="xsd:string" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Buchungsschlüssel (s. Belegart).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="buchungstext" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Buchungstext, z.B. Text der
                				Rechnungsposition oder des Beleges.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kostenstelle" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kostenstelle (bei Einsatz des Moduls
                				'Export für Buchhaltung' und
                				Kostenstellen)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="kostentraeger" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Kostenstelle (bei Einsatz des Moduls
                				'Export für Buchhaltung' und
                				Kostenträgern)
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kost1" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                	</xsd:element>
                	<xsd:element name="kost2" type="xsd:string" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Für kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegartSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für das Lesen von Belegarten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kurzbezeichnung der gesuchten Belegart. Falls leer werden alle Belegarten geliefert.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadZahlungsartSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Abfrage von Zahlungsarten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kurzbezeichnung der gesuchten Zahlungsart (z.B. 'Firma', 'privat').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadWechselkursSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Abfrage von Wechselkursen. P.S. Basis-Währung wird immer geliefert (zu erkennen durch das Element basis = true).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung der zu liefernden Wechselkurses.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bisdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>End-Zeitraum der Suche (verglichen mit gültig_bis_datum der Währung)
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="vondatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Anfang-Zeitraum der Suche (verglichen mit gültig_bis_datum der Währung)
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadSteuersatzSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Abfrage von Steuersätzen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="steuersatz" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der gesuchte Steuersatz.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für das Lesen von Belegen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="von" type="tns:IsoDate" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Startdatum des Zeitraums, in dem Belege gesucht werden sollen. Format: JJJJ-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bis" type="tns:IsoDate" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Endedatum des Zeitraums, in dem Belege gesucht werden sollen. Format: JJJJ-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Beleges, der geliefert werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektNrListe" type="tns:ProjektNrListeType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eine Liste mit den Nummern der Projekte, in denen nach Belegen gesucht werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="userIdListe" type="tns:UserIdListeType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eine Liste mit Benutzerids, in deren Belegen gesucht werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="belegart" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung der Belegart, nach der gesucht werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="zahlungsart" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Zahlungsart, nach der gesucht werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="modifiedSince" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadBelegAnhangSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für das Lesen eines Beleganhangs.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Beleges, dessen Anhang geliefert werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadErloeskontoSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für das Lesen von Erlöskonten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="erloeskontoNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des gesuchten Erlöskontos. Falls leer werden alle Erlöskonten geliefert.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFehlzeitSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Abfrage von Fehlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Benutzer, dessen Fehlzeiten abgefragt werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="startdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das (Anfangs-)Datum, an dem die Fehlzeiten liegen sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="enddatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das (Ende-)Datum, vor dem die Fehlzeiten liegen sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlgrund" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Fehlgrund, zu dem Fehlzeiten abgefragt werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vonZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="bisZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="genehmigungspflichtig" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Einschränkung nch der Genehmigung der abgefragten Fehlzeiten - false oder 0 = nur nicht genehmigungspflichtig - true oder 1 = nur genehmigungspflichtig - nicht angegeben = alle
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modifiedSince" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="genehmigt" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BelegartListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Belegarten</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegart" type="tns:BelegartType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Belegarten.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Belegarten in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="BelegartType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Belegart.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kurzbezeichnung der Belegart.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung der Belegart.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="belegartsteuersatzListe" type="tns:BelegartsteuersatzListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Eine optionale Liste der für die Belegart zulässigen Steuersätze. Default: alle Steuersätze sind zulässig.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="betrag" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Ein optionaler Default-Wert für den Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="faktBetrag" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Ein optionaler Default-Wert für den zu fakturierenden Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Vorgabe-Wert für die Währung (optional).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="zahlungsart" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Vorgabe-Wert für die Zahlungsart (optional).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="inklusiveRechnung" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="abweichendesLeistungsdatum" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kennung, ob bei Belegen dieser Belegart ein abweichendes Leistungsdatum angegeben werden kann.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="siebzigDreissigAufteilung" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kennung, ob bei dieser Belegart eine 70/30-Aufteilung beim Mahlzeitenabzu eerfolgen soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ZahlungsartListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Zahlungsarten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="zahlungsart" type="tns:ZahlungsartType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Zahlungsarten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Zahlungsarten in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="ZahlungsartType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Zahlungsart.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kurzform der Zahlungsart, z.B. 'Firma' , 'privat'
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung der Zahlungsart.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="erstattung" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Flagge, ob die Zahlungsart eine Erstattung impliziert.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="buchhaltungsexportKonto" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Konto für den Buchhaltungexport (bei Einsatz des Moduls 'Export für Buchhaltung').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="WechselkursListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Wechselkursen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="wechselkurs" type="tns:WechselkursType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Wechselkurse.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Wechselkurse in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="WechselkursType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Wechselkurses.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Währung.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kurs" type="tns:Decimal12_6" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Umrechnungskurs zur Umrechnung in die Basiswährung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bisdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Datum, bis zu dem der Wechselkurs gilt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung des Wechselkurses.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="basis" maxOccurs="1" minOccurs="0" type="xsd:boolean">
                        <xsd:annotation>
                            <xsd:documentation>Flagge, ob es sich bei der Währung um die Basiswährung handelt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="SteuersatzListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Steuersätzen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="steuersatz" type="tns:SteuersatzType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Steuersätze.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Steuersätze in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="BelegListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Belegen</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="beleg" type="tns:BelegType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Belege.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Belege in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="BelegType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Beleges.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Belegs. Leer bei Anlage eines neuen Belegs, Pflicht beim Update oder Löschen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum des Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="leistungsdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das ggf. abweichende Leistungsdatum des Beleges. Nur zulässig wenn die Belegart ein abweichendes Leistungsdatum zulässt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Projektes, dem dieser Beleg zugeordnet ist. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vorgangNr" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Nummer des Vorgangs, dem der Beleg zugeordnet werden soll. Die Angabe eines Vorgangs ist optional.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Userid des Benutzer, dem der Beleg zugeordnet ist. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegart" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Belegart des Beleges. Pflicht bei Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung des Beleges.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="faktWaehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung, in der der Beleg an den Kunden weiterfakturiert wird.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="zahlungsart" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Zahlungsart des Beleges, z.B. privat oder Firma. Die hier angegebene Wert muss einer der in den ZEP Stammdaten definierten Zahlungsarten entsprechen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eine optionale Bemerkung zum Beleg.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="istNetto" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob die Beträge des Beleges brutto oder netto sind. Default: brutto.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="istFaktNetto" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung, ob die zu fakturierenden Beträge des Beleges brutto oder netto sind. Default: brutto.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegbetragListe" type="tns:BelegbetragListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste der Einzel-Beträge des Beleges. Diese können u.U. unterschiedliche Steuersätze o.ä. enthalten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="anhang" type="tns:AnhangType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der optionale Anhang zum Beleg (Bild oder PDF).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vorgangId" type="xsd:int" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der Anlage des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der letzten Änderung des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Optionale Liste von Attributen für kundenspezifische Anpassungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RechnungspositionFestpreisType">

                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Festpreis-Rechnungsposition.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projektes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumBeginn"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfagsdatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumEnde"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="wiederholung" type="tns:int0_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- leer bzw. nicht eingegeben=keine
                				Wiederholung, - 0=Monatlich Ultimo, -
                				1=Monatlich zum gleichen Datum, -
                				2=3-Monatlich Ultimo, - 3=3-Monatlich
                				zum gleichen Datum, - 4=Jährlich
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="geplantesRechnungsdatumGleich"
                		type="tns:int0_1" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>0=leistungszeitraumBeginn, 1(default)=leistungszeitraumEnde,
siehe Dokumentation von geplantesDatum.</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="menge" type="tns:Decimal12_2"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Menge</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einzelpreis"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Einzelpreis.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einheit" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Einheit der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="waehrung" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Währung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="sprache" type="tns:String10"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die verfügbare Sprachen für die Texte
                				die in ZEP ausgegeben werden: z.B. de,
                				en, fr, ch, en_de
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="erloeskontoListe"
                		type="tns:ErloeskontoListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Erlöskonto der Rechnungsposition
                				(bei Einsatz des Moduls 'Export für
                				Buchhaltung').
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="status" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0 (default)=geplant, 1=freigegeben
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungstext" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Rechnungstext der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechnungsdatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="geplantesDatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" >
                		<xsd:annotation>
                			<xsd:documentation>Wenn dies nicht null ist, dann gilt dies und nicht mehr die geplantesRechnungsdatumGleich.</xsd:documentation></xsd:annotation></xsd:element>
                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="mwst" type="tns:Decimal6_4"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                	</xsd:element>
                	<xsd:element name="vorgangId" type="xsd:int" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ArtikelRechnungspositionType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Festpreis-Rechnungsposition.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projektes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="artikelnummer" type="tns:String128" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="leistungszeitraumBeginn"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfagsdatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumEnde"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="wiederholung" type="tns:int0_4"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- leer bzw. nicht eingegeben=keine
                				Wiederholung, - 0=Monatlich Ultimo, -
                				1=Monatlich zum gleichen Datum, -
                				2=3-Monatlich Ultimo, - 3=3-Monatlich
                				zum gleichen Datum, - 4=Jährlich
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="geplantesRechnungsdatumGleich"
                		type="tns:int0_1" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=leistungszeitraumBeginn,
                				1(default)=leistungszeitraumEnde
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="menge" type="tns:Decimal12_2"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Menge</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einzelpreis"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Einzelpreis.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einheit" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Einheit der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="waehrung" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Währung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="sprache" type="tns:String10"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die verfügbare Sprachen für die Texte
                				die in ZEP ausgegeben werden: z.B. de,
                				en, fr, ch, en_de
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="erloeskontoListe"
                		type="tns:ErloeskontoListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Erlöskonto der Rechnungsposition
                				(bei Einsatz des Moduls 'Export für
                				Buchhaltung').
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="status" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0 (default)=geplant, 1=freigegeben
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungstext" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Rechnungstext der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechnungsdatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="geplantesDatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="mwst" type="tns:Decimal6_4"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="vorgangNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                	</xsd:element>
                	<xsd:element name="vorgangId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RechnungspositionType">

                <xsd:annotation>
                    <xsd:documentation>Die Daten einer Rechnungsposition.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0" />
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Projektes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Nummer des Kunden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumBeginn"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfagsdatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumEnde"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des Leistungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="wiederholung" type="xsd:integer"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				leer bzw. nicht eingegeben = keine
                				Wiederholung, 0 = monatlich Ultimo, 1 =
                				monatlich zum gleichen Datum, 2 = drei
                				monatlich Ultimo, 3 = drei monatlich zum
                				gleichen Datum, 4 = jährlich, 5 = zwei
                				monatlich ultimo, 6 = zwei monatlich, 7
                				= halbes Jahr ultimo, 8 = halbes Jahr
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="geplantesRechnungsdatumGleich"
                		type="tns:int0_1" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=leistungszeitraumBeginn,
                				1(default)=leistungszeitraumEnde
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="menge" type="tns:Decimal12_2"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Menge</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einzelpreis"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Einzelpreis.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="einheit" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Einheit der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="waehrung" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Währung.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="sprache" type="tns:String10"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die verfügbare Sprachen für die Texte
                				die in ZEP ausgegeben werden: z.B. de,
                				en, fr, ch, en_de
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="erloeskontoListe"
                		type="tns:ErloeskontoListeType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Erlöskonto der Rechnungsposition
                				(bei Einsatz des Moduls 'Export für
                				Buchhaltung').
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="status" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0 = geplant 1 = freigegeben 2 =
                				abgerechnet 3 = storniert
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechnungstext" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Rechnungstext der Rechnungsposition.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechnungsNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				nur beim abgerechnete Rechnunsposition
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="mitarbeiter" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				userid der Vorgangsmitarbeiter
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="art" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				0=Aufwand, 1=Pauschal , 2=Vorgang,
                				3=Sonstige-Belege, 4=Reise-Pauschalen,
                				5=Ticket, 6=Artikel,
                				15=Abschlag-Prozent, 16=Schluss-Prozent,
                				99=Prozent
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="reihenfolge" type="tns:String32"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="enthaeltArbeitszeiten"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="enthaeltBelege"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="enthaeltReisekosten"
                		type="xsd:boolean" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="abgerechneterBetrag"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				ist immer als Netto. Nur zum Lesen da,
                				wird via SOAP nicht erstellt oder
                				bearbeitet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="geplanterBetrag"
                		type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				ist immer als Netto. Nur zum Lesen da,
                				wird via SOAP nicht erstellt oder
                				bearbeitet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungsdatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" />

                	<xsd:element name="geplantesDatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="mwst" type="tns:Decimal6_4"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="vorgang" type="tns:VorgangType"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="ticket" type="tns:TicketType"
                		maxOccurs="1" minOccurs="0" />

                	<xsd:element name="artikel" type="tns:ArtikelType"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="mitarbeiterListe" type="tns:UserIdListeType" maxOccurs="1" minOccurs="0"></xsd:element>
                	<xsd:element name="attributes"
                		type="tns:AttributesType" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Liste von Attributen für
                				kundenspezifische Erweiterungen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="FehlzeitType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Id der Fehlzeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Benutzer dem die Fehlzeit zugeordnet ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="startdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Startdatum der Fehlzeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="enddatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum, bis zu dem die Fehlzeit gilt. Falls leer, so entspricht das Endedatum dem Startdatum.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="fehlgrund" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kurzbezeichnung des zugeordneten Fehlgrundes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="istHalberTag" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                true: Fehlzeit is halber Tag. leer/false: Fehlzeit ist ganzer Tag. Wenn 'vonZeit' und 'bisZeit' gesetzt sind, so gilt die Fehlzeit als Anzahl Stunden
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="genehmigt" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Kennung bei einer genehmigungspflichtigen Fehlzeit, ob diese genehmigt ist oder nicht. Falls die Fehlzeit nicht genehmigungspflicht ist dann bleibt das Feld leer.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vonZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Diese gilt nur für eine Fehlzeit mit Dauer in Stunden, das Feld 'bisZeit' muss auch belegt sein.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bisZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Dies gilt nur für eine Fehlzeit m,it Dauer in Stunden, das Feld 'vonZeit' muss auch belegt sein.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bemerkung zur Fehlzeit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="timezone" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                gilt nur für Fehlzeiten mit von/bis-Zeiten. Beispiele: 'Europe/Berlin', 'Africa/Abidjan', 'America/Argentina/Catamarca', 'Asia/Manila', 'Australia/Lindeman'
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mailversandUnterdruecken" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Ist gleich false oder nicht mitgegeben dann werden mitarbeiter benachrichtigt (falls sie benachritigt werden müssen). Ist gleich true dann werden Benchrichtigungen beim (create/update) unterdrückt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der Anlage des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der letzten Änderung des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="SteuersatzType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Steuersatzes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="steuersatz" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Steuersatz, z.B. '7', '19.00'
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung des Steuersatzes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Attribute für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BelegbetragListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste der Einzelbeträge eines Beleges
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegbetrag" type="tns:BelegbetragType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die einzelnen Beträgen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BelegbetragType">
                <xsd:annotation>
                    <xsd:documentation>Ein einem Beleg zugeordneter Betrag
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Wenn es beim Update angegeben und ein Belegbetrag vorhanden dann wird dieser bearbeitet ansonsten wird neu erstellt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="belegNr" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des Belegs, dem dieser Betrag zugeordnet ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="steuersatz" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Steuersatz zu diesem Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="menge" type="tns:Decimal12_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Menge.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="betrag" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Betrag.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="privatAnteil" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der private Anteil am Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="faktBetrag" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der an den Kunden zu fakturierende Betrag.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Aktion. Um den Betrag im Rahmen eines Updates zu löschen muss hier 'delete' angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AnhangType">
                <xsd:annotation>
                    <xsd:documentation>Ein Beleganhang. Enthält die Base-64 codierten Daten der Belegdatei (Bild oder PDF).
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="inhalt" type="xsd:base64Binary" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Base64 codierten Daten des Beleganhangs (Bild oder PDF).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="name" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Dateiname des Beleganhangs.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ErloeskontoType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Erlöskontos
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="erloeskontoNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des Erlöskontos.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung" type="tns:String255" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung des Erlöskontos.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="landkennung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Kennung für das Land, z.B. 'Inland', 'EU', 'Drittland'
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mwst" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der MwSt-Satz des Erlöskontos.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BelegartsteuersatzListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste der für eine Belegart zugelaässigen Steuersätze
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegartsteuersatz" type="tns:BelegartsteuersatzType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die der Belegart zugeordneten Steuersätze.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BelegartsteuersatzType">
                <xsd:annotation>
                    <xsd:documentation>Ein für eine Belegart zugelassener Steuersatz
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="belegart" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kurzbezeichnung der Belegart.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="steuersatz" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Steuersatz.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="konto" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das für diesen Steuersatz zu verwendende Konto (bei Einsatz des Moduls 'Export für Buchhaltung').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="buschluessel" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Buchungsschlüssel (bei Einsatz des Moduls 'Export für Buchhaltung').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="konto2" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Ein weiteres Erlöskonto (bei Einsatz des Moduls 'Export für Buchhaltung' und 70/30 Aufteilung des Beleges).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="buschluessel2" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der zweite Buchungsschlüssel (bei Einsatz des Moduls 'Export für Buchhaltung' und 70/30 Aufteilung des Beleges).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kontoFreelancer" type="tns:String64" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="buschluesselFreelancer" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="konto2Freelancer" type="tns:String64" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="buschluessel2Freelancer" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ErloeskontoListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Erlöskonten
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="erloeskonto" type="tns:ErloeskontoType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Erlöskonten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Erlöskonten in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>
            <xsd:complexType name="FehlzeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Fehlzeiten</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="fehlzeit" type="tns:FehlzeitType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Fehlzeiten
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Fehlzeiten in der Liste
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="ReadTeilaufgabeSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien für das Lesen einer Teilaufgabe.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Tickets, zu der die Teilaufgabe gehört.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabeNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer der Teilaufgabe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="modifiedSince" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="schlagworteFilter" type="tns:SchlagworteFilterType" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TeilaufgabeListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Teilaufgaben.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="teilaufgabe" type="tns:TeilaufgabeType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Teilaufgaben.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Teilaufgaben in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="AnhangListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Anhängen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="anhang" type="tns:AnhangType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Anhänge der Liste.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTeilaufgabeHistoryRequestType">
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTeilaufgabeHistorySearchCriteria" type="tns:ReadTeilaufgabeHistorySearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die Ermittlung der Teilaufgabe.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTeilaufgabeHistoryResponseType">
                <xsd:annotation>
                    <xsd:documentation>Der Antwort-Typ der Teilaufgaben-Historien-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="historyListe" type="tns:TeilaufgabeHistoryListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die gelesenen Historien-Einträge.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTicketHistoryRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zum Lesen einer Tciket-Historie.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTicketHistorySearchCriteria" type="tns:ReadTicketHistorySearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Bestimmung des Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadTicketHistoryResponseType">
                <xsd:annotation>
                    <xsd:documentation>Der Antwort-Typ der Ticket-Historien-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="historyListe" type="tns:TicketHistoryListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der Historieneinträge.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TicketHistoryListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste mit Historieneinträgen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="history" type="tns:TicketHistoryType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die einzelnen Historien-Einträge.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Anzahl der Einträge in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="TicketHistoryType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten eines Historieneintrags zu einem Ticket.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="bearbeiter" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Bearbeiter des Tickets.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="datum" type="tns:IsoDateTime" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das Datum des Eintrags.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="intern" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Kennung, ob es sich um eine interne Bemerkung handelt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="aenderungsListe" type="tns:TicketAenderungsListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Eine optionale Liste von Änderungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="anhangListe" type="tns:AnhangListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Eine optionale Liste von Anhängen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TeilaufgabeHistoryListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste mit Historieneinträgen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="history" type="tns:TicketHistoryType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="ReadTeilaufgabeHistorySearchCriteriaType">
                <xsd:sequence>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des Tickets, zu der die Teilaufgabe gehört.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="teilaufgabeNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer der Teilaufgabe.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTicketHistorySearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen der Ticket-Historie.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ticketNr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Nummer des gesuchten Tickets.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TicketAenderungsListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Änderungen eines Tickets.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="aenderung" type="tns:TicketAenderungType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TicketAenderungType">
                <xsd:annotation>
                    <xsd:documentation>Daten einer Ticket-Änderungen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="label" type="xsd:string" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das Feld, das geändert wurde.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="old" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der alte Werte des Feldes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="new" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der neue Wert des Feldes.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTicketStatusRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request-Struktur zur Abfrage einer Ticket-Status Definition aus den Stammdaten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readticketStatusSearchCriteria" type="tns:ReadticketStatusSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zur Abfrage eines Ticket-Status.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadAbgeglicheneZeitenRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Request-Struktur zum Lesen von abgeglichenen Zeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="readAbgeglicheneZeitenSearchCriteria" type="tns:ReadAbgeglicheneZeitenSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien zum Lesen von abgeglichenen Zeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadAbgeglicheneZeitenResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort-Struktur zum Lesen von abgeglichenen Zeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abgeglicheneZeitenListe" type="tns:AbgeglicheneZeitenListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die LIste der abgeglichenen Zeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateAbgeglicheneZeitenRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung abgeglichener Zeiten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abgeglicheneZeiten" type="tns:AbgeglicheneZeitenType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateAbgeglicheneZeitenResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTicketStatusResponseType">
                <xsd:annotation>
                    <xsd:documentation>Der Antwort-Typ der Ticket-Status-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ticketStatusListe" type="tns:TicketStatusListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der gelesene Ticket-Status.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadticketStatusSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Suche nach Ticketsstatus.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="status" type="tns:Int1_7" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Status-Code.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TicketStatusListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Ticket-Status.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ticketStatus" type="tns:TicketStatusType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die einzelnen Ticket-Status.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der Statuseinträge in der Liste.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="TicketStatusType">
                <xsd:annotation>
                    <xsd:documentation>Die Daten zum Ticketstatus.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="status" type="tns:Int1_7" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Status-Code.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bezeichnung des Status.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BeschaeftigungszeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Beschäftigungszeiträumen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="beschaeftigungszeit" type="tns:BeschaeftigungszeitType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Beschäftigungszeiträume.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RegelarbeitszeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Eine Liste von Regelarbeitszeit-Definitionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="regelarbeitszeit" type="tns:RegelarbeitszeitType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Regelarbeitszeit-Definitionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="BeschaeftigungszeitType">
                <xsd:annotation>
                    <xsd:documentation>Dies eingeben nur wenn Beschaeftigungsbeginn von Erstellungsdatum abweichen soll, diese wird per default angelegt.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Id des Beschäftigungszeitraumes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Userid des Benutzers, dem dieser
                				Beschäftigungszeitraum zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="startdatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Startdatum des
                				Beschäftigungszeitraum.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="enddatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des
                				Beschäftigungszeitraum. Leer oder nicht
                				angegeben = unbefristet (Es darf nicht
                				zwei Beschaeftigungszeiten mit leerem
                				Enddatum geben).
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="bemerkung" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Eine Bemekung zum
                				Beschäftigungszeitraum.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="urlaubsanpruchInDiesemZeitraum"
                		type="tns:Decimal8_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Entweder urlaubsanpruchInDiesemZeitraum
                				oder urlaubsanspruchProJahr darf ein
                				Wert haben. Wenn beide Wert haben dann
                				wird nur bei
                				urlaubsanpruchInDiesemZeitraum
                				gespeichert.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="urlaubsanspruchProJahr"
                		type="tns:Decimal8_2" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Entweder urlaubsanpruchInDiesemZeitraum
                				oder urlaubsanspruchProJahr darf ein
                				Wert haben. Wenn beide Wert haben dann
                				wird nur bei
                				urlaubsanpruchInDiesemZeitraum
                				gespeichert.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="fehltagInStunden" type="tns:Decimal2_4" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>0 = jeder Fehltag ist soviel Wert wie die regelarbeitszeit an dem Tag,
eine Zahl = Der Wert des Fehltages wird anhand dieser Zahl berechnet.</xsd:documentation>
                		</xsd:annotation></xsd:element>
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die mit dem Beschäftigungszeitraum
                				durchzuführende Aktion.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RegelarbeitszeitType">
                <xsd:annotation>
                    <xsd:documentation>Dies eingeben nur wenn Regelarbeitszeiten von Standard-Arbeitszeiten in der Einstellungen abweichen soll, diese wird per default angelegt.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="id" type="xsd:int" maxOccurs="1"
                		minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Id des Regelarbeitszeit-Objektes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Userid des Benutzers, dem diese
                				Regelarbeitszeit zugeordnet ist.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="startdatum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Datum, ab dem die Regelarbeitszeit
                				gilt. Leer oder nicht angegeben =
                				Beschaeftigungsbeginn. Es dürfen nicht
                				zwei Regelarbeitszeiten mit leerem
                				Starddatum angelegt werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="montag" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Montag: Wenn
                				gleich -1 oder leer dann ist kein
                				Arbeitstag, ansonnsten ist Arbeitstag. -
                				Wenn 'monatlich' den Wert true hat und
                				dieser Tag ein Arbeitstag sein soll dann
                				irgend ein Wert > 0 eingeben, der
                				gültige wird sowieso automatisch aus dem
                				'monatlischeStunden' gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="dienstag" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Dienstag: Wenn
                				gleich -1 oder leer dann ist kein
                				Arbeitstag, ansonnsten ist Arbeitstag. -
                				Wenn 'monatlich' den Wert true hat und
                				dieser Tag ein Arbeitstag sein soll dann
                				irgend ein Wert > 0 eingeben, der
                				gültige wird sowieso automatisch aus dem
                				'monatlischeStunden' gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="mittwoch" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Mittwoch: Wenn
                				gleich -1 oder leer dann ist kein
                				Arbeitstag, ansonnsten ist Arbeitstag. -
                				Wenn 'monatlich' den Wert true hat und
                				dieser Tag ein Arbeitstag sein soll dann
                				irgend ein Wert > 0 eingeben, der
                				gültige wird sowieso automatisch aus dem
                				'monatlischeStunden' gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="donnerstag"
                		type="tns:Decimal12_6" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Donnerstag:
                				Wenn gleich -1 oder leer dann ist kein
                				Arbeitstag, ansonnsten ist Arbeitstag. -
                				Wenn 'monatlich' den Wert true hat und
                				dieser Tag ein Arbeitstag sein soll dann
                				irgend ein Wert > 0 eingeben, der
                				gültige wird sowieso automatisch aus dem
                				'monatlischeStunden' gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="freitag" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Freitag: Wenn
                				gleich -1 oder leer dann ist kein
                				Arbeitstag, ansonnsten ist Arbeitstag. -
                				Wenn 'monatlich' den Wert true hat und
                				dieser Tag ein Arbeitstag sein soll dann
                				irgend ein Wert > 0 eingeben, der
                				gültige wird sowieso automatisch aus dem
                				'monatlischeStunden' gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="samstag" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Samstag: Wenn
                				größer oder gleich 0 dann ist
                				Arbeitstag, ansonnsten ist kein
                				Arbeitstag. - Wenn 'monatlich' den Wert
                				true hat und dieser Tag ein Arbeitstag
                				sein soll dann irgend ein Wert > 0
                				eingeben, der gültige wird sowieso
                				automatisch aus dem 'monatlischeStunden'
                				gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="sonntag" type="tns:Decimal12_6"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				- Die Regelarbeitszeit am Sonntag: Wenn
                				größer oder gleich 0 dann ist
                				Arbeitstag, ansonnsten ist kein
                				Arbeitstag. - Wenn 'monatlich' den Wert
                				true hat und dieser Tag ein Arbeitstag
                				sein soll dann irgend ein Wert > 0
                				eingeben, der gültige wird sowieso
                				automatisch aus dem 'monatlischeStunden'
                				gerechnet.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="maximumStundenImMonat"
                		type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Stundenobergrenze im Monat.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="maximumStundenInWoche"
                		type="tns:Decimal13_10" maxOccurs="1" minOccurs="0" />
                	<xsd:element name="monatlich" type="xsd:boolean"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Achtung: Bitte die Hilfe in ZEP-Frontend
                				lesen bevor hier ein TRUE setzen.
                				Default ist false und false bedeutet
                				täglich.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="monatlicheStunden"
                		type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				wird wahr genommen nur wenn monatlich
                				gleich true ist
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="feiertagskalender"
                		type="tns:FeiertagskalenderType" maxOccurs="1" minOccurs="0"/>
                	
                	<xsd:element name="pausenregelung" type="tns:PausenregelungType" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="action" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die auf dem Regelarbeitszeit-Objekt
                				auszuführende Aktion.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadAbgeglicheneZeitenSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von abgeglichenen Zeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Benutzername.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="jahr" type="tns:int0_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Jahr, zu dem die abgeglichenen Zeiten geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="monat" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Monat, zu dem die abgeglichenen Zeiten geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AbgeglicheneZeitenListeType">
                <xsd:annotation>
                    <xsd:documentation>Die LIste der abgeglichenen Zeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="abgeglicheneZeiten" type="tns:AbgeglicheneZeitenType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen abgeglichenen Zeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int">
                    <xsd:annotation>
                        <xsd:documentation>Die Anzahl der in der Liste enthaltenen abgeglichenen Zeiten.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="AbgeglicheneZeitenType">
                <xsd:annotation>
                    <xsd:documentation>Informationen zu einem Zeitabgleich.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der User, für dens die abgeglichenen Zeiten gelten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="monat" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Monat, für den die abgeglichenen Zeiten gelten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="jahr" type="xsd:int" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das Jahr für das die abgeglichenen Zeiten gelten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abgeglicheneUeberstunden" type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Anzahl der abgeglichenen Überstunden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="abgeglicheneUrlaubstage" type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Anzahl der abgeglichenen Urlaubstage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Bemerkung zu den abgeglichenen Zeiten.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="verfalleneUrlaubstage" type="tns:Decimal13_10" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Wird nur beim Lesen zurückgeliefert. Beim Anlegen oder Bearbeiten der abgeglichene Zeiten via SOAP wird ignoriert.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="int0_2">
                <xsd:restriction base="xsd:int">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="2"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="TagessatzanteilListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Tagessatzanteilen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="tagessatzanteil" type="tns:TagessatzanteilType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Tagessatzanteile.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TagessatzanteilType">
                <xsd:annotation>
                    <xsd:documentation>Die Definition eines Tagessatzanteils.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Id des Tagessatzanteils.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="vonStd" type="tns:Decimal6_4" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das untere Grenze des Stunden-Intervalls.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bisStd" type="tns:Decimal6_4" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das obere Grenze des Stunden-Intervalls.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="satzanteil" type="tns:Decimal2_8" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der Tagessatz-Anteil.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="Decimal2_8">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 2 und der Nachkommastellen = 8
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="99.99999999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="Decimal2_2">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 2 und der Nachkommastellen = 2
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="99.99"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="InternersatzListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von internen Sätzen.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="internersatz" type="tns:InternersatzType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen intenen Sätze.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="InternersatzType">
                <xsd:annotation>
                    <xsd:documentation>Definiert einen internen Satz. i.e. Stunden- oder Tagessatz.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Id des internen Stundensatzes. Muss bei der Bearbeitung angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Optional, wird nur beim Lesen zurueck gegeben.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="satz" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Satz, zu dem der Mitarbeiter intern verrechnet wird.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="satztype" type="tns:int0_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Typ des 'internen Satzes': 1=Stundensatz, 2=Tagessatz (nur bei Freelancer)

                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="startdatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Datum, ab dem der interne Satz gilt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Bemerkung zum Satz.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ZusatzfelderType">
                <xsd:annotation>
                    <xsd:documentation>Definition von Kunden- oder Projektzusatzfeldern und Rechnungstext.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                	<xsd:element name="feld1" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="value1" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Wert des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="feld2" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="value2" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Wert des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="feld3" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="value3" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Wert des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="feld4" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="value4" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Wert des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="feld5" type="tns:String120"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Die Bezeichnung des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="value5" type="xsd:string"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Wert des Zusatzfeldes.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungstextOben"
                		type="xsd:string" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der obere Rechnungstext.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="rechnungstextUnten"
                		type="xsd:string" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der untere Rechnungstext. Darf nur
                				Kundenzusatzfelder gefuellt werden.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>Aktion. Um die Zusatzfelder im Rahmen eines Updates zu löschen muss hier 'delete' angegeben werden.</xsd:documentation>
                		</xsd:annotation></xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="int0_100">
            	<xsd:restriction base="xsd:int">
            		<xsd:minInclusive value="0" />
            		<xsd:maxInclusive value="100" />
            	</xsd:restriction>
            </xsd:simpleType>
            <xsd:complexType name="ReadTagessatzanteileResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Antwort mit den gelesenen Tagessatzanteilen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="tagessatzanteilListe" type="tns:TagessatzanteilListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der gelesenen Tagessatzanteile.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungspositionFestpreisRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Abfrage von Festpreis-Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readRechnungspositionFestpreisSearchCriteria" type="tns:ReadRechnungspositionFestpreisSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die zu liefernden Festpreis-Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadRechnungspositionFestpreisResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response-Struktur mit dem Ergebnis der Abfrage von Festpreis-Rechnungspositions.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungspositionFestpreisListe" type="tns:RechnungspositionFestpreisListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Liste von Festpreis-Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadRechnungspositionRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zur Abfrage von Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readRechnungspositionSearchCriteria" type="tns:ReadRechnungspositionSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Suchkriterien für die zu liefernden Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadRechnungspositionResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response-Struktur mit dem Ergebnis der Rechnungspositions-Abfrage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="rechnungspositionListe" type="tns:RechnungspositionListeType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Liste der gelesenen Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTagessatzanteileRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Request-Struktur zum Lesen von Tagessatzanteilen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="readTagessatzanteileSearchCriteria" type="tns:ReadTagessatzanteileSearchCriteriaType" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Kriterien zur Suche nach Tagessatzanteilen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadTagessatzanteileSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von Tagessatzanteilen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="vonStd" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die untere Grenze des Intervalls, zu der Tagessatzanteile geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bisStd" type="tns:Decimal6_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die obere Grenze des Intervalls, zu der Tagessatzanteile geliefert werden sollen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="FehldauerType">
                <xsd:annotation>
                    <xsd:documentation>Die Dauer einer Fehlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="ganzerTag" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="halberTag" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="stunden" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadRechnungspositionFestpreisSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Kriterien zur Suche von Festpreis-Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Projekt, zu dem die Festpreis-Rechnungspositionen zu liefern sind.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Kunde, zu dem die Festpreis-Rechnungspositionen zu liefern sind.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="leistungszeitraumBeginn" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Startdatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="leistungszeitraumEnde" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Endedatum des Leistungszeitraums der zu liefernden Festpreis-Rechnungspositionen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadRechnungspositionSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Kriterien zur Suche von Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                	<xsd:element name="projektNr" type="tns:String64"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Projekt, zu dem Rechnungspositionen
                				abgefragt werden sollen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="kundenNr" type="tns:String32"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Kunde, zu dem Rechnungspositionen
                				abgefragt werden sollen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumBeginn"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Anfangsdatum des Leistungszeitraums
                				der zu liefernden Rechnungspositionen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="leistungszeitraumEnde"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Das Endedatum des Leistungszeitraums der
                				zu liefernden Rechnungspositionen.
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="status" type="tns:int0_3"
                		maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation>
                				Der Status der zu liefernden
                				Rechnungspositionen. 0 = geplant, 1 =
                				freigegeben, 2 = abgerechnet, 3 =
                				storniert. leer bzw. nicht definiert =
                				alle
                			</xsd:documentation>
                		</xsd:annotation>
                	</xsd:element>
                	<xsd:element name="rechnungsdatum"
                		type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                		<xsd:annotation>
                			<xsd:documentation />
                		</xsd:annotation>
                	</xsd:element>

                	<xsd:element name="projektId" type="xsd:int"
                		maxOccurs="1" minOccurs="0" />
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RechnungspositionFestpreisListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste der Festpreis-Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="rechnungspositionFestpreis" type="tns:RechnungspositionFestpreisType" maxOccurs="unbounded" minOccurs="0"/>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="RechnungspositionListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Rechnungspositionen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="rechnungsposition" type="tns:RechnungspositionType" maxOccurs="unbounded" minOccurs="0"/>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="MahlzeitType">
                <xsd:annotation>
                    <xsd:documentation>Die Struktur zur Anlage von Mahlzeiten an einem Tag.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Userid des Benutzers.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum, an dem der Mahlzeiten-Eintrag angelegt werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="breakfast" type="tns:int0_1" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Boolean Flagge, ob an dem Tag ein Frühstück stattfand (0/1).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="lunch" type="tns:int0_1" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Boolean Flagge, ob an dem Tag ein Mittagessen stattfand (0/1).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="dinner" type="tns:int0_1" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Boolean Flagge, ob an dem Tag ein Abendessen stattfand (0/1).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadMahlzeitSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von Mahlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Hat datum Wert und bisDatum überhaupt nicht vorhanden dann bisDatum = datum. Hat datum Wert und bisDatum vorhanden (auch leer) gilt datum als Startdatum. Hat datum kein Wert oder nicht Vorhanden gilt als unendlich in der Vergangenheit.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bisDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Ist bisDatum vorhanden und leer dann gilt als unendlich. Ist bisDatum nicht vorhanden dann bisDatum = datum.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="MahlzeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Mahlzeiten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="mahlzeit" type="tns:MahlzeitType" maxOccurs="unbounded" minOccurs="0"/>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            <xsd:element name="UpdateMahlzeitRequest" type="tns:UpdateMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Request-Struktur zur Aktualisierung von Mahlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="UpdateMahlzeitResponse" type="tns:UpdateMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Response-Struktur nach der Aktualisierung von Mahlzeiten.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteMahlzeitRequest" type="tns:DeleteMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Der Request zum Löschen der Mahlzeiten eines Tages.
                    </xsd:documentation>
                </xsd:annotation>
            </xsd:element>
            <xsd:element name="DeleteMahlzeitResponse" type="tns:DeleteMahlzeitResponseType"/>

            <xsd:complexType name="UpdateMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Parameter zur Aktualisierung von Mahlzeiten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="mahlzeit" type="tns:MahlzeitType" maxOccurs="1" minOccurs="1"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="UpdateMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="DeleteMahlzeitRequestType">
                <xsd:annotation>
                    <xsd:documentation>Die Request-Struktur zum Löschen der Mahlzeiten eines Tages.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="requestHeader" type="tns:RequestHeaderType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Request-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="userId" type="tns:String32" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die Userid des Benutzers.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="datum" type="tns:IsoDate" minOccurs="1" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Das Datum des Tages, an dem die Mahlzeit gelöscht werden soll.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="DeleteMahlzeitResponseType">
                <xsd:annotation>
                    <xsd:documentation>Die Response-Struktur mit dem Ergebnis des Löschens einer Mahlzeit.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="responseHeader" type="tns:ResponseHeaderType">
                        <xsd:annotation>
                            <xsd:documentation>Der allgemeine ZEP Response-Header.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="IsoDateTime">
                <xsd:annotation>
                    <xsd:documentation>
                        IsoDateTime = IsoDate IsoTime
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="10"/>
                    <xsd:maxLength value="19"/>
                    <xsd:pattern value="^\d{4}-\d{2}-\d{2}\s+\d{1,2}:\d{1,2}(:\d{1,2})?$"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="ReadArtikelSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von Artikeln.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="artikelnummer" type="tns:String128" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String128" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="einheit" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Einheit des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="einzelpreis" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Einzelpreis des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="inaktiv" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob aktive oder inaktive Artikel zu liefen sind.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="modifiedSince" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Suche nach Artikeln, die nach diesem Datum geändert wurden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ArtikelListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Artikeln.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="artikel" type="tns:ArtikelType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="ArtikelType">
                <xsd:annotation>
                    <xsd:documentation>Daten eines Artikels.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="artikelnummer" type="tns:String128" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bezeichnung" type="tns:String128" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="einheit" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Einheit des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="einzelpreis" type="tns:Decimal10_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Einzelpreis des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Währung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="beschreibung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Beschreibung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="inaktiv" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Flagge, ob der Artikel aktiv oder inaktiv ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Anlagedatum des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Datum der letzten Aktualisierung des Artikels.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="neueArtikelnummer" type="tns:String128" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Neue Nummer der Artikels (bei Update der Artikelnummer).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:simpleType name="String128">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="128"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="Decimal8_2">
                <xsd:annotation>
                    <xsd:documentation>Anzahl der Vorkommastellen = 8 und der Nachkommastellen = 2
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:float">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="99999999.99"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="Decimal8_10">
                <xsd:annotation>
                    <xsd:documentation>
                        Anzahl der Vorkommastellen = 8 und der Nachkommastellen = 10
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:float">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="99999999.9999999999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:simpleType name="String2">
                <xsd:restriction base="xsd:string">
                    <xsd:minLength value="0"/>
                    <xsd:maxLength value="2"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="VorgangstaetigkeitListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Vorgangstätigkeiten</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:VorgangstaetigkeitType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="VorgangstaetigkeitType">
                <xsd:annotation>
                    <xsd:documentation>Daten zur Zuordnung einer Vorgangstätigkeit</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="SchlagworteListeType">
                <xsd:annotation>
                    <xsd:documentation>Die Liste von Schlagworten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="schlagwort" type="tns:SchlagwortType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="verknuepfung_und" type="xsd:boolean" default="false" use="optional">
                    <xsd:annotation>
                        <xsd:documentation>ist relevant nur fürs Lesen. Wenn =true dann werden Objekte geliefert die alle nachgefragten Kategorien enthalten. Default =false.
                        </xsd:documentation>
                    </xsd:annotation>
                </xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="SchlagwortType">
                <xsd:annotation>
                    <xsd:documentation>
                        Es reicht ein Schlagwort einer Sprache einzugeben bei der Suche. Beim Anlegen bzw. Bearbeiten es ist zu empfehlen die Synonyme in der 3 Sprachen einzegeben wenn das Schlagwort noch nicht in Stammdaten definiert.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="de" type="xsd:string" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="en" type="xsd:string" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="fr" type="xsd:string" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>

            </xsd:complexType>
            <xsd:complexType name="ReadSchlagworteSerachCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zum Lesen von Schlagworten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="schlagwortArt" type="xsd:string"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AbteilungsleiterListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Abteilungsleitern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Wegen neue Feature create/update Abteilung wird empfolen das AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen eines Abteilungsleiter.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilungsleiter" type="tns:AbteilungsleiterType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Wegen neue Feature create/update Abteilung wird empfolen das AbteilungsleiterType zu benutzen, der unterstützt auch das Löschen eines Abteilungsleiter.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="StatusListeType">
                <xsd:annotation>
                    <xsd:documentation>Die Liste von Status.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="status" type="tns:Int1_7" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Status des Tickets (1=neu, 2=in Bearbeitung, 3=fertig, 4=abgelehnt, 5=abgenommen).
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="AbteilungsleiterType">
                <xsd:annotation>
                    <xsd:documentation>Daten eines Abteilungsleiters.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Aktion. Um die Abteilungsleiter-Zuordnung zum Object im Rahmen eines Updates zu entfernen muss hier "delete" angegeben werden.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="MassenListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste der auszuführenden Massen-Operationen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>

                    <xsd:element name="mitarbeiter" type="tns:MitarbeiterType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="kunde" type="tns:KundeType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="projekt" type="tns:ProjektType" maxOccurs="unbounded" minOccurs="0"/>

                    <xsd:element name="ticket" type="tns:TicketType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="teilaufgabe" type="tns:TeilaufgabeType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="projektzeit" type="tns:ProjektzeitType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="beleg" type="tns:BelegType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="mahlzeit" type="tns:MahlzeitType" maxOccurs="unbounded" minOccurs="0"/>
                    <xsd:element name="fehlzeit" type="tns:FehlzeitType" maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                für Operation createFehlzeit
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="einplanung" type="tns:EinplanungType" maxOccurs="unbounded" minOccurs="0"/>

                    <xsd:element name="artikel" type="tns:ArtikelType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="MassenResponseListeType">
                <xsd:annotation>
                    <xsd:documentation>Das Resultat der Request-Ausführung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="response" type="tns:ResponseHeaderType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadEinplanungSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Suchkriterien zur Abfrage von Einplanungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="vonDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="bisDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="userIdListe" type="tns:UserIdListeType" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="projektNrListe" type="tns:ProjektNrListeType" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadVorgangSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Suchkriterien zur Abfrage von Vorgängen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="1"/>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="vorgangNr" type="tns:String64" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="parentId" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                bitte mit 0 belegen falls nach Vorgaenge ohne Parents gesucht wird.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="parent" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                VorgangNr des übergeordneten Vorgang. Bitte mit 0 belegen falls nach Vorgaenge ohne Parents gesucht wird.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="startDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="endeDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="statusListe" type="tns:VorgangStatusListeType" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="EinplanungListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Einplanungen.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="einplanung" type="tns:EinplanungType" maxOccurs="unbounded" minOccurs="0"/>

                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="EinplanungType">
                <xsd:annotation>
                    <xsd:documentation>Daten einer Einplanung.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="1"/>

                    <xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="anzahlStunden" type="tns:Decimal7_11" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert sein
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="prozentDerVerfuegbarkeit" maxOccurs="1" minOccurs="0" type="xsd:double">
                        <xsd:annotation>
                            <xsd:documentation>
                                entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert sein
                            </xsd:documentation>
                        </xsd:annotation>

                    </xsd:element>

                    <xsd:element name="vonZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert sein
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bisZeit" type="tns:IsoTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                entwider anzahlStunden (decimal) oder prozentDerVerfuegbarkeit (decimal zwischen 0 und 100) oder (vonZeit und bisZeit) muss definiert sein
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektId" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:simpleType name="Decimal7_11">
                <xsd:restriction base="xsd:double">
                    <xsd:minInclusive value="0"/>
                    <xsd:maxInclusive value="9999999.99999999999"/>
                </xsd:restriction>
            </xsd:simpleType>

            <xsd:complexType name="VorgangStatusListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Vorgangs-Status.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="status" type="tns:String64" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="CheckCreateUserCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Kriterien zur Prüfung der User-Anlage.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="vonDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>ob ab diesem Datum die Lizenz verletzt wird</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bisDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>ob bis zu diesem Datum die Lizenz verletzt wird</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="stichtag" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Datum für die Abfrage der Anzahl der noch verfügbaren Lizenzen</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="FilterProjekteSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Suchkriterien zur Suche nach Projekten.</xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="von" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Anfangsdatum des Zeitraums, in dem die zu liefernden Projekte liegen müssen. Format: YYYY-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="bis" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Enddatum des Zeitraums, in dem die zu liefernden Projekte liegen müssen. Format: YYYY-MM-TT.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektNrListe" type="tns:ProjektNrListeType" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste der Projekt-Nummern der zu berücksichtigenden Projekte.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Abteilung, der die zu liefernden Projekte zugeordnet sein müssen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="inklusiveUnterabteilung" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>default = false</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="statusListe" type="tns:ProjektstatusListeType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Status der zu liefernden Projekte.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="schlagworteFilter" type="tns:SchlagworteFilterType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Das Schlagwort kann hier egal in welcher Sprachen eingeben werden. -ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kategorieFilter" type="tns:KategorieFilterType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>-ohne- oder -without- oder -sans- lieferen Objekte Ohne Schlagworte</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenNrListe" type="tns:KundenNrListeType" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="suchbegriff" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle nach: Kurzform, Bezeichnung,Bemerkung eingeschränkt. Verwenden Sie das %-Zeichen als Platzhalter (wildcard). D.h., mit % können Sie beliebige Wörter/Buchstaben darstellen, die sich zwischen Ihren Suchbegriffen befinden.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modifiedSince" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ProjektstatusListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Projekt-Status.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="status" type="tns:String64" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="KundenNrListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Kunden-Nummern.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="KategorieFilterType">
                <xsd:annotation>
                    <xsd:documentation>Filterkriterien zur Abfrage von Kategorien.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="kategorie" type="tns:String32" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="verknuepfung_und" type="xsd:boolean" default="false"/>
            </xsd:complexType>

            <xsd:complexType name="ProjektDataListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Projekt-Daten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="projektData" type="tns:ProjektDataType" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="ProjektDataType">
                <xsd:annotation>
                    <xsd:documentation>Daten eines Projektes.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eindeutig und nicht änderbar, es wird in Datenbank automatisch angelegt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="projektNr" type="tns:String64" minOccurs="0" maxOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Nummer des Kunden, dem dieses Projekt zugeordnet ist. Pflicht bei der Anlage.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bezeichnung" type="tns:String255" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Bezeichnung des Projektes. Pflicht beim Anlegen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="abteilung" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Abteilung, der das Projekt zugeordnet ist.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="startDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Start-Datum des Projekts. Format: JJJJ-MM-TT
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="endeDatum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Das Ende-Datum des Projekts. Format: JJJJ-MM-TT
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Eine Bemerkung zum Projekt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="planKosten" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die geplanten Kosten des Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="planStunden" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die geplanten Stunden des Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="planArbeitsentgelt" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Plan Arbeitsentgelt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="planPauschal" type="tns:Decimal12_2" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der geplante Pauschalpreis des Projekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kostenstelle" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Kostenstelle des Projekts (bei Einsatz des Moduls 'Export für Buchhaltung').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kundenAuftrag" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Aufragsnummer des Kunden für dieses Projekt.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="kostentraeger" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Kostenträger des Projekts (bei Einsatz des Moduls 'Export für Buchhaltung').
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="status" type="tns:String64" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Der Status des Projekts. Dieses ist die Kurzbezeichnung eines der in den Stammdaten definierten Status.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="rechenArt" type="tns:int1_3" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                1=Abrechnung Stundensatz 2=Abrechnung Tagessatz 3=Abrechnung Pauschal
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="ueberbuchung" type="tns:int0_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                0=Überbuchung nicht verhindern. 1=Überbuchung verhindern nur für fakturierbare Zeiten. 2=Überbuchung verhindern alle Zeiten. 3=Fakturierbar ohne Reise. 4=Alle ohne Reise.

                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Die Projektwährung.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="projektbundesland" type="tns:String64" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="projektland" type="tns:String32" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="voreinstFakturierbarkeit" type="tns:int1_4" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                1=Voreinstellung Fakturierbar, durch den Mitarbeiter änderbar 2=Voreinstellung Fakturierbar, durch den Mitarbeiter nicht änderbar 3=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter änderbar 4=Voreinstellung Nicht Fakturierbar, durch den Mitarbeiter nicht änderbar
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="istStunden" type="tns:Decimal8_10" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="istStundenFakt" type="tns:Decimal8_10" maxOccurs="1" minOccurs="0"/>

                    <xsd:element name="created" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der Anlage des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der Zeitpunkt der letzten Änderung des Objekts.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>

                    <xsd:element name="kategorieListe" type="tns:KategorieListeType" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="schlagworteListe" type="tns:SchlagworteListeType" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="attributes" type="tns:AttributesType" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>
                                Liste von Attributen für kundenspezifische Erweiterungen.
                            </xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="SchlagworteFilterType">
                <xsd:annotation>
                    <xsd:documentation>Filterkriterien zur Abfrage von Schlagworten.
                    </xsd:documentation>
                </xsd:annotation>
                <xsd:sequence>
                    <xsd:element name="schlagwort" type="tns:String64" maxOccurs="unbounded" minOccurs="0"/>
                </xsd:sequence>
                <xsd:attribute name="verknuepfung_und" type="xsd:boolean" default="false"/>
            </xsd:complexType>

            <xsd:element name="readTaetigkeit">
                <xsd:complexType>
                    <xsd:sequence>

                        <xsd:element name="in" type="xsd:string"/>
                    </xsd:sequence>
                </xsd:complexType>
            </xsd:element>
            <xsd:element name="readTaetigkeitResponse">
                <xsd:complexType>
                    <xsd:sequence>

                        <xsd:element name="out" type="xsd:string"/>
                    </xsd:sequence>
                </xsd:complexType>
            </xsd:element>
            <xsd:complexType name="ReadTaetigkeitSearchCriteriaType">
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="TaetigkeitListeType">
                <xsd:sequence>
                    <xsd:element name="taetigkeit"
                                 type="tns:TaetigkeitType" maxOccurs="unbounded"
                                 minOccurs="0"/>
                    
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="TaetigkeitType">
                <xsd:sequence>
                    <xsd:element name="taetigkeit" type="tns:String32"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="bezeichnung" type="xsd:string"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="bemerkung" type="xsd:string"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="istReise" type="xsd:boolean"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="darfUeberschneiden"
                                 type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>true : darf sich mit anderen überschneiden, ist nicht arbeitsteitrelevant, nicht VMA-relevant und darf mit Dauer 0 gebucht werden.
                                z.B. Rufbereitschaft</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="nichFakturierbarAuswertbar" type="xsd:boolean" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>true : auch 'nicht fakturierbar' gebuchte Projektzeiten sind auf Projektzeitnachweis, Projektumsatz und Rechnungsanhang sichtbar.
                                z.B. Kulanz</xsd:documentation>
                        </xsd:annotation></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ProjektzeitUndBelegeType">
                <xsd:sequence>
                    <xsd:element name="minutenraster" type="xsd:int" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="FeiertagskalenderType">
            	<xsd:sequence>
            		<xsd:element name="name" type="tns:String64"
            			maxOccurs="1" minOccurs="1"/>
            		
            		<xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0"/>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="PausenregelungType">
            	<xsd:sequence>
            		<xsd:element name="name" type="tns:String64"
            			maxOccurs="1" minOccurs="1"/>
            		
            		<xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0"/>
            	</xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="OrtType">
                <xsd:sequence>
                    <xsd:element name="kurzform" type="tns:String32"
                                 maxOccurs="1" minOccurs="1"/>
                    
                    <xsd:element name="bezeichnung" type="tns:String64"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="heimarbeitsort"
                                 type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="inland" type="xsd:boolean"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="waehrung" type="tns:String32" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="OrtslisteType">
                <xsd:sequence>
                    <xsd:element name="id" type="xsd:int" maxOccurs="1"
                                 minOccurs="0"/>
                    
                    <xsd:element name="gueltigAb" type="tns:IsoDate"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="gueltigBis" type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="bemerkung" type="xsd:string"
                                 maxOccurs="1" minOccurs="0"/>
                    
                    <xsd:element name="ort" type="tns:OrtType"
                                 maxOccurs="unbounded" minOccurs="0"/>
                    

                </xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="OrtslisteListeType">
                <xsd:sequence>
                    <xsd:element name="ortsliste"
                                 type="tns:OrtslisteType" maxOccurs="unbounded"
                                 minOccurs="0"/>
                    
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType
                    name="ReadOrtslisteSearchCriteriaType">
                <xsd:sequence>
                    <xsd:element name="datum" type="tns:IsoDate" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>liefert Ortsliste, welche an diesem Datum gueltig ist</xsd:documentation>
                        </xsd:annotation></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
        
            <xsd:simpleType name="int1_20">
            	<xsd:restriction base="xsd:int">
            		<xsd:minInclusive value="1"/>
            		<xsd:maxExclusive value="20"/>
            	</xsd:restriction>
            </xsd:simpleType>
        
            <xsd:complexType name="ReadKommtGehtSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="von" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                        	<xsd:documentation/>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDateTime" maxOccurs="1" minOccurs="1"/>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="KommtGehtListeType">
            	<xsd:sequence>
            		<xsd:element name="kommtGeht"
            			type="tns:KommtGehtType" maxOccurs="unbounded"
            			minOccurs="0"/>
            		
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="KommtGehtType">
            	<xsd:sequence>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="1"/>
            		
            		<xsd:element name="wann" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>wann kommt oder geht</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="typ" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>kommt oder geht</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>

            		<xsd:element name="bemerkung" type="xsd:string" maxOccurs="1" minOccurs="0"/>
                    <xsd:element name="geraetTyp" type="xsd:string" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Terminal , App , Web ( Web-Oberfläche) oder Task (Automatisch abgelmeldet)</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
                    <xsd:element name="geraetName" type="tns:String120"
            			maxOccurs="1" minOccurs="0"/>


                </xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="RechnungSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="rechnungNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Die Rechnungsnummer.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0" />

            		<xsd:element name="kundenabteilung"
            			type="tns:String32" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Die Abteilung des Kunden.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="projektsabteilung"
            			type="tns:String32" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Die Abteilung des Projekts.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="inklusiveUnterabteilung"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Flagge, ob auch in Unterabteilungen
            					gesucht werden soll.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="von" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Startdatum des Zeitraums für Suche der
            					Rechnungen.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Endedatum des Zeitraums für Suche der
            					Rechnungen.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bereitsAlsEMailVersendet"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					true oder 1= nur als Mail versendet0
            					false oder 0 = nur nicht als Mail
            					versendet leer oder nicht defniert =
            					alle
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="titel" type="tns:String120"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					ist auch die Gutschriftsnummer bzw.
            					exterener Referenz bei
            					Eingangsgutschriften.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="projektId" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0"></xsd:element>
            		<xsd:element name="modifiedSince"
            			type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="RechnungListeType">
                <xsd:annotation>
                    <xsd:documentation>Liste von Rechnungen.</xsd:documentation>
                </xsd:annotation>
            	<xsd:sequence>
            		<xsd:element name="rechnung" type="tns:RechnungType"
            			maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die in der Liste enthaltenen Rechnungen.</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="RechnungType">
            	<xsd:sequence>
            		<xsd:element name="rechnungNr" type="tns:String32"
            			maxOccurs="1" minOccurs="1">
            			<xsd:annotation>
            				<xsd:documentation>
            					Die Rechnungsnummer.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="art" type="tns:int0_1"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>0 = Rechnung
1 = Eingangsgutschrift</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="datum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Das Rechnungsdatum.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="betrag" type="tns:Decimal10_2"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					brutto
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="status" type="tns:int0_2"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>0 = abgerechnet
1 = storniert
2 = in Korrektur</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="waehrung" type="tns:String32"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="korrekturdatum"
            			type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="zahlungszielDatum"
            			type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="adresse" type="xsd:string"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="zahlungsziel" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Kurzform der Abteilung
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="emaildatum"
            			type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="emailempfaenger"
            			type="tns:String255" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="kundenNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="rechnungspositionListe"
            			type="tns:RechnungspositionListeType" maxOccurs="1"
            			minOccurs="0"/>
            		
            		<xsd:element name="mahnungListe"
            			type="tns:MahnungListeType" maxOccurs="1"
            			minOccurs="0"/>
            		
            		<xsd:element name="titel" type="tns:String120" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>ist auch die Gutschriftsnummer bzw. exterener Referenz bei Eingangsgutschriften.</xsd:documentation></xsd:annotation></xsd:element>
            		<xsd:element name="created" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="modified" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="attributes"
            			type="tns:AttributesType" maxOccurs="1" minOccurs="0"/>
            		
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:simpleType name="Decimal8_4">
                <xsd:annotation>
                	<xsd:documentation>Anzahl der Vorkommastellen = 8 und der Nachkommastellen = 4</xsd:documentation>
                </xsd:annotation>
                <xsd:restriction base="xsd:double">
            		<xsd:minInclusive value="0"/>
            		<xsd:maxInclusive value="99999999.9999"/>
            	</xsd:restriction>
            </xsd:simpleType>
        
            <xsd:complexType name="MahnungListeType">
            	<xsd:sequence>
            		<xsd:element name="mahnung" type="tns:MahnungType"
            			maxOccurs="unbounded" minOccurs="0"/>
            		
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="MahnungType">
            	<xsd:sequence>
            		<xsd:element name="id" type="xsd:int" maxOccurs="1"
            			minOccurs="0"/>
            		
            		<xsd:element name="titel" type="tns:String64"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="rechnungNr" type="tns:String32"
            			maxOccurs="1" minOccurs="1"/>
            		
            		<xsd:element name="datum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="betrag" type="tns:Decimal10_2"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="ausstehenderBetrag"
            			type="tns:Decimal10_2" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="zahlungszielDatum"
            			type="tns:IsoDate" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="zahlungsziel" type="xsd:int" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="adresse" type="xsd:string"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="created" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="modified" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="attributes"
            			type="tns:AttributesType" maxOccurs="1" minOccurs="0"/>
            		
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="RfidChipListeType">
            	<xsd:sequence>
            		<xsd:element name="rfidChip" type="tns:RfidChipType"
            			maxOccurs="unbounded" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die Liste der RFID-Chips.</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="RfidChipType">
            	<xsd:sequence>
            		<xsd:element name="rfid" type="tns:String32"
            			maxOccurs="1" minOccurs="1">
                        <xsd:annotation>
                            <xsd:documentation>Die RFID-Kennung des Chips.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der User, dem der Chip zugeordnet ist/wird.</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="created" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="ReadRfidChipsSearchCriteriaType">
                <xsd:annotation>
                    <xsd:documentation>Die Kriterien zur Suche von RFID-Chips.</xsd:documentation>
                </xsd:annotation>
            	<xsd:sequence>
            		<xsd:element name="rfid" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Die RFID-Kennung des Chips.</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                            <xsd:documentation>Der User, dessen RFID-Chip gelesen wird.</xsd:documentation>
                        </xsd:annotation>
                    </xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="GeraetListeType">
            	<xsd:sequence>





            		<xsd:element name="geraet" type="tns:GeraetType"
            			maxOccurs="unbounded" minOccurs="0"/>
            		
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="GeraetType">
            	<xsd:sequence>
            		<xsd:element name="id" type="xsd:int" maxOccurs="1"
            			minOccurs="1"/>
            		
            		<xsd:element name="typ" type="tns:int0_1"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>0 = APP
1 = Terminal</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="name" type="tns:String120"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="userIdListe"
            			type="tns:UserIdListeType" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="userKategorieListe"
            			type="tns:KategorieListeType" maxOccurs="1"
            			minOccurs="0"/>
            		
            		<xsd:element name="standortUebermitteln" type="xsd:boolean"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="administratorPinCode" type="tns:String32"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="status" type="tns:int0_10"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Status des Deivces:
 0=inaktiv, 
1=aktiv, 
2=warte auf connect 
3=aktiv im Lernmodus
8=Neustart(nur bei Terminal)
9=Neustart Konfiguration (nur bei Terminal)
</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="erfassungszeitVon"
            			type="tns:IsoTime" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="erfassungszeitBis"
            			type="tns:IsoTime" maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="startzeitAnzeigen"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Für die Anzeige auf dem Gerät.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>

            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType
            	name="ReadGeraetSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="typ" type="xsd:string">
            			<xsd:annotation>
            				<xsd:documentation>Mögliche Eingaben sind: App oder Terminal oder Leer </xsd:documentation>
            			</xsd:annotation></xsd:element>
            		<xsd:element name="status" type="xsd:string"/>
            		<xsd:element name="suchbegriff" type="xsd:string">
            			<xsd:annotation>
            				<xsd:documentation>Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle nach:
Userid, Mitarbeitername, Mitarbeitervorname, Gerätname
eingeschränkt.</xsd:documentation>
            			</xsd:annotation></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadPreisgruppeSearchCriteriaType">
                <xsd:sequence>
                	<xsd:element name="kurzform" type="xsd:string"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="inaktiv" type="xsd:boolean" maxOccurs="1" minOccurs="0"></xsd:element>
                </xsd:sequence>
            </xsd:complexType>
        
            <xsd:simpleType name="int0_10">
            	<xsd:restriction base="xsd:int">
            		<xsd:minInclusive value="0"/>
            		<xsd:maxInclusive value="10"/>
            	</xsd:restriction>
            </xsd:simpleType>
        
            <xsd:complexType name="PreisgruppeListeType">
            	<xsd:sequence>
            		<xsd:element name="preisgruppe" type="tns:PreisgruppeType" maxOccurs="unbounded" minOccurs="0"/>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
        
            <xsd:complexType name="PreisgruppeType">
            	<xsd:sequence>
            		<xsd:element name="kurzform" type="tns:String32"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="bezeichnung_de" type="tns:String82"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="bezeichnung_en" type="tns:String82"
            			maxOccurs="1" minOccurs="0"/>
            		
            		<xsd:element name="bezeichnung_fr" type="tns:String82" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="inaktiv" type="xsd:boolean"
            			maxOccurs="1" minOccurs="0"/>
            		
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:simpleType name="String82">
            	<xsd:restriction base="xsd:string">
            		<xsd:minLength value="0"></xsd:minLength>
            		<xsd:maxLength value="82"></xsd:maxLength>
            	</xsd:restriction>
            </xsd:simpleType>
        
            <xsd:complexType name="KundenverantwortlicherListeType">
            	<xsd:sequence>
            		<xsd:element name="kundenverantwortlicher" type="tns:KundenverantwortlicherType" maxOccurs="unbounded" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="KundenverantwortlicherType">
            	<xsd:sequence>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="1">
            		</xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="darfKundeAendern"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="primaer" type="xsd:boolean"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="mitBudgetverantwortung"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="action" type="xsd:string" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>Zum Löschen des Kundenveratwortlicher-Zuordnung im Rahmen des UpdateKunde-Requests auf 'delete' setzen.
                			</xsd:documentation>
            			</xsd:annotation></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="BelegeinstellungenType">
              	<xsd:sequence>
            		<xsd:element name="belegerfassung"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="belegerfassungOhneVorgang"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zuFakturierendenBetrag" type="tns:int0_2" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>0 = bei der Erfassung selbst eingeben
1 = Vorbelegung identisch weiterfakturieren
2 = Vorbelegung nicht weiterfakturieren</xsd:documentation>
            			</xsd:annotation></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="ReadAngebotSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="von" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="abteilung" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="projektNr" type="tns:String64" maxOccurs="1" minOccurs="0"></xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0"></xsd:element>
            		<xsd:element name="status" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					10 = NEU; 20 = IN_BEARBEITUNG; 30 =
            					FERTIG; 40 = IN_PRUEFUNG; 50 = GEPRUEFT;
            					60 = DOKUMENT_ERSTELLT; 70 =
            					ALS_MAIL_ANGEBOTEN; 80 =
            					ALS_BRIEF_ANGEBOTEN; 90 = BEAUFTRAGT; 95
            					= BESTAETIGT; 100 =
            					IN_PROJEKT_UEBERFUEHRT; 110 =
            					ABGERECHNET; 200 = ABGELEHNT;
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bearbeiter" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="schlagworteFilter"
            			type="tns:SchlagworteFilterType" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>
            		<xsd:element name="suchbegriff" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Durch den in das Suchfeld eingebebenen
            					Text wird die Ergebnistabelle nach: Nr
            					Titel Schlagworte Bemerkungen
            					eingeschränkt. Verwenden Sie das
            					%-Zeichen als Platzhalter (wildcard).
            					D.h., mit % können Sie beliebige
            					Wörter/Buchstaben darstellen, die sich
            					zwischen Ihren Suchbegriffen befinden.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            <xsd:complexType name="ReadTerminSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="von" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate" maxOccurs="1" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadZahlungseingangSearchCriteriaType">
            	<xsd:sequence>
            		<xsd:element name="projektNrListe"
            			type="tns:ProjektNrListeType" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>
            		<xsd:element name="projektsabteilung"
            			type="tns:String32" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="inklProjektsunterabteilungen"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="von" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>


            		<xsd:element name="waehrung" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="inBasiswaehrungUmrechnen"
            			type="xsd:boolean" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					Default = true
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="kundenabteilung"
            			type="tns:String32" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="inklKundenunterabteilungen" type="xsd:boolean" maxOccurs="1" minOccurs="0"/>
            	</xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ReadFeiertagAusnahmeSearchCriteriaType">
                <xsd:sequence>
                	<xsd:element name="datum" type="tns:IsoDate"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="userId" type="tns:String32"
                		maxOccurs="1" minOccurs="0" />
                	<xsd:element name="name" type="tns:String128"
                		maxOccurs="1" minOccurs="0" />

                </xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="ReadFeiertagskalenderSearchCriteriaType">
                <xsd:sequence>
                	<xsd:element name="name" type="tns:String64" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="land" type="tns:String64" maxOccurs="1" minOccurs="0"/>
                	<xsd:element name="region" type="tns:String64" maxOccurs="1" minOccurs="0"/>
                </xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="AngebotListeType">
            	<xsd:sequence>
            		<xsd:element name="angebot" type="tns:AngebotType"
            			maxOccurs="unbounded" minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            
            <xsd:complexType name="AngebotType">
            	<xsd:sequence>
            		<xsd:element name="id" type="xsd:int" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>
            		<xsd:element name="angebotNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="titel" type="tns:String128"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="version" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="status" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bearbeiter" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="abteilung" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="projektNr" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="ticketNr" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="auftragsdatum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="gueltigBis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="betragNetto" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="waehrung" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bemerkung" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
                    <xsd:element name="auftragsWahrscheinlichkeitProzent" type="tns:int0_100" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="kategorieListe"
            			type="tns:KategorieListeType" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            <xsd:complexType name="TerminListeType">
            	<xsd:sequence>
            		<xsd:element name="termin" type="tns:TerminType"
            			maxOccurs="unbounded" minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"></xsd:attribute>
            </xsd:complexType>
            
            <xsd:complexType name="TerminType">
            	<xsd:sequence>
            		<xsd:element name="userId" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					userid des Eigentümers
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="titel" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="von" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>

            		<xsd:element name="ort" type="tns:String128"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="anzeigenAls" type="tns:int0_1"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					0 oder leer = als beschäftigt; 1 = als
            					verfügbar
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="sichtbarkeit" type="tns:String16"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					PUBLIC = öffentlich; CONFIDENTIAL = nur
            					Zeit und Datum; PRIVATE = privat;
            					Default ist PUBLIC.
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="projektNr" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="beschreibung" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="gaeste" type="tns:EmailListeType"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="wiederholung"
            			type="tns:TerminWiederholungType" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>

            	</xsd:sequence>
            </xsd:complexType>

            <xsd:complexType name="ZahlungseingangListeType">
            	<xsd:sequence>
            		<xsd:element name="zahlungseingang"
            			type="tns:ZahlungseingangType" maxOccurs="unbounded"
            			minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            <xsd:complexType name="FeiertagskalenderListeType">
            	<xsd:sequence>
            		<xsd:element name="feiertagskalender"
            			type="tns:StammdatenFeiertagskalenderType" maxOccurs="unbounded"
            			minOccurs="0">
            		</xsd:element>
                </xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>

            <xsd:complexType name="FeiertagAusnahmeListeType">
            	<xsd:sequence>
            		<xsd:element name="feiertagAusnahme"
            			type="tns:FeiertagAusnahmeType" maxOccurs="unbounded"
            			minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
                <xsd:attribute name="length" type="xsd:int"/>
            </xsd:complexType>
            <xsd:complexType name="FeiertagAusnahmeType">
            	<xsd:sequence>
            		<xsd:element name="datum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="userId" type="tns:String32" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="name" type="tns:String128" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="bezeichnungDe"
            			type="xsd:string" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bezeichnungEn"
            			type="xsd:string" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bezeichnungFr"
            			type="xsd:string" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="wertigkeit" type="xsd:int" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="zuschlag" type="xsd:int" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="zuschlagFolgetagBis"
            			type="tns:IsoTime" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="created"
            			type="tns:IsoDateTime" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"/>
            	</xsd:sequence>
            </xsd:complexType>
            <xsd:complexType name="StammdatenFeiertagskalenderType">
            	<xsd:sequence>

            		<xsd:element name="name" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="beschreibung" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="land" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="region" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="feiertagListe" type="tns:FeiertagListeType" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="created" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="modified" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            <xsd:complexType name="ZahlungseingangType">
            	<xsd:sequence>
            		<xsd:element name="rechnungNr" type="tns:String32"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="projektNr" type="tns:String64"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="kundenNr" type="tns:String32" maxOccurs="1" minOccurs="0"/>
            		<xsd:element name="rechnungsdatum"
            			type="tns:IsoDate" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="skontodatum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zahlungsziel" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="betragNetto" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="betragBrutto" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zahlungseingang"
            			type="tns:IsoDate" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zahlung" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="minderung" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="mwst" type="xsd:float"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bemerkung" type="xsd:string"
            			maxOccurs="1" minOccurs="0" />
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="TerminWiederholungType">
            	<xsd:sequence>
            		<xsd:element name="taeglich" type="tns:TaeglichType"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					1=täglich; 2=wochentags; 3=wöchentlich;
            					4=monatlich; 5=jährlich
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>

            		<xsd:element name="woechentlich"
            			type="tns:WoechentlichType" maxOccurs="1"
            			minOccurs="0">
            		</xsd:element>
            		<xsd:element name="monatlich"
            			type="tns:MonatlichType" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="jaehrlich" type="tns:JaehrlichType" maxOccurs="1" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="TaeglichType">
            	<xsd:sequence>
            		<xsd:element name="endetNach" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Endet nach x Ereignisse.</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben (nicht beide).</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="alleBestimmteTage" type="xsd:int" maxOccurs="1" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            
            <xsd:complexType name="WoechentlichType">
            	<xsd:sequence>
            		<xsd:element name="endetNach" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Endet nach x Ereignisse.</xsd:documentation></xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben (nicht beide).</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="alleBestimmteWochen" type="xsd:int" maxOccurs="1" minOccurs="0"></xsd:element>
            		<xsd:element name="wochentag" type="tns:Int1_7"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					1=Montag,..,7=Sonntag
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            <xsd:complexType name="MonatlichType">
            	<xsd:sequence>
            		<xsd:element name="endetNach" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Endet nach x Ereignisse.</xsd:documentation></xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben (nicht beide).</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="alleBestimmteMonate"
            			type="xsd:int" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="monatstag" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>1,...,28(,29,30,31)</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="wochentag" type="tns:Int1_7"
            			maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>
            					1=Montag,..,7=Sonntag
            				</xsd:documentation>
            			</xsd:annotation>
            		</xsd:element>
            		<xsd:element name="monatswoche" type="tns:Int1_5" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>1=die Erste;
2=die Zweite;
3=die Dritte;
4=die Vierte;
5= die Letzte.</xsd:documentation>
            			</xsd:annotation></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
            
            <xsd:complexType name="JaehrlichType">
            	<xsd:sequence>
            		<xsd:element name="endetNach" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Endet nach x Ereignisse.</xsd:documentation></xsd:annotation>
            		</xsd:element>
            		<xsd:element name="bis" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben (nicht beide).</xsd:documentation>
                        </xsd:annotation>
            		</xsd:element>
            		<xsd:element name="alleBestimmteJahre"
            			type="xsd:int" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="monat" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="monatstag" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>1,...,28(,29,30,31)</xsd:documentation></xsd:annotation>
            		</xsd:element>
            		<xsd:element name="wochentag" type="tns:Int1_7"
            			maxOccurs="1" minOccurs="0">
                        <xsd:annotation>
                        	<xsd:documentation>1=Montag,..,7=Sonntag</xsd:documentation></xsd:annotation>
            		</xsd:element>
            		<xsd:element name="monatswoche" type="tns:Int1_5" maxOccurs="1" minOccurs="0">
            			<xsd:annotation>
            				<xsd:documentation>1=die Erste;
2=die Zweite;
3=die Dritte;
4=die Vierte;
5= die Letzte.</xsd:documentation>
            			</xsd:annotation></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
            <xsd:complexType name="EmailListeType">
            	<xsd:sequence>
            		<xsd:element name="email" type="tns:String64" maxOccurs="1" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        
        
            <xsd:simpleType name="Decimal2_4">
            	<xsd:restriction base="xsd:float">
            		<xsd:minInclusive value="0"></xsd:minInclusive>
            		<xsd:maxInclusive value="99.9999"></xsd:maxInclusive>
            	</xsd:restriction>
            </xsd:simpleType>
        
            <xsd:complexType name="FeiertagListeType">
            	<xsd:sequence>
            		<xsd:element name="feiertag" type="tns:FeiertagType"
            			maxOccurs="unbounded" minOccurs="0">
            		</xsd:element>
            	</xsd:sequence>
            	<xsd:attribute name="length" type="xsd:int"></xsd:attribute>
            </xsd:complexType>

            <xsd:complexType name="FeiertagType">
            	<xsd:sequence>
            		<xsd:element name="datum" type="tns:IsoDate"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="name" type="tns:String128"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bezeichnungDe" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bezeichnungEn" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="bezeichnungFr" type="xsd:string"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="wertigkeit" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="maxStunden" type="tns:Decimal8_10" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zuschlag" type="xsd:int"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="zuschlagFolgetagBis"
            			type="tns:IsoTime" maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="crerated" type="tns:IsoDateTime"
            			maxOccurs="1" minOccurs="0">
            		</xsd:element>
            		<xsd:element name="modified" type="tns:IsoDateTime" maxOccurs="1" minOccurs="0"></xsd:element>
            	</xsd:sequence>
            </xsd:complexType>
        </xsd:schema>
    </wsdl:types>
    <wsdl:message name="readProjektzeitenRequest">
        <wsdl:part name="readProjektzeitenRequest" element="tns:ReadProjektzeitenRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Projektzeiten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readProjektzeitenResponse">
        <wsdl:part name="readProjektzeitenResponse" element="tns:ReadProjektzeitenResponse">
            <wsdl:documentation>Die Response-Struktur mit der Liste der gelesenen Projektzeiten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readProjekteRequest">
        <wsdl:part name="readProjekteRequest" element="tns:ReadProjekteRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Projekten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readProjekteResponse">
        <wsdl:part name="readProjekteResponse" element="tns:ReadProjekteResponse">
            <wsdl:documentation>Die Response-Struktur mit der Liste der gelesenen Projekte
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="createTicketRequest">
        <wsdl:part name="createTicketRequest" element="tns:CreateTicketRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Tickets.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createTicketResponse">
        <wsdl:part name="createTicketResponse" element="tns:CreateTicketResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Ticket-Anlage
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="createProjektRequest">
        <wsdl:part name="createProjektRequest" element="tns:CreateProjektRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Projekts
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createProjektResponse">
        <wsdl:part name="createProjektResponse" element="tns:CreateProjektResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projekt-Anlage
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="createMitarbeiterRequest">
        <wsdl:part name="createMitarbeiterRequest" element="tns:CreateMitarbeiterRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Mitarbeiters
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createMitarbeiterResponse">
        <wsdl:part name="createMitarbeiterResponse" element="tns:CreateMitarbeiterResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Mitarbeiter-Anlage
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="createKundeRequest">
        <wsdl:part name="createKundeRequest" element="tns:CreateKundeRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Kunden
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createKundeResponse">
        <wsdl:part name="createKundeResponse" element="tns:CreateKundeResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Kunden-Anlage
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="updateTicketRequest">
        <wsdl:part name="updateTicketRequest" element="tns:UpdateTicketRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung eines Tickets
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateTicketResponse">
        <wsdl:part name="updateTicketResponse" element="tns:UpdateTicketResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Ticket-Aktualisierung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="readTicketRequest">
        <wsdl:part name="readTicketRequest" element="tns:ReadTicketRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Tickets
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTicketResponse">
        <wsdl:part name="readTicketResponse" element="tns:ReadTicketResponse">
            <wsdl:documentation>Die Response-Struktur mit der Liste der gelesenen Tickets
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="updateProjektRequest">
        <wsdl:part name="updateProjektRequest" element="tns:UpdateProjektRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung eines Projektes
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateProjektResponse">
        <wsdl:part name="updateProjektResponse" element="tns:UpdateProjektResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projektz-Aktualisierung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="updateKundeRequest">
        <wsdl:part name="updateKundeRequest" element="tns:UpdateKundeRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung eines Kunden
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateKundeResponse">
        <wsdl:part name="updateKundeResponse" element="tns:UpdateKundeResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Kunden-Aktualisierung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="updateMitarbeiterRequest">
        <wsdl:part name="updateMitarbeiterRequest" element="tns:UpdateMitarbeiterRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung eines Mitarbeiters.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateMitarbeiterResponse">
        <wsdl:part name="updateMitarbeiterResponse" element="tns:UpdateMitarbeiterResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Mitarbeiter-Aktualisierung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="readKundeRequest">
        <wsdl:part name="readKundeRequest" element="tns:ReadKundeRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Kunden.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKundeResponse">
        <wsdl:part name="readKundeResponse" element="tns:ReadKundeResponse">
            <wsdl:documentation>Die Response-Struktur mit der Liste der gelesenen Kunden
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="readMitarbeiterRequest">
        <wsdl:part name="readMitarbeiterRequest" element="tns:ReadMitarbeiterRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Mitarbeitern
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readMitarbeiterResponse">
        <wsdl:part name="readMitarbeiterResponse" element="tns:ReadMitarbeiterResponse">
            <wsdl:documentation>Die Response-Struktur mit der Liste der gelesenen Mitarbeiter.
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="createProjektzeitRequest">
        <wsdl:part name="createProjektzeitRequest" element="tns:CreateProjektzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage einer Projektzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createProjektzeitResponse">
        <wsdl:part name="createProjektzeitResponse" element="tns:CreateProjektzeitResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projektzeit-Anlage
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="updateProjektzeitRequest">
        <wsdl:part name="updateProjektzeitRequest" element="tns:UpdateProjektzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung einer Projektzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateProjektzeitResponse">
        <wsdl:part name="updateProjektzeitResponse" element="tns:UpdateProjektzeitResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projektzeit-Aktualisierung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="deleteProjektzeitRequest">
        <wsdl:part name="deleteProjektzeitRequest" element="tns:DeleteProjektzeitRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen einer Zeitbuchung
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteProjektzeitResponse">
        <wsdl:part name="deleteProjektzeitResponse" element="tns:DeleteProjektzeitResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projektzeit-Löschung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="deleteProjektRequest">
        <wsdl:part name="deleteProjektRequest" element="tns:DeleteProjektRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Projektes.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteProjektResponse">
        <wsdl:part name="deleteProjektResponse" element="tns:DeleteProjektResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Projekt-Löschung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="deleteKundeRequest">
        <wsdl:part name="deleteKundeRequest" element="tns:DeleteKundeResquest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Kunden.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteKundeResponse">
        <wsdl:part name="deleteKundeResponse" element="tns:DeleteKundeResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Kunden-Löschung.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteMitarbeiterRequest">
        <wsdl:part name="deleteMitarbeiterRequest" element="tns:DeleteMitarbeiterRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Mitarbeiters.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteMitarbeiterResponse">
        <wsdl:part name="deleteMitarbeiterResponse" element="tns:DeleteMitarbeiterResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Mitarbeiter-Löschung
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="deleteTicketRequest">
        <wsdl:part name="deleteTicketRequest" element="tns:DeleteTicketRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Tickets.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteTicketResponse">
        <wsdl:part name="deleteTicketResponse" element="tns:DeleteTicketResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Ticket-Löschung.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKostenDatevRequest">
        <wsdl:part name="readKostenDatevRequest" element="tns:ReadKostenDatevRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage des DATEV Kostenexports.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKostenDatevResponse">
        <wsdl:part name="readKostenDatevResponse" element="tns:ReadKostenDatevResponse">
            <wsdl:documentation>Die Response-Struktur mit den Daten des DATEV Kostenexports.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKostenLexwareRequest">
        <wsdl:part name="readKostenLexwareRequest" element="tns:ReadKostenLexwareRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage des Lexware Kostenexports
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKostenLexwareResponse">
        <wsdl:part name="readKostenLexwareResponse" element="tns:ReadKostenLexwareResponse"/>
    </wsdl:message>
    <wsdl:message name="readKostenGenericRequest">
        <wsdl:part name="readKostenGenericRequest" element="tns:ReadKostenGenericRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage des Kostenexports im generischen Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKostenGenericResponse">
        <wsdl:part name="readKostenGenericResponse" element="tns:ReadKostenGenericResponse">
            <wsdl:documentation>Die Response-Struktur zur Abfrage des Kostenexports im generischen Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungDatevRequest">
        <wsdl:part name="readRechnungDatevRequest" element="tns:ReadRechnungDatevRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Rechnungen im DATEV Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungDatevResponse">
        <wsdl:part name="readRechnungDatevResponse" element="tns:ReadRechnungDatevResponse">
            <wsdl:documentation>Die Response-Struktur mit den Daten des Rechnungsexports im DATEV Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungLexwareRequest">
        <wsdl:part name="readRechnungLexwareRequest" element="tns:ReadRechnungLexwareRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Rechnungen im Lexware Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungLexwareResponse">
        <wsdl:part name="readRechnungLexwareResponse" element="tns:ReadRechnungLexwareResponse">
            <wsdl:documentation>Die Response-Struktur mit den Daten des Rechnungsexports im Lexware Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungGenericRequest">
        <wsdl:part name="readRechnungGenericRequest" element="tns:ReadRechnungGenericRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Rechnungen im generischen Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungGenericResponse">
        <wsdl:part name="readRechnungGenericResponse" element="tns:ReadRechnungGenericResponse">
            <wsdl:documentation>Die Response-Struktur mit den Daten des Rechnungsexports im generischen Format
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegartRequest">
        <wsdl:part name="readBelegartRequest" element="tns:ReadBelegartRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Belegarten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegartResponse">
        <wsdl:part name="readBelegartResponse" element="tns:ReadBelegartResponse">
            <wsdl:documentation>Die Response-Struktur mit den Belegarten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readZahlungsartRequest">
        <wsdl:part name="readZahlungsartRequest" element="tns:ReadZahlungsartRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Zahlungsarten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readZahlungsartResponse">
        <wsdl:part name="readZahlungsartResponse" element="tns:ReadZahlungsartResponse">
            <wsdl:documentation>Die Response-Struktur mit den Zahlungsarten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readWechselkursRequest">
        <wsdl:part name="readWechselkursRequest" element="tns:ReadWechselkursRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Wechselkursen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readWechselkursResponse">
        <wsdl:part name="readWechselkursResponse" element="tns:ReadWechselkursResponse">
            <wsdl:documentation>Die Response-Struktur mit den Wechselkursen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readSteuersatzRequest">
        <wsdl:part name="readSteuersatzRequest" element="tns:ReadSteuersatzRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Steuersätzen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readSteuersatzResponse">
        <wsdl:part name="readSteuersatzResponse" element="tns:ReadSteuersatzResponse">
            <wsdl:documentation>Die Response-Struktur mit den Steuersätzen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegRequest">
        <wsdl:part name="readBelegRequest" element="tns:ReadBelegRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Belegen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegResponse">
        <wsdl:part name="readBelegResponse" element="tns:ReadBelegResponse">
            <wsdl:documentation>Die Response-Struktur mit den Belegen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegAnhangRequest">
        <wsdl:part name="readBelegAnhangRequest" element="tns:ReadBelegAnhangRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Beleg-Anhaengen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readBelegAnhangResponse">
        <wsdl:part name="readBelegAnhangResponse" element="tns:ReadBelegAnhangResponse">
            <wsdl:documentation>Die Response-Struktur mit den Beleg-Anhängen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readErloeskontoRequest">
        <wsdl:part name="readErloeskontoRequest" element="tns:ReadErloeskontoRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Erlöskonten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readErloeskontoResponse">
        <wsdl:part name="readErloeskontoResponse" element="tns:ReadErloeskontoResponse">
            <wsdl:documentation>Die Response-Struktur mit den Erlöskonten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readFehlzeitRequest">
        <wsdl:part name="readFehlzeitRequest" element="tns:ReadFehlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Fehlzeiten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readFehlzeitResponse">
        <wsdl:part name="readFehlzeitResponse" element="tns:ReadFehlzeitResponse">
            <wsdl:documentation>Die Response-Struktur mit den Fehlzeiten
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readFehlgrundRequest">
        <wsdl:part name="readFehlgrundRequest" element="tns:ReadFehlgrundRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Fehlgründen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readFehlgrundResponse">
        <wsdl:part name="readFehlgrundResponse" element="tns:ReadFehlgrundResponse">
            <wsdl:documentation>Die Response-Struktur mit den Fehlgründen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readAbteilungRequest">
        <wsdl:part name="readAbteilungRequest" element="tns:ReadAbteilungRequest">
            <wsdl:documentation>Die Request-Struktur zur Abfrage von Abteilugen
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readAbteilungResponse">
        <wsdl:part name="readAbteilungResponse" element="tns:ReadAbteilungResponse"/>
    </wsdl:message>
    <wsdl:message name="createBelegRequest">
        <wsdl:part name="createBelegRequest" element="tns:CreateBelegRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Beleges.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createBelegResponse">
        <wsdl:part name="createBelegResponse" element="tns:CreateBelegResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Beleg-Anlage
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createRechnungspositionFestpreisRequest">
        <wsdl:part name="createRechnungspositionFestpreisRequest" element="tns:CreateRechnungspositionFestpreisRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Festpreis-Rechnungsposition.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createRechnungspositionFestpreisResponse">
        <wsdl:part name="createRechnungspositionFestpreisResponse" element="tns:CreateRechnungspositionFestpreisResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Rechnungsposition-Anlage
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createFehlzeitRequest">
        <wsdl:part name="createFehlzeitRequest" element="tns:CreateFehlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage einer Fehlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createFehlzeitResponse">
        <wsdl:part name="createFehlzeitResponse" element="tns:CreateFehlzeitResponse"/>
    </wsdl:message>
    <wsdl:message name="updateFehlzeitRequest">
        <wsdl:part name="updateFehlzeitRequest" element="tns:UpdateFehlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung einer Fehlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateFehlzeitResponse">
        <wsdl:part name="updateFehlzeitResponse" element="tns:UpdateFehlzeitResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteFehlzeitRequest">
        <wsdl:part name="deleteFehlzeitRequest" element="tns:DeleteFehlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen einer Fehlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteFehlzeitResponse">
        <wsdl:part name="deleteFehlzeitResponse" element="tns:DeleteFehlzeitResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Fehlzeit-Löschung.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateBelegRequest">
        <wsdl:part name="updateBelegRequest" element="tns:UpdateBelegRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung eines Beleges.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateBelegResponse">
        <wsdl:part name="updateBelegResponse" element="tns:UpdateBelegResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Beleg-Aktualisierung.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteBelegRequest">
        <wsdl:part name="deleteBelegRequest" element="tns:DeleteBelegRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Beleges.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteBelegResponse">
        <wsdl:part name="deleteBelegResponse" element="tns:DeleteBelegResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Beleg-Löschung.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createTeilaufgabeRequest">
        <wsdl:part name="createTeilaufgabeRequest" element="tns:CreateTeilaufgabeRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createTeilaufgabeResponse">
        <wsdl:part name="createTeilaufgabeResponse" element="tns:CreateTeilaufgabeResponse">
            <wsdl:documentation>Die Response-Struktur de Anlage einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateTeilaufgabeRequest">
        <wsdl:part name="updateTeilaufgabeRequest" element="tns:UpdateTeilaufgabeRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierung einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateTeilaufgabeResponse">
        <wsdl:part name="updateTeilaufgabeResponse" element="tns:UpdateTeilaufgabeResponse">
            <wsdl:documentation>Die Response-Struktur de Aktualisierung einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteTeilaufgabeRequest">
        <wsdl:part name="deleteTeilaufgabeRequest" element="tns:DeleteTeilaufgabeRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteTeilaufgabeResponse">
        <wsdl:part name="deleteTeilaufgabeResponse" element="tns:DeleteTeilaufgabeResponse">
            <wsdl:documentation>Die Response-Struktur des Löschen einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTeilaufgabeRequest">
        <wsdl:part name="readTeilaufgabeRequest" element="tns:ReadTeilaufgabeRequest">
            <wsdl:documentation>Die Request-Struktur zum Lese einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTeilaufgabeResponse">
        <wsdl:part name="readTeilaufgabeResponse" element="tns:ReadTeilaufgabeResponse">
            <wsdl:documentation>Die Response-Struktur des Lesens einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTeilaufgabeHistoryRequest">
        <wsdl:part name="readTeilaufgabeHistoryRequest" element="tns:ReadTeilaufgabeHistoryRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen der Historie einer Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTeilaufgabeHistoryResponse">
        <wsdl:part name="readTeilaufgabeHistoryResponse" element="tns:ReadTeilaufgabeHistoryResponse">
            <wsdl:documentation>Die Response-Struktur mit der Histore der Teilaufgabe.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTicketHistoryRequest">
        <wsdl:part name="readTicketHistoryRequest" element="tns:ReadTicketHistoryRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen der Historie einer Tickets.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTicketHistoryResponse">
        <wsdl:part name="readTicketHistoryResponse" element="tns:ReadTicketHistoryResponse">
            <wsdl:documentation>Die Response-Struktur mit der Histore der Tickets.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTicketStatusRequest">
        <wsdl:documentation>Abfrage der Ticket-Status Definitionen aus den Stammdaten.
        </wsdl:documentation>
        <wsdl:part name="readTicketStatusRequest" element="tns:ReadTicketStatusRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen der Ticket-Status aus den Stammdaten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTicketStatusResponse">
        <wsdl:documentation>Die Definition eines Ticket-Status aus den Stammdaten
        </wsdl:documentation>
        <wsdl:part name="readTicketStatusResponse" element="tns:ReadTicketStatusResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Ticket-Status aus den Stammdaten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readAbgeglicheneZeitenRequest">
        <wsdl:part name="readAbgeglicheneZeitenRequest" element="tns:ReadAbgeglicheneZeitenRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von abgeglichenen Zeiten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readAbgeglicheneZeitenResponse">
        <wsdl:part name="readAbgeglicheneZeitenResponse" element="tns:ReadAbgeglicheneZeitenResponse">
            <wsdl:documentation>Die Response-Struktur zum Lesen von abgeglichenen Zeiten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateAbgeglicheneZeitenRequest">
        <wsdl:part name="updateAbgeglicheneZeitenRequest" element="tns:UpdateAbgeglicheneZeitenRequest">
            <wsdl:documentation>Die Request-Struktur zum Aktualisieren von abgeglichenen Zeiten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateAbgeglicheneZeitenResponse">
        <wsdl:part name="updateAbgeglicheneZeitenResponse" element="tns:UpdateAbgeglicheneZeitenResponse">
            <wsdl:documentation>Die Response-Struktur zum Aktualisieren von abgeglichenen Zeiten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readTagessatzanteileRequest">
        <wsdl:part name="readTagessatzanteileRequest" element="tns:ReadTagessatzanteileRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von Tagessatzanteilen.
            </wsdl:documentation>
        </wsdl:part>

    </wsdl:message>
    <wsdl:message name="readTagessatzanteileResponse">
        <wsdl:part name="readTagessatzanteileResponse" element="tns:ReadTagessatzanteileResponse">
            <wsdl:documentation>Die Response-Struktur zum Lesen von Tagessatzanteilen.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungspositionFestpreisRequest">
        <wsdl:part name="readRechnungspositionFestpreisRequest" element="tns:ReadRechnungspositionFestpreisRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von Festpreis-Rechnungspositionen.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungspositionFestpreisResponse">
        <wsdl:part name="readRechnungspositionFestpreisResponse" element="tns:ReadRechnungspositionFestpreisResponse">
            <wsdl:documentation>Die Response-Struktur mit den gelesenen FestpreisRechnungspositionen.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungspositionRequest">
        <wsdl:part name="readRechnungspositionRequest" element="tns:ReadRechnungspositionRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von Rechnungspositionen.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readRechnungspositionResponse">
        <wsdl:part name="readRechnungspositionResponse" element="tns:ReadRechnungspositionResponse">
            <wsdl:documentation>Die Response-Struktur mit den gelesenen Rechnungspositionen.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readMahlzeitRequest">
        <wsdl:part name="readMahlzeitRequest" element="tns:ReadMahlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von Mahlzeiten.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readMahlzeitResponse">
        <wsdl:part name="readMahlzeitResponse" element="tns:ReadMahlzeitResponse"/>
    </wsdl:message>
    <wsdl:message name="createMahlzeitRequest">
        <wsdl:part name="createMahlzeitRequest" element="tns:CreateMahlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage einer Mahlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createMahlzeitResponse">
        <wsdl:part name="createMahlzeitResponse" element="tns:CreateMahlzeitResponse">
            <wsdl:documentation>Die Antwort zur Anlage einer Mahlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateMahlzeitRequest">
        <wsdl:part name="updateMahlzeitRequest" element="tns:UpdateMahlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zur Aktualisierun einer Mahlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateMahlzeitResponse">
        <wsdl:part name="updateMahlzeitResponse" element="tns:UpdateMahlzeitResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteMahlzeitRequest">
        <wsdl:part name="deleteMahlzeitRequest" element="tns:DeleteMahlzeitRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen einer Mahlzeit.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteMahlzeitResponse">
        <wsdl:part name="deleteMahlzeitRespponse" element="tns:DeleteMahlzeitResponse">
            <wsdl:documentation>Die Antwort-Struktur mit dem Ergebnis des Löschens.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readArtikelRequest">
        <wsdl:part name="readArtikelRequest" element="tns:ReadArtikelRequest">
            <wsdl:documentation>Die Request-Struktur zum Lesen von Artikeln
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readArtikelResponse">
        <wsdl:part name="readArtikelResponse" element="tns:ReadArtikelResponse">
            <wsdl:documentation>Die Response-Struktur mit den gelesenen Artikeln.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createArtikelRequest">
        <wsdl:part name="createArtikelRequest" element="tns:CreateArtikelRequest">
            <wsdl:documentation>Die Request-Struktur zum Erstellen eines Artikels
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createArtikelResponse">
        <wsdl:part name="createArtikelResponse" element="tns:CreateArtikelResponse">
            <wsdl:documentation>Die Response-Struktur bei Erstellung eines Artikels
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateArtikelRequest">
        <wsdl:part name="updateArtikelRequest" element="tns:UpdateArtikelRequest">
            <wsdl:documentation>Die Request-Struktur zum Aktualisieren eines Artikels
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="updateArtikelResponse">
        <wsdl:part name="updateArtikelResponse" element="tns:UpdateArtikelResponse">
            <wsdl:documentation>Die Response-Struktur der Aktualisierung eines Artikels
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteArtikelRequest">
        <wsdl:part name="deleteArtikelRequest" element="tns:DeleteArtikelRequest">
            <wsdl:documentation>Die Request-Struktur zum Löschen eines Artikels
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="deleteArtikelResponse">
        <wsdl:part name="deleteArtikelResponse" element="tns:DeleteArtikelResponse">
            <wsdl:documentation>Die Response-Struktur des Löschens eines Artikels.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="readKategorieRequest">
        <wsdl:part name="readKategorieRequest" element="tns:ReadKategorieRequest"/>
    </wsdl:message>
    <wsdl:message name="readKategorieResponse">
        <wsdl:part name="readKategorieResponse" element="tns:ReadKategorieResponse"/>
    </wsdl:message>
    <wsdl:message name="readSchlagworteRequest">
        <wsdl:part name="readSchlagworteRequest" element="tns:ReadSchlagworteRequest"/>
    </wsdl:message>
    <wsdl:message name="readSchlagworteResponse">
        <wsdl:part name="readSchlagworteResponse" element="tns:ReadSchlagworteResponse"/>
    </wsdl:message>
    <wsdl:message name="createMassenRequest">
        <wsdl:part name="createMassenRequest" element="tns:CreateMassenRequest"/>
    </wsdl:message>
    <wsdl:message name="createMassenResponse">
        <wsdl:part name="createMassenResponse" element="tns:CreateMassenResponse"/>
    </wsdl:message>
    <wsdl:message name="readEinplanungRequest">
        <wsdl:part name="readEinplanungRequest" element="tns:ReadEinplanungRequest"/>
    </wsdl:message>
    <wsdl:message name="readEinplanungResponse">
        <wsdl:part name="readEinplanungResponse" element="tns:ReadEinplanungResponse"/>
    </wsdl:message>
    <wsdl:message name="createEinplanungRequest">
        <wsdl:part name="createEinplanungRequest" element="tns:CreateEinplanungRequest"/>
    </wsdl:message>
    <wsdl:message name="createEinplanungResponse">
        <wsdl:part name="createEinplanungResponse" element="tns:CreateEinplanungResponse"/>
    </wsdl:message>
    <wsdl:message name="updateEinplanungRequest">
        <wsdl:part name="updateEinplanungRequest" element="tns:UpdateEinplanungRequest"/>
    </wsdl:message>
    <wsdl:message name="updateEinplanungResponse">
        <wsdl:part name="updateEinplanungResponse" element="tns:UpdateEinplanungResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteEinplanungRequest">
        <wsdl:part name="deleteEinplanungRequest" element="tns:DeleteEinplanungRequest"/>
    </wsdl:message>
    <wsdl:message name="deleteEinplanungResponse">
        <wsdl:part name="deleteEinplanungResponse" element="tns:DeleteEinplanungResponse"/>
    </wsdl:message>
    <wsdl:message name="readVorgangRequest">
        <wsdl:part name="readVorgangRequest" element="tns:ReadVorgangRequest"/>
    </wsdl:message>
    <wsdl:message name="readVorgangResponse">
        <wsdl:part name="readVorgangResponse" element="tns:ReadVorgangResponse"/>
    </wsdl:message>
    <wsdl:message name="createVorgangRequest">
        <wsdl:part name="createVorgangRequest" element="tns:CreateVorgangRequest"/>
    </wsdl:message>
    <wsdl:message name="createVorgangResponse">
        <wsdl:part name="createVorgangResponse" element="tns:CreateVorgangResponse"/>
    </wsdl:message>
    <wsdl:message name="updateVorgangRequest">
        <wsdl:part name="updateVorgangRequest" element="tns:UpdateVorgangRequest"/>
    </wsdl:message>
    <wsdl:message name="updateVorgangResponse">
        <wsdl:part name="updateVorgangResponse" element="tns:UpdateVorgangResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteVorgangRequest">
        <wsdl:part name="deleteVorgangRequest" element="tns:DeleteVorgangRequest"/>
    </wsdl:message>
    <wsdl:message name="deleteVorgangResponse">
        <wsdl:part name="deleteVorgangResponse" element="tns:DeleteVorgangResponse"/>
    </wsdl:message>
    <wsdl:message name="checkCreateUserRequest">
        <wsdl:part name="checkCreateUserRequest" element="tns:CheckCreateUserRequest"/>
    </wsdl:message>
    <wsdl:message name="checkCreateUserResponse">
        <wsdl:part name="checkCreateUserResponse" element="tns:CheckCreateUserResponse"/>
    </wsdl:message>
    <wsdl:message name="createAbteilungRequest">
        <wsdl:part name="createAbteilungRequest" element="tns:CreateAbteilungRequest"/>
    </wsdl:message>
    <wsdl:message name="createAbteilungResponse">
        <wsdl:part name="createAbteilungResponse" element="tns:CreateAbteilungResponse"/>
    </wsdl:message>
    <wsdl:message name="updateAbteilungRequest">
        <wsdl:part name="updateAbteilungRequest" element="tns:UpdateAbteilungRequest"/>
    </wsdl:message>
    <wsdl:message name="updateAbteilungResponse">
        <wsdl:part name="updateAbteilungResponse" element="tns:UpdateAbteilungResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteAbteilungRequest">
        <wsdl:part name="deleteAbteilungRequest" element="tns:DeleteAbteilungRequest"/>
    </wsdl:message>
    <wsdl:message name="deleteAbteilungResponse">
        <wsdl:part name="deleteAbteilungResponse" element="tns:DeleteAbteilungResponse"/>
    </wsdl:message>
    <wsdl:message name="filterProjekteRequest">
        <wsdl:part name="filterProjekteRequest" element="tns:FilterProjekteRequest"/>
    </wsdl:message>
    <wsdl:message name="filterProjekteResponse">
        <wsdl:part name="filterProjekteResponse" element="tns:FilterProjekteResponse"/>
    </wsdl:message>
    <wsdl:message name="getProjektRequest">
        <wsdl:part name="getProjektRequest" element="tns:GetProjektRequest"/>
    </wsdl:message>
    <wsdl:message name="getProjektResponse">
        <wsdl:part name="getProjektResponse" element="tns:GetProjektResponse"/>
    </wsdl:message>
    <wsdl:message name="readTaetigkeitRequest">
        <wsdl:part name="readTaetigkeitRequest" element="tns:ReadTaetigkeitRequest"/>
    </wsdl:message>
    <wsdl:message name="readTaetigkeitResponse">
        <wsdl:part name="readTaetigkeitResponse" element="tns:ReadTaetigkeitResponse"/>
    </wsdl:message>
    <wsdl:message name="readEinstellungenRequest">
        <wsdl:part name="readEinstellungenRequest" element="tns:ReadEinstellungenRequest"/>
    </wsdl:message>
    <wsdl:message name="readEinstellungenResponse">
        <wsdl:part name="readEinstellungenResponse" element="tns:ReadEinstellungenResponse"/>
    </wsdl:message>
    <wsdl:message name="readOrtslisteRequest">
        <wsdl:part name="readOrtslisteRequest" element="tns:ReadOrtslisteRequest"/>
    </wsdl:message>
    <wsdl:message name="readOrtslisteResponse">
        <wsdl:part name="readOrtslisteResponse" element="tns:ReadOrtslisteResponse"/>
    </wsdl:message>
    <wsdl:message name="readKommtGehtRequest">
        <wsdl:part name="readKommtGehtRequest" element="tns:ReadKommtGehtRequest"/>
    </wsdl:message>
    <wsdl:message name="readKommtGehtResponse">
        <wsdl:part name="readKommtGehtResponse" element="tns:ReadKommtGehtResponse"/>
    </wsdl:message>
    <wsdl:message name="readRechnungRequest">
        <wsdl:part name="readRechnungRequest" element="tns:ReadRechnungRequest"/>
    </wsdl:message>
    <wsdl:message name="readRechnungResponse">
        <wsdl:part name="readRechnungResponse" element="tns:ReadRechnungResponse"/>
    </wsdl:message>
    <wsdl:message name="readRfidChipsRequest">
        <wsdl:part name="readRfidChipsRequest" element="tns:ReadRfidChipsRequest"/>
    </wsdl:message>
    <wsdl:message name="readRfidChipsResponse">
        <wsdl:part name="readRfidChipsResponse" element="tns:ReadRfidChipsResponse"/>
    </wsdl:message>
    <wsdl:message name="createRfidChipRequest">
        <wsdl:part name="createRfidChipRequest" element="tns:CreateRfidChipRequest"/>
    </wsdl:message>
    <wsdl:message name="createRfidChipResponse">
        <wsdl:part name="createRfidChipResponse" element="tns:CreateRfidChipResponse"/>
    </wsdl:message>
    <wsdl:message name="updateRfidChipsRequest">
        <wsdl:part name="updateRfidChipsRequest" element="tns:UpdateRfidChipsRequest"/>
    </wsdl:message>
    <wsdl:message name="updateRfidChipsResponse">
        <wsdl:part name="updateRfidChipsResponse" element="tns:UpdateRfidChipsResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteRfidChipsRequest">
        <wsdl:part name="deleteRfidChipsRequest" element="tns:DeleteRfidChipsRequest"/>
    </wsdl:message>
    <wsdl:message name="deleteRfidChipsResponse">
        <wsdl:part name="deleteRfidChipsResponse" element="tns:DeleteRfidChipsResponse"/>
    </wsdl:message>
    <wsdl:message name="readGeraetRequest">
        <wsdl:part name="readGeraetRequest" element="tns:ReadGeraetRequest"/>
    </wsdl:message>
    <wsdl:message name="readGeraetResponse">
        <wsdl:part name="readGeraetResponse" element="tns:ReadGeraetResponse"/>
    </wsdl:message>
    <wsdl:message name="updateGeraetRequest">
        <wsdl:part name="updateGeraetRequest" element="tns:UpdateGeraetRequest"/>
    </wsdl:message>
    <wsdl:message name="updateGeraetResponse">
        <wsdl:part name="updateGeraetResponse" element="tns:UpdateGeraetResponse"/>
    </wsdl:message>
    <wsdl:message name="deleteGeraetRequest">
        <wsdl:part name="deleteGeraetRequest" element="tns:DeleteGeraetRequest"/>
    </wsdl:message>
    <wsdl:message name="deleteGeraetResponse">
        <wsdl:part name="deleteGeraetResponse" element="tns:DeleteGeraetResponse"/>
    </wsdl:message>
    <wsdl:message name="createGeraetRequest">
        <wsdl:part name="createGeraetRequest" element="tns:CreateGeraetRequest"/>
    </wsdl:message>
    <wsdl:message name="createGeraetResponse">
        <wsdl:part name="createGeraetResponse" element="tns:CreateGeraetResponse"/>
    </wsdl:message>
    <wsdl:message name="readPreisgruppeRequest">
        <wsdl:part name="readPreisgruppeRequest" element="tns:ReadPreisgruppeRequest"/>
    </wsdl:message>
    <wsdl:message name="readPreisgruppeResponse">
        <wsdl:part name="readPreisgruppeResponse" element="tns:ReadPreisgruppeResponse"/>
    </wsdl:message>
        <wsdl:message name="createPreisgruppeRequest">
        <wsdl:part name="createPreisgruppeRequest" element="tns:CreatePreisgruppeRequest"/>
    </wsdl:message>
    <wsdl:message name="createPreisgruppeResponse">
        <wsdl:part name="createPreisgruppeResponse" element="tns:CreatePreisgruppeResponse"/>
    </wsdl:message>
        <wsdl:message name="updatePreisgruppeRequest">
        <wsdl:part name="updatePreisgruppeRequest" element="tns:UpdatePreisgruppeRequest"/>
    </wsdl:message>
    <wsdl:message name="updatePreisgruppeResponse">
        <wsdl:part name="updatePreisgruppeResponse" element="tns:UpdatePreisgruppeResponse"/>
    </wsdl:message>
    <wsdl:message name="deletePreisgruppeRequest">
        <wsdl:part name="deletePreisgruppeRequest" element="tns:DeletePreisgruppeRequest"/>
    </wsdl:message>
    <wsdl:message name="deletePreisgruppeResponse">
        <wsdl:part name="deletePreisgruppeResponse" element="tns:DeletePreisgruppeResponse"/>
    </wsdl:message>
    <wsdl:message name="readAngebotRequest">
        <wsdl:part name="readAngebotRequest" element="tns:ReadAngebotRequest"/>
    </wsdl:message>
    <wsdl:message name="readAngebotResponse">
        <wsdl:part name="readAngebotResponse" element="tns:ReadAngebotResponse"/>
    </wsdl:message>
    <wsdl:message name="readTerminRequest">
        <wsdl:part name="readTerminRequest" element="tns:ReadTerminRequest"/>
    </wsdl:message>
    <wsdl:message name="readTerminResponse">
        <wsdl:part name="readTerminResponse" element="tns:ReadTerminResponse"/>
    </wsdl:message>
    <wsdl:message name="readZahlungseingangRequest">
        <wsdl:part name="readZahlungseingangRequest" element="tns:ReadZahlungseingangRequest"/>
    </wsdl:message>
    <wsdl:message name="readZahlungseingangResponse">
        <wsdl:part name="readZahlungseingangResponse" element="tns:ReadZahlungseingangResponse"/>
    </wsdl:message>

    <wsdl:message name="readFeiertagskalenderRequest">
        <wsdl:part name="readFeiertagskalenderRequest" element="tns:ReadFeiertagskalenderRequest"/>
    </wsdl:message>
    <wsdl:message name="readFeiertagskalenderResponse">
        <wsdl:part name="readFeiertagskalenderResponse" element="tns:ReadFeiertagskalenderResponse"/>
    </wsdl:message>
    <wsdl:message name="readFeiertagAusnahmeRequest">
        <wsdl:part name="readFeiertagAusnahmeRequest" element="tns:ReadFeiertagAusnahmeRequest"/>
    </wsdl:message>
    <wsdl:message name="readFeiertagAusnahmeResponse">
        <wsdl:part name="readFeiertagAusnahmeResponse" element="tns:ReadFeiertagAusnahmeResponse"/>
    </wsdl:message>

    <wsdl:message name="createArtikelRechnungspositionRequest">
        <wsdl:part name="createArtikelRechnungspositionRequest" element="tns:CreateArtikelRechnungspositionRequest">
            <wsdl:documentation>Die Request-Struktur zur Anlage eines Artikel-Rechnungsposition.
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:message name="createArtikelRechnungspositionResponse">
        <wsdl:part name="createArtikelRechnungspositionResponse" element="tns:CreateArtikelRechnungspositionResponse">
            <wsdl:documentation>Die Response-Struktur mit dem Resultat der Rechnungsposition-Anlage
            </wsdl:documentation>
        </wsdl:part>
    </wsdl:message>
    <wsdl:portType name="ZepSoapPortType">
        <wsdl:operation name="readProjektzeiten">
            <wsdl:documentation>Abfrage von Projektzeiten. Liefert eine Liste der Projektzeiten, die den Suchkriterien entsprechen.
            </wsdl:documentation>
            <wsdl:input message="tns:readProjektzeitenRequest">
                <wsdl:documentation>Parameter zur Spezifikation der zu lsenden Projektzeiten.
                </wsdl:documentation>
            </wsdl:input>
            <wsdl:output message="tns:readProjektzeitenResponse">
                <wsdl:documentation>Das Antwort-Objekt mit den gelesenen Projektzeiten.
                </wsdl:documentation>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readProjekte">
            <wsdl:documentation>Abfrage von Projekten. Liefert eine Liste der Projekte, die den Suchkriterien entsprechen.
            </wsdl:documentation>
            <wsdl:input message="tns:readProjekteRequest"/>
            <wsdl:output message="tns:readProjekteResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKunde">
            <wsdl:documentation>Abfrage von Kunden. Liefert eine Liste der Kunden, die den Suchkriterien entsprechen.
            </wsdl:documentation>
            <wsdl:input message="tns:readKundeRequest"/>
            <wsdl:output message="tns:readKundeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readMitarbeiter">
            <wsdl:documentation>Abfrage von Mitarbeitern. Liefert eine Liste der Mitarbeiter, die den Suchkriterien entsprechen.
            </wsdl:documentation>
            <wsdl:input message="tns:readMitarbeiterRequest"/>
            <wsdl:output message="tns:readMitarbeiterResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTicket">
            <wsdl:documentation>Abfrage von Tickets. Liefert eine Liste der Tickets, die den Suchkriterien entsprechen.
            </wsdl:documentation>
            <wsdl:input message="tns:readTicketRequest"/>
            <wsdl:output message="tns:readTicketResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKostenDatev">
            <wsdl:documentation>Abfrage des Kostenexports im DATEV Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readKostenDatevRequest"/>
            <wsdl:output message="tns:readKostenDatevResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKostenLexware">
            <wsdl:documentation>Abfrage des Kostenexports im Lexware Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readKostenLexwareRequest"/>
            <wsdl:output message="tns:readKostenLexwareResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKostenGeneric">
            <wsdl:documentation>Abfrage des Kostenexports im generischen Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readKostenGenericRequest"/>
            <wsdl:output message="tns:readKostenGenericResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnungDatev">
            <wsdl:documentation>Abfrage des Rechnungsexports im DATEV Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readRechnungDatevRequest"/>
            <wsdl:output message="tns:readRechnungDatevResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnungLexware">
            <wsdl:documentation>Abfrage des Rechnungsexports im Lexware Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readRechnungLexwareRequest"/>
            <wsdl:output message="tns:readRechnungLexwareResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnungGeneric">
            <wsdl:documentation>Abfrage des Rechnungsexports im generischen Format.
            </wsdl:documentation>
            <wsdl:input message="tns:readRechnungGenericRequest"/>
            <wsdl:output message="tns:readRechnungGenericResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readBelegart">
            <wsdl:documentation>Abfrage den in den Stammdatden definierten Belegarten.
            </wsdl:documentation>
            <wsdl:input message="tns:readBelegartRequest"/>
            <wsdl:output message="tns:readBelegartResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readZahlungsart">
            <wsdl:documentation>Abfrage den in den Stammdatden definierten Zahlungsarten.
            </wsdl:documentation>
            <wsdl:input message="tns:readZahlungsartRequest"/>
            <wsdl:output message="tns:readZahlungsartResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readWechselkurs">
            <wsdl:documentation>Abfrage den in den Stammdatden definierten Wechselkurse.
            </wsdl:documentation>
            <wsdl:input message="tns:readWechselkursRequest"/>
            <wsdl:output message="tns:readWechselkursResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readSteuersatz">
            <wsdl:documentation>Abfrage den in den Stammdatden definierten Steuersätze.
            </wsdl:documentation>
            <wsdl:input message="tns:readSteuersatzRequest"/>
            <wsdl:output message="tns:readSteuersatzResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readBeleg">
            <wsdl:documentation>Abfrage von Belegen. Beleganhänge müssen über den readBelegAnhang-Request gelesen werden.
            </wsdl:documentation>
            <wsdl:input message="tns:readBelegRequest"/>
            <wsdl:output message="tns:readBelegResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readBelegAnhang">
            <wsdl:documentation>Lesen von Beleganhängen. Beleganhänge werden von ZEP als PDF geliefert.
            </wsdl:documentation>
            <wsdl:input message="tns:readBelegAnhangRequest"/>
            <wsdl:output message="tns:readBelegAnhangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readErloeskonto">
            <wsdl:documentation>Abfrage von Erlöskonten.</wsdl:documentation>
            <wsdl:input message="tns:readErloeskontoRequest"/>
            <wsdl:output message="tns:readErloeskontoResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readFehlzeit">
            <wsdl:documentation>Abfrage von Fehlzeiten.</wsdl:documentation>
            <wsdl:input message="tns:readFehlzeitRequest"/>
            <wsdl:output message="tns:readFehlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readFehlgrund">
            <wsdl:documentation>Abfrage von Fehlgründen.</wsdl:documentation>
            <wsdl:input message="tns:readFehlgrundRequest"/>
            <wsdl:output message="tns:readFehlgrundResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readAbteilung">
            <wsdl:documentation>Abfrage von Abteilungen.</wsdl:documentation>
            <wsdl:input message="tns:readAbteilungRequest"/>
            <wsdl:output message="tns:readAbteilungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createProjektzeit">
            <wsdl:documentation>Anlage einer neuen Zeitbuchung.
            </wsdl:documentation>
            <wsdl:input message="tns:createProjektzeitRequest"/>
            <wsdl:output message="tns:createProjektzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createProjekt">
            <wsdl:documentation>Anlage eines neuen Projektes. Falls das Projekt bereits in ZEP existiert wird es nicht verändert.
            </wsdl:documentation>
            <wsdl:input message="tns:createProjektRequest"/>
            <wsdl:output message="tns:createProjektResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createKunde">
            <wsdl:documentation>Anlage eines neuen Kunden. Falls dieser bereits in ZEP existiert wird dieser nicht verändert.
            </wsdl:documentation>
            <wsdl:input message="tns:createKundeRequest">
                <wsdl:documentation>Die Daten zur Anlage des neuen Kunden.
                </wsdl:documentation>
            </wsdl:input>
            <wsdl:output message="tns:createKundeResponse">
                <wsdl:documentation>Das Antwort-Objekt.</wsdl:documentation>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createMitarbeiter">
            <wsdl:documentation>Anlage eines Mitarbeiters. Falls der Mitarbeiter bereits in ZEP existiert wird dieser nicht verändert.
            </wsdl:documentation>
            <wsdl:input message="tns:createMitarbeiterRequest">
                <wsdl:documentation>Die Daten des anzulegenden Mitarbeiters.
                </wsdl:documentation>
            </wsdl:input>
            <wsdl:output message="tns:createMitarbeiterResponse">
                <wsdl:documentation>Antwort mit Informationen zur Anlage vom Server.
                </wsdl:documentation>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createTicket">
            <wsdl:documentation>Anlage eines neuen Tickets.</wsdl:documentation>
            <wsdl:input message="tns:createTicketRequest"/>
            <wsdl:output message="tns:createTicketResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createBeleg">
            <wsdl:documentation>Anlage eines neuen Beleges.</wsdl:documentation>
            <wsdl:input message="tns:createBelegRequest"/>
            <wsdl:output message="tns:createBelegResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createRechnungspositionFestpreis">
            <wsdl:documentation>Anlage einer neuen Festpreis-Rechnungsposition.
            </wsdl:documentation>
            <wsdl:input message="tns:createRechnungspositionFestpreisRequest"/>
            <wsdl:output message="tns:createRechnungspositionFestpreisResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createFehlzeit">
            <wsdl:documentation>Anlage einer Fehlzeit.</wsdl:documentation>
            <wsdl:input message="tns:createFehlzeitRequest"/>
            <wsdl:output message="tns:createFehlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateProjektzeit">
            <wsdl:documentation>Aktualisierung einer bestehenden Zeitbuchung.
            </wsdl:documentation>
            <wsdl:input message="tns:updateProjektzeitRequest"/>
            <wsdl:output message="tns:updateProjektzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateProjekt">
            <wsdl:documentation>Aktualisierung eines bestehenden Projektes.
            </wsdl:documentation>
            <wsdl:input message="tns:updateProjektRequest"/>
            <wsdl:output message="tns:updateProjektResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateKunde">
            <wsdl:documentation>Aktualisierung eines bestehenden Kunden.
            </wsdl:documentation>
            <wsdl:input message="tns:updateKundeRequest"/>
            <wsdl:output message="tns:updateKundeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateMitarbeiter">
            <wsdl:documentation>Aktualisierung eines bestehenden Mitarbeiters.
            </wsdl:documentation>
            <wsdl:input message="tns:updateMitarbeiterRequest"/>
            <wsdl:output message="tns:updateMitarbeiterResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateTicket">
            <wsdl:documentation>Aktualisierung eines bestehenden Tickets.
            </wsdl:documentation>
            <wsdl:input message="tns:updateTicketRequest"/>
            <wsdl:output message="tns:updateTicketResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateBeleg">
            <wsdl:documentation>Aktualisierung der Daten eines Beleges.
            </wsdl:documentation>
            <wsdl:input message="tns:updateBelegRequest"/>
            <wsdl:output message="tns:updateBelegResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateFehlzeit">
            <wsdl:documentation>Aktualisierung einer Fehlzeit.
            </wsdl:documentation>
            <wsdl:input message="tns:updateFehlzeitRequest"/>
            <wsdl:output message="tns:updateFehlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteProjektzeit">
            <wsdl:documentation>Löschen einer bestehenden Zeitbuchung. Die Zeitbuchung kann nur gelöscht werden wenn dieses auch über die ZEP Oberfläche möglich wäre, d.h. alle notwendigen Bedingungen zum Löschen erfüllt sind, d.h. diese nicht gesperrt ist.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteProjektzeitRequest"/>
            <wsdl:output message="tns:deleteProjektzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteProjekt">
            <wsdl:documentation>Löschen eines bestehenden Projektes. Das Projekt kann nur gelöscht werden, wenn dieses auch über die ZEP Oberfläche möglich wäre, d.h. alle notwendigen Bedingungen zum Löschen erfüllt sind (z.B. keine Zeitbuchungen mehr für das Projekt bestehen.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteProjektRequest"/>
            <wsdl:output message="tns:deleteProjektResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteKunde">
            <wsdl:documentation>Löschen eines bestehenden Kunden. Der Kunde kann nur gelöscht werden wenn dieses auch über die ZEP Oberfläche möglich wäre, d.h. alle notwendigen Bedingungen zum Löschen erfüllt sind, d.h. er bspw. keine Projekte mehr hat.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteKundeRequest"/>
            <wsdl:output message="tns:deleteKundeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteMitarbeiter">
            <wsdl:documentation>Löschen eines bestehenden Mitarbeiters. Der Mitarbeiter kann nur gelöscht werden wenn dieses auch über die ZEP Oberfläche möglich wäre, d.h. alle notwendigen Bedingungen zum Löschen erfüllt sind.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteMitarbeiterRequest">
                <wsdl:documentation>Spezifiziert den zu löschenden Mitarbeiter.
                </wsdl:documentation>
            </wsdl:input>
            <wsdl:output message="tns:deleteMitarbeiterResponse">
                <wsdl:documentation>Antwort mit Informationen vom Server.
                </wsdl:documentation>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteTicket">
            <wsdl:documentation>Löschen eines Tickets.</wsdl:documentation>
            <wsdl:input message="tns:deleteTicketRequest"/>
            <wsdl:output message="tns:deleteTicketResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteBeleg">
            <wsdl:documentation>Löschen eines Beleges.</wsdl:documentation>
            <wsdl:input message="tns:deleteBelegRequest"/>
            <wsdl:output message="tns:deleteBelegResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteFehlzeit">
            <wsdl:documentation>Löschen einer Fehlzeit.</wsdl:documentation>
            <wsdl:input message="tns:deleteFehlzeitRequest"/>
            <wsdl:output message="tns:deleteFehlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createTeilaufgabe">
            <wsdl:documentation>Anlegen einer Teilaufgabe.</wsdl:documentation>
            <wsdl:input message="tns:createTeilaufgabeRequest"/>
            <wsdl:output message="tns:createTeilaufgabeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateTeilaufgabe">
            <wsdl:documentation>Aktualisierung einer Teilaufgabe.
            </wsdl:documentation>
            <wsdl:input message="tns:updateTeilaufgabeRequest"/>
            <wsdl:output message="tns:updateTeilaufgabeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteTeilaufgabe">
            <wsdl:documentation>Löschen einer Teilaufgabe.</wsdl:documentation>
            <wsdl:input message="tns:deleteTeilaufgabeRequest"/>
            <wsdl:output message="tns:deleteTeilaufgabeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTeilaufgabe">
            <wsdl:documentation>Lesen einer Teilaufgabe.</wsdl:documentation>
            <wsdl:input message="tns:readTeilaufgabeRequest"/>
            <wsdl:output message="tns:readTeilaufgabeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTeilaufgabeHistory">
            <wsdl:documentation>Lesen der Historie einer Teilaufgabe.
            </wsdl:documentation>
            <wsdl:input message="tns:readTeilaufgabeHistoryRequest"/>
            <wsdl:output message="tns:readTeilaufgabeHistoryResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTicketHistory">
            <wsdl:documentation>Lesen der Historie eines Tickets.
            </wsdl:documentation>
            <wsdl:input message="tns:readTicketHistoryRequest"/>
            <wsdl:output message="tns:readTicketHistoryResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTicketStatus">
            <wsdl:documentation>Abfrag der in den Stammdaten definierten Ticket-Status.
            </wsdl:documentation>
            <wsdl:input message="tns:readTicketStatusRequest"/>
            <wsdl:output message="tns:readTicketStatusResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readAbgeglicheneZeiten">
            <wsdl:documentation>Abfrage der abgeglichenen Stunden und Urlaubstagen.
            </wsdl:documentation>
            <wsdl:input message="tns:readAbgeglicheneZeitenRequest"/>
            <wsdl:output message="tns:readAbgeglicheneZeitenResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateAbgeglicheneZeiten">
            <wsdl:documentation>Update der abgegelichene Zeiten (Ueberstunden bzw. Urlaubstage) falls vorhanden, sonst wird neu angelegt wenn mindestens die abgeglicheneUeberstunden oder die abgeglicheneUrlaubstage nicht leer ist.
            </wsdl:documentation>
            <wsdl:input message="tns:updateAbgeglicheneZeitenRequest"/>
            <wsdl:output message="tns:updateAbgeglicheneZeitenResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTagessatzanteile">
            <wsdl:documentation>Lesen der Tagessatzanteile aus den Stammdaten.
            </wsdl:documentation>
            <wsdl:input message="tns:readTagessatzanteileRequest"/>
            <wsdl:output message="tns:readTagessatzanteileResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnungspositionFestpreis">
            <wsdl:documentation>Lesen von Festpreis-Rechnungspositionen.
            </wsdl:documentation>
            <wsdl:input message="tns:readRechnungspositionFestpreisRequest"/>
            <wsdl:output message="tns:readRechnungspositionFestpreisResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnungsposition">
            <wsdl:documentation>Lesen von Rechnungspositionen.
            </wsdl:documentation>
            <wsdl:input message="tns:readRechnungspositionRequest"/>
            <wsdl:output message="tns:readRechnungspositionResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readMahlzeit">
            <wsdl:documentation>Lesen des Mahlzeiten-Eintrags an einem Tag.
            </wsdl:documentation>
            <wsdl:input message="tns:readMahlzeitRequest"/>
            <wsdl:output message="tns:readMahlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createMahlzeit">
            <wsdl:documentation>Anlegen eines Mahlzeiten-Eintrags für einen Tag.
            </wsdl:documentation>
            <wsdl:input message="tns:createMahlzeitRequest"/>
            <wsdl:output message="tns:createMahlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateMahlzeit">
            <wsdl:documentation>Aktualisierung des Mahlzeiten-Eintrages an einem Tag.
            </wsdl:documentation>
            <wsdl:input message="tns:updateMahlzeitRequest"/>
            <wsdl:output message="tns:updateMahlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteMahlzeit">
            <wsdl:documentation>Methode zum Löschen der Mahlzeiten eines Tages.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteMahlzeitRequest"/>
            <wsdl:output message="tns:deleteMahlzeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readArtikel">
            <wsdl:documentation>Methode zum Lesen der Artikeln in Stammdaten.
            </wsdl:documentation>
            <wsdl:input message="tns:readArtikelRequest"/>
            <wsdl:output message="tns:readArtikelResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createArtikel">
            <wsdl:documentation>Methode zur Anlage eines Artikels in Stammdaten.
            </wsdl:documentation>
            <wsdl:input message="tns:createArtikelRequest"/>
            <wsdl:output message="tns:createArtikelResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateArtikel">
            <wsdl:documentation>Methode zum Aktualisieren der Artikeln in Stammdaten
            </wsdl:documentation>
            <wsdl:input message="tns:updateArtikelRequest"/>
            <wsdl:output message="tns:updateArtikelResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteArtikel">
            <wsdl:documentation>Methode zum Löschen von Artikeln aus den Stammdaten
            </wsdl:documentation>
            <wsdl:input message="tns:deleteArtikelRequest"/>
            <wsdl:output message="tns:deleteArtikelResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKategorie">
            <wsdl:documentation>Methode zum Lesen von Kategorien.
            </wsdl:documentation>
            <wsdl:input message="tns:readKategorieRequest"/>
            <wsdl:output message="tns:readKategorieResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readSchlagworte">
            <wsdl:documentation>Methode zum Lesen von Schlagworten.
            </wsdl:documentation>
            <wsdl:input message="tns:readSchlagworteRequest"/>
            <wsdl:output message="tns:readSchlagworteResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createMassen">
            <wsdl:documentation>Methode zur Massen-Anlage von Objekten.
            </wsdl:documentation>
            <wsdl:input message="tns:createMassenRequest"/>
            <wsdl:output message="tns:createMassenResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readEinplanung">
            <wsdl:documentation>Methode zum Lesen von Einplanungen.
            </wsdl:documentation>
            <wsdl:input message="tns:readEinplanungRequest"/>
            <wsdl:output message="tns:readEinplanungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createEinplanung">
            <wsdl:documentation>Methode zur Anlage einer Einplanung.
            </wsdl:documentation>
            <wsdl:input message="tns:createEinplanungRequest"/>
            <wsdl:output message="tns:createEinplanungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateEinplanung">
            <wsdl:documentation>Methode zur Aktualisierung einer Einplanung.
            </wsdl:documentation>
            <wsdl:input message="tns:updateEinplanungRequest"/>
            <wsdl:output message="tns:updateEinplanungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteEinplanung">
            <wsdl:documentation>Methode zum Löschen einer Einplanung.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteEinplanungRequest"/>
            <wsdl:output message="tns:deleteEinplanungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readVorgang">
            <wsdl:documentation>Methode zum Lesen eines Vorgangs.
            </wsdl:documentation>
            <wsdl:input message="tns:readVorgangRequest"/>
            <wsdl:output message="tns:readVorgangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createVorgang">
            <wsdl:documentation>Methode zur Anlage eines Vorgangs.
            </wsdl:documentation>
            <wsdl:input message="tns:createVorgangRequest"/>
            <wsdl:output message="tns:createVorgangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateVorgang">
            <wsdl:documentation>Methode zur Aktualisierung eines Vorgangs.
            </wsdl:documentation>
            <wsdl:input message="tns:updateVorgangRequest"/>
            <wsdl:output message="tns:updateVorgangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteVorgang">
            <wsdl:documentation>Methode zum Löschen eines Vorgangs.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteVorgangRequest"/>
            <wsdl:output message="tns:deleteVorgangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="checkCreateUser">
            <wsdl:documentation>Methode zur Prüfung, ob weitere User angelegt werden könnten.
            </wsdl:documentation>
            <wsdl:input message="tns:checkCreateUserRequest"/>
            <wsdl:output message="tns:checkCreateUserResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createAbteilung">
            <wsdl:documentation>Methode zur Anlage einer Abteilung.
            </wsdl:documentation>
            <wsdl:input message="tns:createAbteilungRequest"/>
            <wsdl:output message="tns:createAbteilungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateAbteilung">
            <wsdl:documentation>Methode zur Aktualisierung einer Abteilung.
            </wsdl:documentation>
            <wsdl:input message="tns:updateAbteilungRequest"/>
            <wsdl:output message="tns:updateAbteilungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteAbteilung">
            <wsdl:documentation>Methode zum Löschen einer Abteilung.
            </wsdl:documentation>
            <wsdl:input message="tns:deleteAbteilungRequest"/>
            <wsdl:output message="tns:deleteAbteilungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="filterProjekte">
            <wsdl:documentation>Diese Operation ist dafür gedacht alle gewünchte Projekte zu holene samt ihre Eigenschaften, und via getProjekt kann mann dann einen Projekt samt seine Zuordnungen abrufen. Dieses Verfahren ist sehr performanter als wenn mann über 500 Projekte direkt via readProjekte abruft.</wsdl:documentation>
            <wsdl:input message="tns:filterProjekteRequest"/>
            <wsdl:output message="tns:filterProjekteResponse"/>
        </wsdl:operation>
        <wsdl:operation name="getProjekt">
            <wsdl:documentation>Methode zum Lesen eines Projekts mit allen Daten.
            </wsdl:documentation>
            <wsdl:input message="tns:getProjektRequest"/>
            <wsdl:output message="tns:getProjektResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTaetigkeit">
            <wsdl:input message="tns:readTaetigkeitRequest"/>
            <wsdl:output message="tns:readTaetigkeitResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readEinstellungen">
            <wsdl:input message="tns:readEinstellungenRequest"/>
            <wsdl:output message="tns:readEinstellungenResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readOrtsliste">
            <wsdl:input message="tns:readOrtslisteRequest"/>
            <wsdl:output message="tns:readOrtslisteResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readKommtGeht">
            <wsdl:input message="tns:readKommtGehtRequest"/>
            <wsdl:output message="tns:readKommtGehtResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRechnung">
            <wsdl:input message="tns:readRechnungRequest"/>
            <wsdl:output message="tns:readRechnungResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readRfidChips">
            <wsdl:input message="tns:readRfidChipsRequest"/>
            <wsdl:output message="tns:readRfidChipsResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createRfidChip">
            <wsdl:input message="tns:createRfidChipRequest"/>
            <wsdl:output message="tns:createRfidChipResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateRfidChips">
            <wsdl:input message="tns:updateRfidChipsRequest"/>
            <wsdl:output message="tns:updateRfidChipsResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteRfidChips">
            <wsdl:input message="tns:deleteRfidChipsRequest"/>
            <wsdl:output message="tns:deleteRfidChipsResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readGeraet">
            <wsdl:input message="tns:readGeraetRequest"/>
            <wsdl:output message="tns:readGeraetResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updateGeraet">
            <wsdl:input message="tns:updateGeraetRequest"/>
            <wsdl:output message="tns:updateGeraetResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deleteGeraet">
            <wsdl:input message="tns:deleteGeraetRequest"/>
            <wsdl:output message="tns:deleteGeraetResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createGeraet">
            <wsdl:documentation>Nur die Apps können via SOAP angelegt werden. Ein neues ZEP Clock Terminal wird automatisch hinzugefügt, sobald Sie es in Betrieb nehmen.</wsdl:documentation>
            <wsdl:input message="tns:createGeraetRequest"/>
            <wsdl:output message="tns:createGeraetResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readPreisgruppe">
            <wsdl:input message="tns:readPreisgruppeRequest"/>
            <wsdl:output message="tns:readPreisgruppeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createPreisgruppe">
            <wsdl:input message="tns:createPreisgruppeRequest"/>
            <wsdl:output message="tns:createPreisgruppeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="updatePreisgruppe">
            <wsdl:input message="tns:updatePreisgruppeRequest"/>
            <wsdl:output message="tns:updatePreisgruppeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="deletePreisgruppe">
            <wsdl:input message="tns:deletePreisgruppeRequest"/>
            <wsdl:output message="tns:deletePreisgruppeResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readAngebot">
            <wsdl:input message="tns:readAngebotRequest"/>
            <wsdl:output message="tns:readAngebotResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readTermin">
            <wsdl:input message="tns:readTerminRequest"/>
            <wsdl:output message="tns:readTerminResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readZahlungseingang">
            <wsdl:input message="tns:readZahlungseingangRequest"/>
            <wsdl:output message="tns:readZahlungseingangResponse"/>
        </wsdl:operation>
        <wsdl:operation name="createArtikelRechnungsposition">
            <wsdl:documentation>Anlage einer neuen Artikel-Rechnungsposition.</wsdl:documentation>
            <wsdl:input message="tns:createArtikelRechnungspositionRequest"/>
            <wsdl:output message="tns:createArtikelRechnungspositionResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readFeiertagskalender">
            <wsdl:input message="tns:readFeiertagskalenderRequest"/>
            <wsdl:output message="tns:readFeiertagskalenderResponse"/>
        </wsdl:operation>
        <wsdl:operation name="readFeiertagAusnahme">
            <wsdl:input message="tns:readFeiertagAusnahmeRequest"/>
            <wsdl:output message="tns:readFeiertagAusnahmeResponse"/>
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="ZepSOAP" type="tns:ZepSoapPortType">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <wsdl:operation name="readProjektzeiten">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readProjekte">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createTicket">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createProjekt">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createMitarbeiter">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createKunde">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <wsdl:documentation>BBBBBB</wsdl:documentation>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <wsdl:documentation>BBBBBB</wsdl:documentation>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readFehlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createFehlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateFehlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteFehlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateTicket">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTicket">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateProjekt">
            <wsdl:documentation>Aktualisierung der Daten eines Projekts.
            </wsdl:documentation>
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateKunde">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateMitarbeiter">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKunde">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readMitarbeiter">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createProjektzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateProjektzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteProjektzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteMitarbeiter">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteTicket">
            <xsd:annotation>
                <xsd:documentation>
                    Löschen eines bestehenden Tickets. Das Ticket kann nur gelöscht werden wenn dieses auch über die ZEP Oberfläche möglich wäre, d.h. alle notwendigen Bedingungen zum Löschen erfüllt sind.
                </xsd:documentation>
            </xsd:annotation>
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteProjekt">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteKunde">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKostenDatev">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKostenLexware">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKostenGeneric">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnungDatev">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnungLexware">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnungGeneric">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readBelegart">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readZahlungsart">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readWechselkurs">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readSteuersatz">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readBeleg">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readBelegAnhang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readErloeskonto">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readFehlgrund">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="readAbteilung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="createBeleg">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createRechnungspositionFestpreis">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateBeleg">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>

        <wsdl:operation name="deleteBeleg">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createTeilaufgabe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateTeilaufgabe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteTeilaufgabe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTeilaufgabe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTeilaufgabeHistory">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTicketHistory">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTicketStatus">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readAbgeglicheneZeiten">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateAbgeglicheneZeiten">
            <wsdl:documentation>
                Update der abgegelichene Zeiten(Ueberstunden. bzw Urlaubstage) falls vorhanden, sonst wird neu angelegt wenn mindestens die abgeglicheneUeberstunden oder die abgeglicheneUrlaubstage nicht leer ist.
            </wsdl:documentation>
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTagessatzanteile">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnungspositionFestpreis">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnungsposition">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readMahlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteMahlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createMahlzeit">
            <wsdl:documentation>Anlage einer Mahlzeit</wsdl:documentation>
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateMahlzeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readArtikel">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createArtikel">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateArtikel">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteArtikel">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKategorie">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readSchlagworte">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createMassen">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readEinplanung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createEinplanung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateEinplanung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteEinplanung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readVorgang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createVorgang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateVorgang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteVorgang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="checkCreateUser">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createAbteilung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateAbteilung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteAbteilung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="filterProjekte">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="getProjekt">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTaetigkeit">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readEinstellungen">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readOrtsliste">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readKommtGeht">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRechnung">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readRfidChips">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createRfidChip">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateRfidChips">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteRfidChips">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readGeraet">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updateGeraet">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createGeraet">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deleteGeraet">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readPreisgruppe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createPreisgruppe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="updatePreisgruppe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="deletePreisgruppe">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readAngebot">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readTermin">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readZahlungseingang">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="createArtikelRechnungsposition">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readFeiertagskalender">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="readFeiertagAusnahme">
            <soap:operation soapAction=""/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:service name="ZepSoap">
        <wsdl:port binding="tns:ZepSOAP" name="ZepSOAP">
            <soap:address location="https://www.zep-online.de/zepadorsys/sync/soap.php?v=9"/>
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>