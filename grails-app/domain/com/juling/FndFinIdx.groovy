/**
 * The FndFinIdx entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndFinIdx implements  Serializable{
    static mapping = {
         table 'fnd_fin_idx'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_fin_idx_sequence']
         id generator:'identity', column:'INNER_CODE'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'rpt_src', params:[sequence:'fnd_fin_idx_sequence']
         id generator:'identity', column:'RPT_SRC'
         id column:'enddate'
         id composite:['innerCode','rptSrc','enddate'], generator:'assigned'
    }
    Long innerCode
    Long rptSrc
    Date enddate
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    String rptSrcMark
    Date rptDate
    Date startdate
    Date declaredate
    java.math.BigDecimal unitNetIncm
    java.math.BigDecimal plaUnitNetVal
    java.math.BigDecimal distYld
    java.math.BigDecimal netGr
    java.math.BigDecimal unitAvgIncm
    java.math.BigDecimal unitYld
    java.math.BigDecimal accumNetGr
    java.math.BigDecimal perNetGr
    java.math.BigDecimal avgValYld
    java.math.BigDecimal distIncm
    java.math.BigDecimal distUnitIncm
    java.math.BigDecimal unitNetVal
    java.math.BigDecimal netValYld
    java.math.BigDecimal netIncm
    java.math.BigDecimal equity
    java.math.BigDecimal unitAccumYld
    java.math.BigDecimal profit
    java.math.BigDecimal valAlter
    java.math.BigDecimal unitAvgProfit
    java.math.BigDecimal unitAvgProfitPer
    java.math.BigDecimal unitAccumNet
    java.math.BigDecimal mergeEquity
    String discId
    Long ifMerge

    static constraints = {
        innerCode(max: 9999999999L)
        rptSrc(max: 9999999999L)
        enddate()
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        rptSrcMark(size: 0..50)
        rptDate(nullable: true)
        startdate(nullable: true)
        declaredate(nullable: true)
        unitNetIncm(nullable: true)
        plaUnitNetVal(nullable: true)
        distYld(nullable: true)
        netGr(nullable: true)
        unitAvgIncm(nullable: true)
        unitYld(nullable: true)
        accumNetGr(nullable: true)
        perNetGr(nullable: true)
        avgValYld(nullable: true)
        distIncm(nullable: true)
        distUnitIncm(nullable: true)
        unitNetVal(nullable: true)
        netValYld(nullable: true)
        netIncm(nullable: true)
        equity(nullable: true)
        unitAccumYld(nullable: true)
        profit(nullable: true)
        valAlter(nullable: true)
        unitAvgProfit(nullable: true)
        unitAvgProfitPer(nullable: true)
        unitAccumNet(nullable: true)
        mergeEquity(nullable: true)
        discId(size: 0..18)
        ifMerge(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${innerCode}" 
    }
}
