package htmlSelenium;

public class Xpath2 {
	//With these locators I know the goal is to get 1 to 1.  I understand the concept
	//The index number can also be used ex.[2] out 7
	//Some below don't have the index number but the formulas,order, and concept is understood
/*Tag with parent
 * source=target.com/careers
 * //div[@class='cms-content   text-x-small']//parent::section --Careers page
 * //div[@class='global-footer--inner']//parent::footer --Footer
 * //div[@id='wrapper']//parent::body--Careers page
 * //ul[@class='level1-CMSListMenuUL']//parent::nav--Careers page
 * //li[@id='uxNav_LI_0_1_1']//parent::ul-- Careers page
 * 
 * Tag with child
 * source=Costco.com
 * //div[@id='tfd-banner']//child::a[@style]--
 * //div[@class=' genericEspot container-fluid fixed-container WC_ContentAreaESpot_div_1_Home_Hero_Carousel']//child::div[@class='caption']
 * //div[@id='product-page']//child::div[@class='omniture']-- food storage
 * //div[@id='compare-box-container']//child::div[@id='compare-box-products']
 * //div[@id='pdp-sticky-container']//child::nav[@id='pdp-sticky-desktop']
 * 
 * Tag with Sibling
 * source=BJ's.com
 * //p[@class='cat-title']//following-sibling::div[@class='cat-child-wrapper closeUp d-none d-lg-block']
 * //div[@class='img-cont']//following-sibling::div[@class='detail-cont']
 * //div[@class='flex-item-container']//following-sibling::div[@class='flex-item-container atc-compare-section']-- Tv stands and media
 * //div[@id='contentOverlay']//following-sibling::div[@class='footer-wrapper']
 * //div[@class='d-md-inline pr-3 h-50 mt-2']//following-sibling::div[@class='d-md-inline']
 * 
 * Tag preceding sibling and Index number when needed
 * source=Walmart.com
 * //div[@class='absolute bg-white br3 br--bottom left-0 lh-copy mt4 overflow-hidden shadow-1 dn']//preceding-sibling::(a[@class='flex items-center no-underline ph3 white desktop-header-trigger lh-title b'])[1]
 * //div[@class='absolute bg-white br3 br--bottom left-0 lh-copy mt4 overflow-hidden shadow-1 dn']//preceding-sibling::(a[@class='flex items-center no-underline ph3 white desktop-header-trigger lh-title b'])[2]
 * //div[@class='relative']//preceding-sibling::a[@class='flex-none mr3']--homepage walmart logo
 * //div[@class='hide-content-max-m FeaturedTopNav-flyout adjusted']//preceding-sibling::(h2[@class='FeaturedTopNav-nav-heading no-margin font-normal'])[2]
 * //div[@id='cp-top-module-1']//preceding-sibling::div[@id='cp-top-module-0']--digital vaccine record
 * //div[@id='cp-top-module-1']//preceding-sibling::div[@id='cp-top-module-0']//parent::div[@class='CategoryApp-topModules CategoryApp-topModules--no-top-padding']
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
