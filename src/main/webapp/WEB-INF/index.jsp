<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a, a:focus, a:hover {
	color: #fff;
}

/* Custom default button */
.btn-default, .btn-default:hover, .btn-default:focus {
	color: #333;
	text-shadow: none; /* Prevent inheritence from `body` */
	background-color: #fff;
	border: 1px solid #fff;
}

/*
 * Base structure
 */
html, body {
	height: 100%;
	background-color: #0686bd;
}

body {
	color: #fff;
	text-align: center;
	text-shadow: 0 1px 3px rgba(0, 0, 0, .5);
}

/* Extra markup and styles for table-esque vertical and horizontal centering */
.site-wrapper {
	display: table;
	width: 100%;
	height: 600px;
	background-color: #0686bd;
	/*height: 100%; */
	/*min-height: 100%;*/
}

.site-wrapper-inner {
	display: table-cell;
	vertical-align: top;
}

.cover-container {
	margin-right: auto;
	margin-left: auto;
}

/* Padding for spacing */
.inner {
	padding: 30px;
}

.cover {
	padding: 0 20px;
}

.cover .btn-lg {
	padding: 10px 20px;
	font-weight: bold;
}

/*
 * Affix and center
 */
@media ( min-width : 768px) {
	/* Pull out the header and footer */
	.masthead {
		position: fixed;
		top: 0;
	}
	/* Start the vertical centering */
	.site-wrapper-inner {
		vertical-align: middle;
	}
}
</style>
</head>
<body>

	<div class="site-wrapper">

		<div class="site-wrapper-inner">

			<div class="container">

				<div class="inner cover">
					<h1>
						<a href="/addProduct"> Add Product </a>
					</h1>
				</div>

			</div>

		</div>

	</div>
</body>
</html>