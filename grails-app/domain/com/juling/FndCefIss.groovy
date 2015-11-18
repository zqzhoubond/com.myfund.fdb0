/**
 * The FndCefIss entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndCefIss {
    static mapping = {
         table 'fnd_cef_iss'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_cef_iss_sequence']
         id generator:'identity', column:'INNER_CODE'
    }
    Long innerCode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date signDate
    Date declaredate
    String instaColl
    Date issStartdate
    Date issEnddate
    String issCode
    String issSname
    Long issCls
    String issClsMark
    String issTarg
    java.math.BigDecimal issValPlan
    java.math.BigDecimal unitIssPrc
    java.math.BigDecimal unitIssParVal
    java.math.BigDecimal unitIssFee
    String feeStd
    java.math.BigDecimal truFeeRatio
    java.math.BigDecimal mngFeeRatio
    String applBuyCode
    String applBuyShrform
    Date applBuyStrDate
    java.math.BigDecimal onlineIssVol
    java.math.BigDecimal offlinePlaceVol
    java.math.BigDecimal directPlaceVol
    Date regiDate
    Date exdivDate
    java.math.BigDecimal orgrSubsVol
    java.math.BigDecimal pubSubsVol
    java.math.BigDecimal orgrSubsPlaceVol
    java.math.BigDecimal comSubsPlaceVol
    java.math.BigDecimal pubSubsPlaceVol
    java.math.BigDecimal issLuckNum
    java.math.BigDecimal validApplDoor
    java.math.BigDecimal subsMult
    java.math.BigDecimal holderNo
    java.math.BigDecimal exceSubsMult
    java.math.BigDecimal congCapTot
    java.math.BigDecimal receIssFee
    java.math.BigDecimal collCapAccu
    Date duraStartdate
    Date duraEnddate

    static constraints = {
        innerCode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        signDate(nullable: true)
        declaredate(nullable: true)
        instaColl(size: 0..40)
        issStartdate(nullable: true)
        issEnddate(nullable: true)
        issCode(size: 0..12)
        issSname(size: 0..50)
        issCls(nullable: true, max: 9999999999L)
        issClsMark(size: 0..50)
        issTarg(size: 0..100)
        issValPlan(nullable: true)
        unitIssPrc(nullable: true)
        unitIssParVal(nullable: true)
        unitIssFee(nullable: true)
        feeStd(size: 0..40)
        truFeeRatio(nullable: true)
        mngFeeRatio(nullable: true)
        applBuyCode(size: 0..12)
        applBuyShrform(size: 0..50)
        applBuyStrDate(nullable: true)
        onlineIssVol(nullable: true)
        offlinePlaceVol(nullable: true)
        directPlaceVol(nullable: true)
        regiDate(nullable: true)
        exdivDate(nullable: true)
        orgrSubsVol(nullable: true)
        pubSubsVol(nullable: true)
        orgrSubsPlaceVol(nullable: true)
        comSubsPlaceVol(nullable: true)
        pubSubsPlaceVol(nullable: true)
        issLuckNum(nullable: true)
        validApplDoor(nullable: true)
        subsMult(nullable: true)
        holderNo(nullable: true)
        exceSubsMult(nullable: true)
        congCapTot(nullable: true)
        receIssFee(nullable: true)
        collCapAccu(nullable: true)
        duraStartdate(nullable: true)
        duraEnddate(nullable: true)
    }
    String toString() {
        return "${innerCode}" 
    }
}
