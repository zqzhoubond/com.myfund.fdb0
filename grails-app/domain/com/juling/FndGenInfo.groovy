/**
 * The FndGenInfo entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndGenInfo {
    static mapping = {
         table 'fnd_gen_info'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_gen_info_sequence']
         id generator:'identity', column:'INNER_CODE'
        chiAbbr column: 'CHIABBR'
        chiSpell2 column: 'CHISPELL_2'
        curancyCls column: 'CURANCY_CLS'
        curancyDistilCls column: 'CURANCY_DISTIL_CLS'
        fundsName column: 'FUNDSNAME'
        fundName column: 'FUNDNAME'
        fundsName2 column: 'FUNDSNAME_2'
        iftranFund column: 'IF_TRAN_FUND'
        fndtype column: 'FNDTYPE'

    }
    Long innerCode
    Long version
    String applBuyCodeBack
    String applBuyCodeFront
    String chiAbbr
    String chiSpell2
    Long curancyCls
    Long curancyDistilCls
    String duration
    String engAbbr
    String engName
    Date estabDate
    Long fndBrief
    Long fndtype
    String fundCode
    Long fundId
    Date fundMatu
    String fundName
    Long fundStatus
    String fundsName
    String fundsName2
    Long ifInnovative
    Long ifUmbreFund
    Long iftranFund
    Long incomeConvShareCls
    Date initEstabDate
    Long invstQual
    Long invstStyle
    Long invstType
    String isin
    Date listDate
    Long manaCode
    String manaName
    String mktCode
    Long orgCode
    String shnetCode
    String shseCode
    String sznetCode
    String szseCode
    Long tradeMkt
    Long trupCode
    String trupName

    static constraints = {
        innerCode(max: 9999999999L)
        version(max: 9223372036854775807L)
        applBuyCodeBack(size: 0..12)
        applBuyCodeFront(size: 1..255, blank: false)
        chiAbbr(size: 0..20)
        chiSpell2(size: 0..20)
        curancyCls(max: 9999999999L)
        curancyDistilCls(max: 9999999999L)
        duration(size: 0..9)
        engAbbr(size: 0..100)
        engName(size: 0..200)
        estabDate(nullable: true)
        fndBrief(max: 9223372036854775807L)
        fndtype(max: 9999999999L)
        fundCode(size: 1..12, blank: false)
        fundId(max: 9999999999L)
        fundMatu(nullable: true)
        fundName(size: 0..80)
        fundStatus(max: 9999999999L)
        fundsName(size: 0..30)
        fundsName2(size: 0..40)
        ifInnovative(max: 9999999999L)
        ifUmbreFund(max: 9999999999L)
        iftranFund(max: 9999999999L)
        incomeConvShareCls(max: 9999999999L)
        initEstabDate(nullable: true)
        invstQual(max: 9999999999L)
        invstStyle(max: 9999999999L)
        invstType(max: 9999999999L)
        isin(size: 0..12)
        listDate(nullable: true)
        manaCode(max: 9999999999L)
        manaName(size: 0..200)
        mktCode(size: 0..12)
        orgCode(max: 9999999999L)
        shnetCode(size: 0..12)
        shseCode(size: 0..12)
        sznetCode(size: 0..12)
        szseCode(size: 0..12)
        tradeMkt(max: 9999999999L)
        trupCode(max: 9999999999L)
        trupName(size: 0..200)
    }
    String toString() {
        return "${innerCode}" 
    }
}
