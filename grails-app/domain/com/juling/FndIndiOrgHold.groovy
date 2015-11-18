/**
 * The FndIndiOrgHold entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndIndiOrgHold implements  Serializable {
    static mapping = {
         table 'fnd_indi_org_hold'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_indi_org_hold_sequence']
         id generator:'identity', column:'INNER_CODE'
         id column:'enddate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'source', params:[sequence:'fnd_indi_org_hold_sequence']
         id generator:'identity', column:'SOURCE'
         id composite:['innerCode','enddate','source'], generator:'assigned'
    }
    Long innerCode
    Date enddate
    Long source
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    java.math.BigDecimal holderNo
    java.math.BigDecimal avgHldVol
    java.math.BigDecimal orgHldVol
    java.math.BigDecimal orgHldPct
    java.math.BigDecimal indiHldVol
    java.math.BigDecimal indiHldPct
    java.math.BigDecimal undefVol
    java.math.BigDecimal undefVolPct
    java.math.BigDecimal fundTotVol
    String sourceMark

    static constraints = {
        innerCode(max: 9999999999L)
        enddate()
        source(max: 9999999999L)
        seq(nullable: true, max: 9999999999L)
        ctime(nullable: true)
        mtime(nullable: true)
        isvalid(nullable: true)
        geniusUid(nullable: true, max: 9223372036854775807L)
        declaredate(nullable: true)
        holderNo(nullable: true)
        avgHldVol(nullable: true)
        orgHldVol(nullable: true)
        orgHldPct(nullable: true)
        indiHldVol(nullable: true)
        indiHldPct(nullable: true)
        undefVol(nullable: true)
        undefVolPct(nullable: true)
        fundTotVol(nullable: true)
        sourceMark(size: 0..20)
    }
    String toString() {
        return "${innerCode}" 
    }
}
