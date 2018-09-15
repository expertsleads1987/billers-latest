<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%--<link href="${metronicBaseUrl}/assets/global/plugins/jquery-ui/jquery-ui.min.css" rel="stylesheet">--%>
<link href="${cssBaseUrl}/jqueryui/jquery-ui.min.css" rel="stylesheet">

<script src="${scriptBaseUrl}/websocket/sockjs-0.3.4.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/websocket/stomp.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/taffy/taffy-min.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/hoverIntent/jquery.hoverIntent.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/jqueryui/jquery-ui.min.js" type="text/javascript"></script>
<%--<script src="${metronicBaseUrl}/assets/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>--%>
<script src="${metronicBaseUrl}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${metronicBaseUrl}/assets/pages/scripts/table-datatables-scroller.min.js" type="text/javascript"></script>
<script src="${scriptBaseUrl}/board/dashboard.js?v=1" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${cssBaseUrl}/3dbutton.css" media="screen" />
<%--handlebars templates start--%>
<script id="portfoy-tr-template" type="text/x-handlebars-template">
    <tr id="{{id}}">
        <td>{{opType}}</td>
        <td>{{symbol}}</td>
        <td>{{stockName}}</td>
        <td>{{amount}}</td>
        <td>{{price}}</td>
        <td>{{matchAmount}}</td>
        <td>{{matchPrice}}</td>
        <td>{{matchTime}}</td>
   </tr>
</script>

