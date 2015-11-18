/**
 * The OrgProfile entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class OrgProfile {
    static mapping = {
         table 'org_profile'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'org_code', params:[sequence:'org_profile_sequence']
         id generator:'identity', column:'ORG_CODE'
        cName column: 'CNAME'
        cSpell column: 'CSPELL'
        csName column: 'CSNAME'
        eName column: 'ENAME'
        esName column: 'ESNAME'
        declareDate column: 'DECLAREDATE'
        parentCode column: 'PARENTCODE'
        layerCode column: 'LAYERCODE'
        montherCode column: 'MONTHER_CODE'
        montherName column: 'MONTHER_NAME'
        regtNo column: 'REGT_NO'
        staffnum column: 'STAFF_NUM'
        topCode column: 'TOPCODE'

    }
    Long orgCode
    Long version
    String boardSectry
    Long briefIntro
    Date buildDate
    String cName
    String cSpell
    String city
    Date closeDate
    String closeReason
    String contactAddr
    String contactPerson
    String csName
    Long curncy
    Date declareDate
    String disclPaper
    String disclWebsite
    String districtNo
    String eName
    String email
    String esName
    String fax
    String genManager
    String issueBond
    String layerCode
    String legPerson
    String listed
    String ltaxNo
    Long montherCode
    String montherName
    Long mstaffNum
    String nation
    Long nonPriBiz
    String ntaxNo
    String officeAddr
    Long orgForm
    String orgMtype
    Long orgStatus
    String orgStype
    Long parentCode
    String parentName
    String postcode
    Long priBiz
    String province
    String regiAddr
    String regiCap
    String region
    Long regionCode
    String regtNo
    String remark
    String repr
    String reprAddr
    String reprEmail
    String reprFax
    String reprTel
    String sectryEmail
    String sectryFax
    String sectryTel
    String serviceTel
    Long staffnum
    String tel
    Long topCode
    String topName
    Long tstaffNum
    String webSite

    static constraints = {
        orgCode(max: 9999999999L)
        version(max: 9223372036854775807L)
        boardSectry(size: 0..40)
        briefIntro(max: 9223372036854775807L)
        buildDate(nullable: true)
        cName(size: 0..200)
        cSpell(size: 0..20)
        city(size: 0..255)
        closeDate(nullable: true)
        closeReason(size: 0..400)
        contactAddr(size: 0..200)
        contactPerson(size: 0..60)
        csName(size: 0..20)
        curncy(max: 9999999999L)
        declareDate(nullable: true)
        disclPaper(size: 0..100)
        disclWebsite(size: 0..100)
        districtNo(size: 0..10)
        eName(size: 0..200)
        email(size: 0..50)
        esName(size: 0..50)
        fax(size: 0..60)
        genManager(size: 0..40)
        issueBond(size: 0..30)
        layerCode(size: 0..18)
        legPerson(size: 0..40)
        listed(size: 0..30)
        ltaxNo(size: 0..50)
        montherCode(max: 9999999999L)
        montherName(size: 0..100)
        mstaffNum(max: 9999999999L)
        nation(size: 0..8)
        nonPriBiz(max: 9223372036854775807L)
        ntaxNo(size: 0..50)
        officeAddr(size: 0..200)
        orgForm(max: 9999999999L)
        orgMtype(size: 0..9)
        orgStatus(max: 9999999999L)
        orgStype(size: 0..6)
        parentCode(max: 9999999999L)
        parentName(size: 0..60)
        postcode(size: 0..20)
        priBiz(max: 9223372036854775807L)
        province(size: 0..30)
        regiAddr(size: 0..200)
        regiCap(size: 0..18)
        region(size: 0..3)
        regionCode(max: 9999999999L)
        regtNo(size: 0..50)
        remark(size: 0..400)
        repr(size: 0..60)
        reprAddr(size: 0..200)
        reprEmail(size: 0..50)
        reprFax(size: 0..60)
        reprTel(size: 0..60)
        sectryEmail(size: 0..50)
        sectryFax(size: 0..60)
        sectryTel(size: 0..60)
        serviceTel(size: 0..20)
        staffnum(max: 9999999999L)
        tel(size: 0..60)
        topCode(max: 9999999999L)
        topName(size: 0..100)
        tstaffNum(max: 9999999999L)
        webSite(size: 0..100)
    }
    String toString() {
        return "${orgCode}" 
    }
}
