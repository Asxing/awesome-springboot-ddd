(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[21],{JDLn:function(e,t,a){e.exports={toolbar:"antd-pro-components-footer-toolbar-index-toolbar",left:"antd-pro-components-footer-toolbar-index-left",right:"antd-pro-components-footer-toolbar-index-right"}},erBf:function(e,t,a){"use strict";a.r(t);a("+L6B");var n=a("2/Rp"),r=(a("Xi6J"),a("kl6h")),l=(a("IzEo"),a("bx4M")),o=(a("14J3"),a("BMrR")),i=(a("jCWc"),a("kPKH")),c=(a("5NDa"),a("5rEg")),s=(a("Q9mQ"),a("diRs")),u=(a("Pwec"),a("CtXQ")),m=a("2Taf"),d=a.n(m),p=a("vZ4D"),f=a.n(p),v=a("l4Ni"),y=a.n(v),h=a("ujKo"),E=a.n(h),g=a("MhPg"),b=a.n(g),k=(a("y8nQ"),a("Vl3Y")),w=(a("iQDF"),a("+eQT")),C=(a("OaEy"),a("2fM7")),x=a("q1tI"),P=a.n(x),O=a("MuoO"),N=a("jehZ"),I=a.n(N),S=a("Y/ft"),F=a.n(S),T=a("17x9"),R=a.n(T),j=a("TSYQ"),q=a.n(j),D=a("JDLn"),z=a.n(D),M=function(e){function t(){var e,a;d()(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return a=y()(this,(e=E()(t)).call.apply(e,[this].concat(r))),a.state={width:void 0},a.resizeFooterToolbar=function(){var e=document.querySelector(".ant-layout-sider");if(null!=e){var t=a.context.isMobile,n=t?null:"calc(100% - ".concat(e.style.width,")"),r=a.state.width;r!==n&&a.setState({width:n})}},a}return b()(t,e),f()(t,[{key:"componentDidMount",value:function(){window.addEventListener("resize",this.resizeFooterToolbar),this.resizeFooterToolbar()}},{key:"componentWillUnmount",value:function(){window.removeEventListener("resize",this.resizeFooterToolbar)}},{key:"render",value:function(){var e=this.props,t=e.children,a=e.className,n=e.extra,r=F()(e,["children","className","extra"]),l=this.state.width;return P.a.createElement("div",I()({className:q()(a,z.a.toolbar),style:{width:l}},r),P.a.createElement("div",{className:z.a.left},n),P.a.createElement("div",{className:z.a.right},t))}}]),t}(x["Component"]);M.contextTypes={isMobile:R.a.bool};var K=a("zHco"),V=(a("g9YV"),a("wCAj")),B=(a("cIOH"),a("VCL8")),L=a("3S7+"),_=a("YMnH"),A=a("Kz+r"),J=a("wEI+");function Y(e){return Y="function"===typeof Symbol&&"symbol"===typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"===typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e},Y(e)}function Q(){return Q=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var a=arguments[t];for(var n in a)Object.prototype.hasOwnProperty.call(a,n)&&(e[n]=a[n])}return e},Q.apply(this,arguments)}function H(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function W(e,t){for(var a=0;a<t.length;a++){var n=t[a];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}function Z(e,t,a){return t&&W(e.prototype,t),a&&W(e,a),e}function U(e,t){return!t||"object"!==Y(t)&&"function"!==typeof t?G(e):t}function X(e){return X=Object.setPrototypeOf?Object.getPrototypeOf:function(e){return e.__proto__||Object.getPrototypeOf(e)},X(e)}function G(e){if(void 0===e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return e}function $(e,t){if("function"!==typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function");e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,writable:!0,configurable:!0}}),t&&ee(e,t)}function ee(e,t){return ee=Object.setPrototypeOf||function(e,t){return e.__proto__=t,e},ee(e,t)}var te=function(e,t){var a={};for(var n in e)Object.prototype.hasOwnProperty.call(e,n)&&t.indexOf(n)<0&&(a[n]=e[n]);if(null!=e&&"function"===typeof Object.getOwnPropertySymbols){var r=0;for(n=Object.getOwnPropertySymbols(e);r<n.length;r++)t.indexOf(n[r])<0&&(a[n[r]]=e[n[r]])}return a},ae=function(e){function t(e){var a;return H(this,t),a=U(this,X(t).call(this,e)),a.onConfirm=function(e){a.setVisible(!1,e);var t=a.props.onConfirm;t&&t.call(G(a),e)},a.onCancel=function(e){a.setVisible(!1,e);var t=a.props.onCancel;t&&t.call(G(a),e)},a.onVisibleChange=function(e){a.setVisible(e)},a.saveTooltip=function(e){a.tooltip=e},a.renderOverlay=function(e,t){var r=a.props,l=r.okButtonProps,o=r.cancelButtonProps,i=r.title,c=r.cancelText,s=r.okText,u=r.okType,m=r.icon;return x["createElement"]("div",null,x["createElement"]("div",{className:"".concat(e,"-inner-content")},x["createElement"]("div",{className:"".concat(e,"-message")},m,x["createElement"]("div",{className:"".concat(e,"-message-title")},i)),x["createElement"]("div",{className:"".concat(e,"-buttons")},x["createElement"](n["a"],Q({onClick:a.onCancel,size:"small"},o),c||t.cancelText),x["createElement"](n["a"],Q({onClick:a.onConfirm,type:u,size:"small"},l),s||t.okText))))},a.renderConfirm=function(e){var t=e.getPrefixCls,n=a.props,r=n.prefixCls,l=n.placement,o=te(n,["prefixCls","placement"]),i=t("popover",r),c=x["createElement"](_["a"],{componentName:"Popconfirm",defaultLocale:A["a"].Popconfirm},function(e){return a.renderOverlay(i,e)});return x["createElement"](L["a"],Q({},o,{prefixCls:i,placement:l,onVisibleChange:a.onVisibleChange,visible:a.state.visible,overlay:c,ref:a.saveTooltip}))},a.state={visible:e.visible},a}return $(t,e),Z(t,[{key:"getPopupDomNode",value:function(){return this.tooltip.getPopupDomNode()}},{key:"setVisible",value:function(e,t){var a=this.props;"visible"in a||this.setState({visible:e});var n=a.onVisibleChange;n&&n(e,t)}},{key:"render",value:function(){return x["createElement"](J["a"],null,this.renderConfirm)}}],[{key:"getDerivedStateFromProps",value:function(e){return"visible"in e?{visible:e.visible}:"defaultVisible"in e?{visible:e.defaultVisible}:null}}]),t}(x["Component"]);ae.defaultProps={transitionName:"zoom-big",placement:"top",trigger:"click",okType:"primary",icon:x["createElement"](u["a"],{type:"exclamation-circle",theme:"filled"})},Object(B["polyfill"])(ae);var ne,re,le,oe,ie=ae,ce=(a("/zsF"),a("PArb")),se=(a("miYZ"),a("tsqr")),ue=a("p0pE"),me=a.n(ue),de=a("Y+p1"),pe=a.n(de),fe=a("Zpge"),ve=a.n(fe),ye=function(e){function t(e){var a;return d()(this,t),a=y()(this,E()(t).call(this,e)),a.index=0,a.cacheOriginData={},a.toggleEditable=function(e,t){e.preventDefault();var n=a.state.data,r=n.map(function(e){return me()({},e)}),l=a.getRowByKey(t,r);l&&(l.editable||(a.cacheOriginData[t]=me()({},l)),l.editable=!l.editable,a.setState({data:r}))},a.newMember=function(){var e=a.state.data,t=e.map(function(e){return me()({},e)});t.push({key:"NEW_TEMP_ID_".concat(a.index),workId:"",name:"",department:"",editable:!0,isNew:!0}),a.index+=1,a.setState({data:t})},a.state={data:e.value,loading:!1,value:e.value},a}return b()(t,e),f()(t,[{key:"getRowByKey",value:function(e,t){var a=this.state.data;return(t||a).filter(function(t){return t.key===e})[0]}},{key:"remove",value:function(e){var t=this.state.data,a=this.props.onChange,n=t.filter(function(t){return t.key!==e});this.setState({data:n}),a(n)}},{key:"handleKeyPress",value:function(e,t){"Enter"===e.key&&this.saveRow(e,t)}},{key:"handleFieldChange",value:function(e,t,a){var n=this.state.data,r=n.map(function(e){return me()({},e)}),l=this.getRowByKey(a,r);l&&(l[t]=e.target.value,this.setState({data:r}))}},{key:"saveRow",value:function(e,t){var a=this;e.persist(),this.setState({loading:!0}),setTimeout(function(){if(a.clickedCancel)a.clickedCancel=!1;else{var n=a.getRowByKey(t)||{};if(!n.workId||!n.name||!n.department)return se["a"].error("\u8bf7\u586b\u5199\u5b8c\u6574\u6210\u5458\u4fe1\u606f\u3002"),e.target.focus(),void a.setState({loading:!1});delete n.isNew,a.toggleEditable(e,t);var r=a.state.data,l=a.props.onChange;l(r),a.setState({loading:!1})}},500)}},{key:"cancel",value:function(e,t){this.clickedCancel=!0,e.preventDefault();var a=this.state.data,n=a.map(function(e){return me()({},e)}),r=this.getRowByKey(t,n);this.cacheOriginData[t]&&(Object.assign(r,this.cacheOriginData[t]),delete this.cacheOriginData[t]),r.editable=!1,this.setState({data:n}),this.clickedCancel=!1}},{key:"render",value:function(){var e=this,t=[{title:"\u6210\u5458\u59d3\u540d",dataIndex:"name",key:"name",width:"20%",render:function(t,a){return a.editable?P.a.createElement(c["a"],{value:t,autoFocus:!0,onChange:function(t){return e.handleFieldChange(t,"name",a.key)},onKeyPress:function(t){return e.handleKeyPress(t,a.key)},placeholder:"\u6210\u5458\u59d3\u540d"}):t}},{title:"\u5de5\u53f7",dataIndex:"workId",key:"workId",width:"20%",render:function(t,a){return a.editable?P.a.createElement(c["a"],{value:t,onChange:function(t){return e.handleFieldChange(t,"workId",a.key)},onKeyPress:function(t){return e.handleKeyPress(t,a.key)},placeholder:"\u5de5\u53f7"}):t}},{title:"\u6240\u5c5e\u90e8\u95e8",dataIndex:"department",key:"department",width:"40%",render:function(t,a){return a.editable?P.a.createElement(c["a"],{value:t,onChange:function(t){return e.handleFieldChange(t,"department",a.key)},onKeyPress:function(t){return e.handleKeyPress(t,a.key)},placeholder:"\u6240\u5c5e\u90e8\u95e8"}):t}},{title:"\u64cd\u4f5c",key:"action",render:function(t,a){var n=e.state.loading;return a.editable&&n?null:a.editable?a.isNew?P.a.createElement("span",null,P.a.createElement("a",{onClick:function(t){return e.saveRow(t,a.key)}},"\u4fdd\u5b58"),P.a.createElement(ce["a"],{type:"vertical"}),P.a.createElement(ie,{title:"\u662f\u5426\u8981\u5220\u9664\u6b64\u884c\uff1f",onConfirm:function(){return e.remove(a.key)}},P.a.createElement("a",null,"\u5220\u9664"))):P.a.createElement("span",null,P.a.createElement("a",{onClick:function(t){return e.saveRow(t,a.key)}},"\u4fdd\u5b58"),P.a.createElement(ce["a"],{type:"vertical"}),P.a.createElement("a",{onClick:function(t){return e.cancel(t,a.key)}},"\u53d6\u6d88")):P.a.createElement("span",null,P.a.createElement("a",{onClick:function(t){return e.toggleEditable(t,a.key)}},"\u7f16\u8f91"),P.a.createElement(ce["a"],{type:"vertical"}),P.a.createElement(ie,{title:"\u662f\u5426\u8981\u5220\u9664\u6b64\u884c\uff1f",onConfirm:function(){return e.remove(a.key)}},P.a.createElement("a",null,"\u5220\u9664")))}}],a=this.state,r=a.loading,l=a.data;return P.a.createElement(x["Fragment"],null,P.a.createElement(V["a"],{loading:r,columns:t,dataSource:l,pagination:!1,rowClassName:function(e){return e.editable?ve.a.editable:""}}),P.a.createElement(n["a"],{style:{width:"100%",marginTop:16,marginBottom:8},type:"dashed",onClick:this.newMember,icon:"plus"},"\u65b0\u589e\u6210\u5458"))}}],[{key:"getDerivedStateFromProps",value:function(e,t){return pe()(e.value,t.value)?null:{data:e.value,value:e.value}}}]),t}(x["PureComponent"]),he=ye,Ee=C["a"].Option,ge=w["a"].RangePicker,be={name:"\u4ed3\u5e93\u540d",url:"\u4ed3\u5e93\u57df\u540d",owner:"\u4ed3\u5e93\u7ba1\u7406\u5458",approver:"\u5ba1\u6279\u4eba",dateRange:"\u751f\u6548\u65e5\u671f",type:"\u4ed3\u5e93\u7c7b\u578b",name2:"\u4efb\u52a1\u540d",url2:"\u4efb\u52a1\u63cf\u8ff0",owner2:"\u6267\u884c\u4eba",approver2:"\u8d23\u4efb\u4eba",dateRange2:"\u751f\u6548\u65e5\u671f",type2:"\u4efb\u52a1\u7c7b\u578b"},ke=[{key:"1",workId:"00001",name:"John Brown",department:"New York No. 1 Lake Park"},{key:"2",workId:"00002",name:"Jim Green",department:"London No. 1 Lake Park"},{key:"3",workId:"00003",name:"Joe Black",department:"Sidney No. 1 Lake Park"}],we=(ne=Object(O["connect"])(function(e){var t=e.loading;return{submitting:t.effects["form/submitAdvancedForm"]}}),re=k["a"].create(),ne(le=re((oe=function(e){function t(){var e,a;d()(this,t);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return a=y()(this,(e=E()(t)).call.apply(e,[this].concat(r))),a.state={width:"100%"},a.getErrorInfo=function(){var e=a.props.form.getFieldsError,t=e(),n=Object.keys(t).filter(function(e){return t[e]}).length;if(!t||0===n)return null;var r=function(e){var t=document.querySelector('label[for="'.concat(e,'"]'));t&&t.scrollIntoView(!0)},l=Object.keys(t).map(function(e){return t[e]?P.a.createElement("li",{key:e,className:ve.a.errorListItem,onClick:function(){return r(e)}},P.a.createElement(u["a"],{type:"cross-circle-o",className:ve.a.errorIcon}),P.a.createElement("div",{className:ve.a.errorMessage},t[e][0]),P.a.createElement("div",{className:ve.a.errorField},be[e])):null});return P.a.createElement("span",{className:ve.a.errorIcon},P.a.createElement(s["a"],{title:"\u8868\u5355\u6821\u9a8c\u4fe1\u606f",content:l,overlayClassName:ve.a.errorPopover,trigger:"click",getPopupContainer:function(e){return e.parentNode}},P.a.createElement(u["a"],{type:"exclamation-circle"})),n)},a.resizeFooterToolbar=function(){requestAnimationFrame(function(){var e=document.querySelectorAll(".ant-layout-sider")[0];if(e){var t="calc(100% - ".concat(e.style.width,")"),n=a.state.width;n!==t&&a.setState({width:t})}})},a.validate=function(){var e=a.props,t=e.form.validateFieldsAndScroll,n=e.dispatch;t(function(e,t){e||n({type:"form/submitAdvancedForm",payload:t})})},a}return b()(t,e),f()(t,[{key:"componentDidMount",value:function(){window.addEventListener("resize",this.resizeFooterToolbar,{passive:!0})}},{key:"componentWillUnmount",value:function(){window.removeEventListener("resize",this.resizeFooterToolbar)}},{key:"render",value:function(){var e=this.props,t=e.form.getFieldDecorator,a=e.submitting,s=this.state.width;return P.a.createElement(K["a"],{title:"\u9ad8\u7ea7\u8868\u5355",content:"\u9ad8\u7ea7\u8868\u5355\u5e38\u89c1\u4e8e\u4e00\u6b21\u6027\u8f93\u5165\u548c\u63d0\u4ea4\u5927\u6279\u91cf\u6570\u636e\u7684\u573a\u666f\u3002",wrapperClassName:ve.a.advancedForm},P.a.createElement(l["a"],{title:"\u4ed3\u5e93\u7ba1\u7406",className:ve.a.card,bordered:!1},P.a.createElement(k["a"],{layout:"vertical",hideRequiredMark:!0},P.a.createElement(o["a"],{gutter:16},P.a.createElement(i["a"],{lg:6,md:12,sm:24},P.a.createElement(k["a"].Item,{label:be.name},t("name",{rules:[{required:!0,message:"\u8bf7\u8f93\u5165\u4ed3\u5e93\u540d\u79f0"}]})(P.a.createElement(c["a"],{placeholder:"\u8bf7\u8f93\u5165\u4ed3\u5e93\u540d\u79f0"})))),P.a.createElement(i["a"],{xl:{span:6,offset:2},lg:{span:8},md:{span:12},sm:24},P.a.createElement(k["a"].Item,{label:be.url},t("url",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9"}]})(P.a.createElement(c["a"],{style:{width:"100%"},addonBefore:"http://",addonAfter:".com",placeholder:"\u8bf7\u8f93\u5165"})))),P.a.createElement(i["a"],{xl:{span:8,offset:2},lg:{span:10},md:{span:24},sm:24},P.a.createElement(k["a"].Item,{label:be.owner},t("owner",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u7ba1\u7406\u5458"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u7ba1\u7406\u5458"},P.a.createElement(Ee,{value:"xiao"},"\u4ed8\u6653\u6653"),P.a.createElement(Ee,{value:"mao"},"\u5468\u6bdb\u6bdb")))))),P.a.createElement(o["a"],{gutter:16},P.a.createElement(i["a"],{lg:6,md:12,sm:24},P.a.createElement(k["a"].Item,{label:be.approver},t("approver",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u5ba1\u6279\u5458"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u5ba1\u6279\u5458"},P.a.createElement(Ee,{value:"xiao"},"\u4ed8\u6653\u6653"),P.a.createElement(Ee,{value:"mao"},"\u5468\u6bdb\u6bdb"))))),P.a.createElement(i["a"],{xl:{span:6,offset:2},lg:{span:8},md:{span:12},sm:24},P.a.createElement(k["a"].Item,{label:be.dateRange},t("dateRange",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u751f\u6548\u65e5\u671f"}]})(P.a.createElement(ge,{placeholder:["\u5f00\u59cb\u65e5\u671f","\u7ed3\u675f\u65e5\u671f"],style:{width:"100%"}})))),P.a.createElement(i["a"],{xl:{span:8,offset:2},lg:{span:10},md:{span:24},sm:24},P.a.createElement(k["a"].Item,{label:be.type},t("type",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u4ed3\u5e93\u7c7b\u578b"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u4ed3\u5e93\u7c7b\u578b"},P.a.createElement(Ee,{value:"private"},"\u79c1\u5bc6"),P.a.createElement(Ee,{value:"public"},"\u516c\u5f00")))))))),P.a.createElement(l["a"],{title:"\u4efb\u52a1\u7ba1\u7406",className:ve.a.card,bordered:!1},P.a.createElement(k["a"],{layout:"vertical",hideRequiredMark:!0},P.a.createElement(o["a"],{gutter:16},P.a.createElement(i["a"],{lg:6,md:12,sm:24},P.a.createElement(k["a"].Item,{label:be.name2},t("name2",{rules:[{required:!0,message:"\u8bf7\u8f93\u5165"}]})(P.a.createElement(c["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),P.a.createElement(i["a"],{xl:{span:6,offset:2},lg:{span:8},md:{span:12},sm:24},P.a.createElement(k["a"].Item,{label:be.url2},t("url2",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9"}]})(P.a.createElement(c["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),P.a.createElement(i["a"],{xl:{span:8,offset:2},lg:{span:10},md:{span:24},sm:24},P.a.createElement(k["a"].Item,{label:be.owner2},t("owner2",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u7ba1\u7406\u5458"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u7ba1\u7406\u5458"},P.a.createElement(Ee,{value:"xiao"},"\u4ed8\u6653\u6653"),P.a.createElement(Ee,{value:"mao"},"\u5468\u6bdb\u6bdb")))))),P.a.createElement(o["a"],{gutter:16},P.a.createElement(i["a"],{lg:6,md:12,sm:24},P.a.createElement(k["a"].Item,{label:be.approver2},t("approver2",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u5ba1\u6279\u5458"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u5ba1\u6279\u5458"},P.a.createElement(Ee,{value:"xiao"},"\u4ed8\u6653\u6653"),P.a.createElement(Ee,{value:"mao"},"\u5468\u6bdb\u6bdb"))))),P.a.createElement(i["a"],{xl:{span:6,offset:2},lg:{span:8},md:{span:12},sm:24},P.a.createElement(k["a"].Item,{label:be.dateRange2},t("dateRange2",{rules:[{required:!0,message:"\u8bf7\u8f93\u5165"}]})(P.a.createElement(r["a"],{placeholder:"\u63d0\u9192\u65f6\u95f4",style:{width:"100%"},getPopupContainer:function(e){return e.parentNode}})))),P.a.createElement(i["a"],{xl:{span:8,offset:2},lg:{span:10},md:{span:24},sm:24},P.a.createElement(k["a"].Item,{label:be.type2},t("type2",{rules:[{required:!0,message:"\u8bf7\u9009\u62e9\u4ed3\u5e93\u7c7b\u578b"}]})(P.a.createElement(C["a"],{placeholder:"\u8bf7\u9009\u62e9\u4ed3\u5e93\u7c7b\u578b"},P.a.createElement(Ee,{value:"private"},"\u79c1\u5bc6"),P.a.createElement(Ee,{value:"public"},"\u516c\u5f00")))))))),P.a.createElement(l["a"],{title:"\u6210\u5458\u7ba1\u7406",bordered:!1},t("members",{initialValue:ke})(P.a.createElement(he,null))),P.a.createElement(M,{style:{width:s}},this.getErrorInfo(),P.a.createElement(n["a"],{type:"primary",onClick:this.validate,loading:a},"\u63d0\u4ea4")))}}]),t}(x["PureComponent"]),le=oe))||le)||le);t["default"]=we}}]);