<script id="symbol-deep-static-template" type="text/x-handlebars-template">
	{{#outputMap}}
    <tr class="{{colorClass}}">
        <td>{{lastMatchTime}}</td>
        <td align="right">{{lastMatchPrice}}</td>
        <td align="right">{{lastMatchAmount}}</td>
    </tr>
	{{/outputMap}}
</script>

<script id="symbol-detail-template" type="text/x-handlebars-template">
    {{#symbolDetailMap}}
    <div class="div-left-detail">
        <div class="div-header-detail">Taban</div>
        <div class="div-body-detail">{{tabanFiyat}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Tavan</div>
        <div class="div-body-detail">{{tavanFiyat}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Kapanis</div>
        <div class="div-body-detail">{{kapanisFiyati}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Referans</div>
        <div class="div-body-detail">{{referansFiyat}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">En Dusuk Islem</div>
        <div class="div-body-detail">{{enDusukIslemFiyati}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">En Yuksek Islem</div>
        <div class="div-body-detail">{{enYuksekIslemFiyati}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Gerceklesen Lot</div>
        <div class="div-body-detail">{{gerceklesenMiktar}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Gunluk Fark % </div>
        <div class="div-body-detail">{{yuzdeGunlukFark}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Itfaya Kalan Gun</div>
        <div class="div-body-detail">{{itfayaKalanGunSayisi}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Itfaya Kadar G.%</div>
        <div class="div-body-detail">{{itfayaKadarKiraGetirisi}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Vadeye Kalan Gun</div>
        <div class="div-body-detail">{{vadeyeKalanGunSayisi}}</div>
    </div>
    <div class="div-left-detail">
        <div class="div-header-detail">Vadeye Kadar G.%</div>
        <div class="div-body-detail">{{vadeyeKadarGetiri}}</div>
    </div>
    {{/symbolDetailMap}}
</script>

<script id="symbol-deep-template1" type="text/x-handlebars-template">
    <div class="table-container-bid">
        <table class="table-bid-ask" id="table-bid-deep{{symbol}}">
            <thead>
	            <th>
	                Emir
	            </th>
	            <th>
	                Lot
	            </th>
	            <th>
	                Alış
	            </th>
            </thead>
            <tbody>
	            {{#symbolDeepMapBid}}
	            <tr class="{{deepClass}}">
	                <td align="right">{{orderCount}}</td>
	                <td id="sumOrderAmount" align="right">{{sumOrderAmount}}</td>
	                <td id="price" align="right">{{price}}</td>
	            </tr>
	            {{/symbolDeepMapBid}}
            </tbody>
        </table>
    </div>
    <div class="table-container-ask">
        <table class="table-bid-ask" id="table-ask-deep{{symbol}}">
            <thead>
            <th>
                Satış
            </th>
            <th>
                Lot
            </th>
            <th>
                Emir
            </th>
            </thead>
            <tbody>
            {{#symbolDeepMapAsk}}
            <tr class="{{deepClass}}">
                <td id="price" align="right">{{price}}</td>
                <td id="sumOrderAmount" align="right">{{sumOrderAmount}}</td>
                <td align="right">{{orderCount}}</td>
            </tr>
            {{/symbolDeepMapAsk}}
            </tbody>
        </table>
    </div>
</script>

<script id="symbol-deep-template2" type="text/x-handlebars-template">
    <div class="container-bid">
		<div class="div-left-order-button">
        	<button type="button" class="btn btn-success btn-lg btn3d" onclick="BoardUtils.sendBidOrder('{{symbol}}');"><span class="glyphicon glyphicon-ok"></span> AL</button>
		</div>
		<div class="div-right-order">        
			<input type="text" class="text-bid-price" id="{{symbol}}bestBidPrice" placeholder="Fiyat" value="{{bestAskPrice}}">
        	<input type="text" class="text-bid-price" id="{{symbol}}bestBidLot" placeholder="Lot">
    	</div>
	</div>
    <div class="container-ask">
        <div class="div-left-order">
            <input type="text" class="text-ask-price" id="{{symbol}}bestAskPrice" placeholder="Fiyat" value="{{bestBidPrice}}">
            <input type="text" class="text-ask-price" id="{{symbol}}bestAskLot" placeholder="Lot">
        </div>
        <div class="div-right-order-button">
        	<button type="button" class="btn btn-danger btn-lg btn3d" onclick="BoardUtils.sendAskOrder('{{symbol}}');"><span class="glyphicon glyphicon-remove"></span> SAT</button>
        </div>
    </div>
</script>

<script id="symbol-deep-template3" type="text/x-handlebars-template">
    <div class="table-transaction-container">
        <table class="table-match">
            <thead>
	            <tr role="row">
	                <th class="leftth">Saat</th>
	                <th class="rightth">Fiyat</th>
	                <th class="rightth">Lot</th>
	            </tr>
            </thead>
        </table>
		<div id="dataTables_scrollBody">
	        <table class="table-match" id="{{symbol}}table-symbol-match" >
	            <tbody>
					<tr></tr>
		            {{#allOutputMap}}
		            <tr class="{{colorClass}}">
		                <td align="left">{{lastMatchTime}}</td>
		                <td align="right">{{lastMatchPrice}}</td>
		                <td align="right">{{lastMatchAmount}}</td>
		            </tr>
		            {{/allOutputMap}}
	            </tbody>
	        </table>
		</div>
    </div>
</script>

<script id="dynamic-dialog-template" type="text/x-handlebars-template">
    <div class="dialog" id="{{buttonId}}-modal" title="{{buttonId}}"></div>
</script>

<%--handlebars templates end--%>

<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
	<!-- BEGIN CONTENT BODY -->
	<div class="page-content">
		<!-- BEGIN PAGE HEADER-->
		<!-- BEGIN THEME PANEL -->
		<div class="theme-panel">
			<div class="toggler tooltips" data-container="body"
				data-placement="left" data-html="true"
				data-original-title="Click to open advance theme customizer panel">
				<i class="icon-settings"></i>
			</div>
			<div class="toggler-close">
				<i class="icon-close"></i>
			</div>
			<div class="theme-options">
				<div class="theme-option theme-colors clearfix">
					<span> THEME COLOR </span>
					<ul>
						<li class="color-default current tooltips" data-style="default"
							data-container="body" data-original-title="Default"></li>
						<li class="color-grey tooltips" data-style="grey"
							data-container="body" data-original-title="Grey"></li>
						<li class="color-blue tooltips" data-style="blue"
							data-container="body" data-original-title="Blue"></li>
						<li class="color-dark tooltips" data-style="dark"
							data-container="body" data-original-title="Dark"></li>
						<li class="color-light tooltips" data-style="light"
							data-container="body" data-original-title="Light"></li>
					</ul>
				</div>
				<div class="theme-option">
					<span> Theme Style </span> <select
						class="layout-style-option form-control input-small">
						<option value="square" selected="selected">Square corners</option>
						<option value="rounded">Rounded corners</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Layout </span> <select
						class="layout-option form-control input-small">
						<option value="fluid" selected="selected">Fluid</option>
						<option value="boxed">Boxed</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Header </span> <select
						class="page-header-option form-control input-small">
						<option value="fixed" selected="selected">Fixed</option>
						<option value="default">Default</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Top Dropdown</span> <select
						class="page-header-top-dropdown-style-option form-control input-small">
						<option value="light" selected="selected">Light</option>
						<option value="dark">Dark</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Mode</span> <select
						class="sidebar-option form-control input-small">
						<option value="fixed">Fixed</option>
						<option value="default" selected="selected">Default</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Style</span> <select
						class="sidebar-style-option form-control input-small">
						<option value="default" selected="selected">Default</option>
						<option value="compact">Compact</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Menu </span> <select
						class="sidebar-menu-option form-control input-small">
						<option value="accordion" selected="selected">Accordion</option>
						<option value="hover">Hover</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Sidebar Position </span> <select
						class="sidebar-pos-option form-control input-small">
						<option value="left" selected="selected">Left</option>
						<option value="right">Right</option>
					</select>
				</div>
				<div class="theme-option">
					<span> Footer </span> <select
						class="page-footer-option form-control input-small">
						<option value="fixed">Fixed</option>
						<option value="default" selected="selected">Default</option>
					</select>
				</div>
			</div>
		</div>
		<!-- END THEME PANEL -->
		<h1 class="page-title">
			Tahta <small>tahta</small>
		</h1>
		<div class="page-bar">
			<ul class="page-breadcrumb">
				<li><i class="icon-home"></i> <a href="index.html">Home</a> <i
					class="fa fa-angle-right"></i></li>
				<li><a href="#">Blank Page</a> <i class="fa fa-angle-right"></i>
				</li>
				<li><span>Page Layouts</span></li>
			</ul>
			<div class="page-toolbar">
				<div class="btn-group pull-right">
					<button type="button"
						class="btn btn-fit-height grey-salt dropdown-toggle"
						data-toggle="dropdown" data-hover="dropdown" data-delay="1000"
						data-close-others="true">
						Actions <i class="fa fa-angle-down"></i>
					</button>
					<ul class="dropdown-menu pull-right" role="menu">
						<li><a href="#"> <i class="icon-bell"></i> Action
						</a></li>
						<li><a href="#"> <i class="icon-shield"></i> Another
								action
						</a></li>
						<li><a href="#"> <i class="icon-user"></i> Something else
								here
						</a></li>
						<li class="divider"></li>
						<li><a href="#"> <i class="icon-bag"></i> Separated link
						</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- END PAGE HEADER-->

		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Ürün Tablosu</h3>
						</div>
						<div class="panel-body">
							<table class="table-portfolio" id="stocks-table-porfolio">
								<thead>
									<tr>
										<th>Symbol</th>
										<th>Yön</th>
										<th>Son</th>
										<th>Alış</th>
										<th>Satış</th>
										<th>Günlük Değişim %</th>
										<th>Kapanış</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="stockEntry" items="${allPortfoyMap}">
										<c:if test="${not empty stockEntry.key}">
											<tr id="${stockEntry.key}">
												<td id="symbol"><c:out value="${stockEntry.key}" /></td>
												<td class="lastTransaction">
													<c:if test="${not empty stockEntry.value.lastTransaction}">
															<c:if test="${stockEntry.value.lastTransaction eq 1 }"> 
																<img src="${imageBaseUrl}/icon-img-up.png" alt="up">
															</c:if>
															<c:if test="${stockEntry.value.lastTransaction eq 2 }"> 
																<img src="${imageBaseUrl}/icon-img-down.png" alt="down">
															</c:if>
													</c:if>
												</td>
												<td id="lastMatchPrice"><c:out value="${stockEntry.value.lastMatchPrice}" /></td>
												<td class="bestBidPrice"><c:out value="${stockEntry.value.bestBidPrice}" /></td>
												<td class="bestAskPrice"><c:out value="${stockEntry.value.bestAskPrice}" /></td>
												<td id="perPriceChange" <c:if test="${stockEntry.value.perPriceChange lt 0 }">class="highlighted-deep"</c:if>
																		<c:if test="${stockEntry.value.perPriceChange gt 0 }">class="nonhighlighted-deep"</c:if>>
													<c:out value="${stockEntry.value.perPriceChange}" />
												</td>
												<td class="closePrice"><c:out value="${stockEntry.value.closePrice}" /></td>
											</tr>
										</c:if>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="panel-footer">Panel footer</div>
					</div>
				</div>
			</div>

		</div>

	</div>
	<!-- END CONTENT BODY -->
</div>
<!-- END CONTENT -->