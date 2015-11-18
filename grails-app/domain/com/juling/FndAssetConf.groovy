/**
 * The FndAssetConf entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndAssetConf {
    static mapping = {
         table 'fnd_asset_conf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'source', params:[sequence:'fnd_asset_conf_sequence']
         id generator:'identity', column:'SOURCE'
        endDate column: 'endDate'
        optionsassetTotProp column: 'OPTIONS_ASSET_TOT_PROP'
        declareDate column: 'DECLAREDATE'
        finDeriAssetProp column: 'FIN_DERI_ASSET_PROP'
        finDeriVal column: 'FIN_DERI_VAL'
    }
    Long source
    Long version
    String absVal
    String absValNaProp
    String absValTotProp
    String assetTot
    String assetVal
    String backDue
    String backDueAssetProp
    String bakSecNaProp
    String bndVal
    String bndValAssetProp
    String bndValNaProp
    String buyBakSec
    String buyBakSecProp
    String convBndAssetProp
    String convBndVal
    Date declareDate
    String depReceAssetProp
    String depReceVal
    String depReckUp
    String depReckUpAssetUp
    String depValNaProp
    Date endDate
    String eqtInvstAssetProp
    String eqtInvstVal
    String finDeriAssetProp
    String finDeriVal
    String fixIncmAssetProp
    String fixIncmVal
    String fndTotShares
    String forwardAssetTotProp
    String forwardVal
    Long fundId
    String futuresAssetTotProp
    String futuresVal
    String hldFndVal
    String hldFndValNaProp
    String hldFndValTotProp
    String moneyMktVal
    String moneyMktValTotProp
    String natValCurncyCap
    String natValCurncyCapProp
    String optVal
    String optValNaProp
    String optValTotProp
    String optionsassetTotProp
    String optionsVal
    String othAssetVal
    String othAssetValTotProp
    String othInvVal
    String othInvValProp
    String othValNaProp
    String stkVal
    String stkValAssetProp
    String stkValNaProp
    Date trupCheckDate
    String unitAssetVal

    static constraints = {
        source(max: 9999999999L)
        version(max: 9223372036854775807L)
        absVal(size: 0..18)
        absValNaProp(size: 0..7)
        absValTotProp(size: 0..7)
        assetTot(size: 0..18)
        assetVal(size: 0..18)
        backDue(size: 0..18)
        backDueAssetProp(size: 0..7)
        bakSecNaProp(size: 0..7)
        bndVal(size: 0..18)
        bndValAssetProp(size: 0..7)
        bndValNaProp(size: 0..7)
        buyBakSec(size: 0..18)
        buyBakSecProp(size: 0..7)
        convBndAssetProp(size: 0..7)
        convBndVal(size: 0..18)
        declareDate(nullable: true)
        depReceAssetProp(size: 0..7)
        depReceVal(size: 0..18)
        depReckUp(size: 0..18)
        depReckUpAssetUp(size: 0..7)
        depValNaProp(size: 0..7)
        endDate()
        eqtInvstAssetProp(size: 0..7)
        eqtInvstVal(size: 0..18)
        finDeriAssetProp(size: 0..7)
        finDeriVal(size: 0..18)
        fixIncmAssetProp(size: 0..7)
        fixIncmVal(size: 0..18)
        fndTotShares(size: 0..18)
        forwardAssetTotProp(size: 0..7)
        forwardVal(size: 0..18)
        fundId(max: 9999999999L)
        futuresAssetTotProp(size: 0..7)
        futuresVal(size: 0..18)
        hldFndVal(size: 0..18)
        hldFndValNaProp(size: 0..7)
        hldFndValTotProp(size: 0..7)
        moneyMktVal(size: 0..18)
        moneyMktValTotProp(size: 0..7)
        natValCurncyCap(size: 0..18)
        natValCurncyCapProp(size: 0..7)
        optVal(size: 0..18)
        optValNaProp(size: 0..7)
        optValTotProp(size: 0..7)
        optionsassetTotProp(size: 0..7)
        optionsVal(size: 0..18)
        othAssetVal(size: 0..18)
        othAssetValTotProp(size: 0..7)
        othInvVal(size: 0..18)
        othInvValProp(size: 0..7)
        othValNaProp(size: 0..7)
        stkVal(size: 0..18)
        stkValAssetProp(size: 0..7)
        stkValNaProp(size: 0..7)
        trupCheckDate(nullable: true)
        unitAssetVal(size: 0..10)
    }
    String toString() {
        return "${source}" 
    }
}
