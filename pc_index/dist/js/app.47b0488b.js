(function(e){function t(t){for(var r,o,i=t[0],l=t[1],s=t[2],u=0,d=[];u<i.length;u++)o=i[u],Object.prototype.hasOwnProperty.call(a,o)&&a[o]&&d.push(a[o][0]),a[o]=0;for(r in l)Object.prototype.hasOwnProperty.call(l,r)&&(e[r]=l[r]);f&&f(t);while(d.length)d.shift()();return c.push.apply(c,s||[]),n()}function n(){for(var e,t=0;t<c.length;t++){for(var n=c[t],r=!0,o=1;o<n.length;o++){var i=n[o];0!==a[i]&&(r=!1)}r&&(c.splice(t--,1),e=l(l.s=n[0]))}return e}var r={},o={app:0},a={app:0},c=[];function i(e){return l.p+"js/"+({}[e]||e)+"."+{"chunk-0f30a2d0":"d60d69c3","chunk-16d122d4":"61611ba7","chunk-2e0fa7ae":"f989ddb1","chunk-76e80f2c":"1e4208a1"}[e]+".js"}function l(t){if(r[t])return r[t].exports;var n=r[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,l),n.l=!0,n.exports}l.e=function(e){var t=[],n={"chunk-0f30a2d0":1,"chunk-16d122d4":1,"chunk-2e0fa7ae":1,"chunk-76e80f2c":1};o[e]?t.push(o[e]):0!==o[e]&&n[e]&&t.push(o[e]=new Promise((function(t,n){for(var r="css/"+({}[e]||e)+"."+{"chunk-0f30a2d0":"e3f060b9","chunk-16d122d4":"1c88f5be","chunk-2e0fa7ae":"a54ad80f","chunk-76e80f2c":"5c21737f"}[e]+".css",a=l.p+r,c=document.getElementsByTagName("link"),i=0;i<c.length;i++){var s=c[i],u=s.getAttribute("data-href")||s.getAttribute("href");if("stylesheet"===s.rel&&(u===r||u===a))return t()}var d=document.getElementsByTagName("style");for(i=0;i<d.length;i++){s=d[i],u=s.getAttribute("data-href");if(u===r||u===a)return t()}var f=document.createElement("link");f.rel="stylesheet",f.type="text/css",f.onload=t,f.onerror=function(t){var r=t&&t.target&&t.target.src||a,c=new Error("Loading CSS chunk "+e+" failed.\n("+r+")");c.code="CSS_CHUNK_LOAD_FAILED",c.request=r,delete o[e],f.parentNode.removeChild(f),n(c)},f.href=a;var h=document.getElementsByTagName("head")[0];h.appendChild(f)})).then((function(){o[e]=0})));var r=a[e];if(0!==r)if(r)t.push(r[2]);else{var c=new Promise((function(t,n){r=a[e]=[t,n]}));t.push(r[2]=c);var s,u=document.createElement("script");u.charset="utf-8",u.timeout=120,l.nc&&u.setAttribute("nonce",l.nc),u.src=i(e);var d=new Error;s=function(t){u.onerror=u.onload=null,clearTimeout(f);var n=a[e];if(0!==n){if(n){var r=t&&("load"===t.type?"missing":t.type),o=t&&t.target&&t.target.src;d.message="Loading chunk "+e+" failed.\n("+r+": "+o+")",d.name="ChunkLoadError",d.type=r,d.request=o,n[1](d)}a[e]=void 0}};var f=setTimeout((function(){s({type:"timeout",target:u})}),12e4);u.onerror=u.onload=s,document.head.appendChild(u)}return Promise.all(t)},l.m=e,l.c=r,l.d=function(e,t,n){l.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},l.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},l.t=function(e,t){if(1&t&&(e=l(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(l.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)l.d(n,r,function(t){return e[t]}.bind(null,r));return n},l.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return l.d(t,"a",t),t},l.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},l.p="/",l.oe=function(e){throw console.error(e),e};var s=window["webpackJsonp"]=window["webpackJsonp"]||[],u=s.push.bind(s);s.push=t,s=s.slice();for(var d=0;d<s.length;d++)t(s[d]);var f=u;c.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"0a49":function(e,t,n){"use strict";var r=n("4328"),o=n.n(r);o.a},"17c9":function(e,t,n){},1924:function(e,t,n){},"3ef4":function(e,t,n){"use strict";var r=n("1924"),o=n.n(r);o.a},4328:function(e,t,n){},"56d7":function(e,t,n){"use strict";n.r(t);n("d3b7"),n("e260"),n("e6cf"),n("cca6"),n("a79d");var r=n("2b0e"),o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{ref:"app",attrs:{id:"app"},on:{scroll:function(t){return t.preventDefault(),e.handleScroll(t)}}},[n("router-view")],1)},a=[],c={name:"App",methods:{handleScroll:function(e){this.$store.commit("setScrollY",e.srcElement.scrollingElement.scrollTop)}},mounted:function(){window.addEventListener("scroll",this.handleScroll)}},i=c,l=(n("5c0b"),n("2877")),s=Object(l["a"])(i,o,a,!1,null,null,null),u=s.exports,d=n("8c4f"),f=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"layout"},[n("HeaderNew"),n("router-view",{staticClass:"container-fluid"})],1)},h=[],p=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{class:e.classObj,attrs:{id:"header-wrapper"}},[n("div",{staticClass:"head-content container row"},[n("a",{staticClass:"logo",staticStyle:{color:"white","font-size":"25px"},attrs:{href:""}},[e._v("喵酷科技")]),n("ul",{staticClass:"menu-list",on:{mouseleave:function(t){e.showHeadScreen=!1}}},e._l(6,(function(t){return n("li",{staticClass:"menu-item col",on:{mouseenter:function(t){e.showHeadScreen=!0}}},[n("a",{staticClass:"txt",attrs:{href:""}},[e._v("简介")]),e._m(0,!0)])})),0)]),n("transition",{attrs:{name:"growY"}},[e.showHeadScreen?n("div",{staticClass:"head-screen"}):e._e()])],1)},m=[function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("ul",{staticClass:"sub-list"},[n("li",[e._v("公司简介")]),n("li",[e._v("愿景与使命")]),n("li",[e._v("发展历程")]),n("li",[e._v("业务架构")]),n("li",[e._v("管理团队")]),n("li",[e._v("企业文化")]),n("li",[e._v("办公地点")])])}],b={name:"Header",data:function(){return{showHeadScreen:!1}},computed:{classObj:function(){return{touming:0===this.$store.state.scroll.y,white:this.$store.state.scroll.y>0||this.showHeadScreen,hidden:this.$store.state.scroll.y>150&&"bottom"===this.$store.state.scroll.direction}}}},v=b,g=(n("c8ff"),Object(l["a"])(v,p,m,!1,null,"5a8dcfea",null)),w=g.exports,A=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"container-fluid header-wrapper",style:e.styleObj},[n("div",{staticClass:"container row",attrs:{id:"header"}},[e._m(0),n("ul",{staticClass:"menu-area row"},e._l(e.menuList,(function(t){return n("li",{key:t.path,on:{click:function(n){return e.go(t.path)}}},[e._v(e._s(t.label))])})),0)])])},y=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"logo-area"},[r("img",{attrs:{src:n("7910")}})])}],S={name:"HeaderNew",data:function(){return{menuList:[{label:"首页",path:"/"},{label:"案例",path:"/demo"},{label:"服务",path:"/service"},{label:"关于我们",path:"/about"},{label:"联系我们",path:"/contact"}]}},computed:{styleObj:function(){if(this.$store.state.scroll.y<90)return{backgroundColor:"transparent"};if(this.$store.state.scroll.y<500){var e=this.$store.state.scroll.y/300;return{backgroundColor:"rgb(55,64,147,".concat(e,")")}}return{top:"-86px"}}}},k=S,C=(n("3ef4"),Object(l["a"])(k,A,y,!1,null,"38e7adae",null)),I=C.exports,B={name:"Layout",components:{HeaderNew:I,Header:w}},O=B,j=(n("0a49"),Object(l["a"])(O,f,h,!1,null,"026c40a4",null)),J=j.exports,E=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("div",[e._v(e._s(e.$route.fullPath)+" not found")]),n("div",{on:{click:function(t){return e.go("/")}}},[e._v("回到首页")])])},K=[],L={name:"Layout404"},N=L,M=Object(l["a"])(N,E,K,!1,null,"4837d49c",null),W=M.exports;r["a"].use(d["a"]);var x=[{path:"/",component:J,redirect:"/index",children:[{path:"/index",component:function(){return n.e("chunk-0f30a2d0").then(n.bind(null,"0a0d"))}}]},{path:"/chat",component:J,redirect:"/client",children:[{path:"client",component:function(){return n.e("chunk-16d122d4").then(n.bind(null,"0ba4"))}}]},{path:"/chat",component:J,redirect:"/admin",children:[{path:"admin",component:function(){return n.e("chunk-2e0fa7ae").then(n.bind(null,"2631"))}}]},{path:"/*",component:W}],Y=new d["a"]({mode:"hash",base:"/",routes:x}),H=Y,Q=n("2f62");r["a"].use(Q["a"]);var P=new Q["a"].Store({state:{scroll:{y:0,direction:"none"}},getters:{},mutations:{setScrollY:function(e,t){e.scroll.direction=t>e.scroll.y?"bottom":"top",e.scroll.y=t}},actions:{},modules:{}}),T={routerMixin:{methods:{go:function(e){this.$router.push(e)},goto:function(e){window.open(e)}}}};n.e("chunk-76e80f2c").then(n.t.bind(null,"a0d8",7)),r["a"].config.productionTip=!1,r["a"].mixin(T.routerMixin),new r["a"]({router:H,store:P,render:function(e){return e(u)}}).$mount("#app")},"5c0b":function(e,t,n){"use strict";var r=n("9c0c"),o=n.n(r);o.a},7910:function(e,t){e.exports="data:image/png;base64,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"},"9c0c":function(e,t,n){},c8ff:function(e,t,n){"use strict";var r=n("17c9"),o=n.n(r);o.a}});
//# sourceMappingURL=app.47b0488b.js.map