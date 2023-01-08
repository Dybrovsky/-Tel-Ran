/*

$(selector)

 $(this).hide() - hides the current element

 $("p").hide() - hides all <p> elements

 $(".test").hide() - hides all elem with class "test"

 $("#test").hide() - hides the elem with id test
_____________________________

 text()
 html()
 val()
_______________________________
attr()
addClass()
removeClass()
toggleClass()

 */

$(document).ready(function () {
    $('.skillset').hide();
    // $('.skillset').show(1000);
    $('.skillset').fadeIn(5000);
    $('.projects').hide();
    $('.project-button').on('click', function () {
        // $('.projects').show();
        // $(this).next().toggle();
        $(this).next().slideToggle(1000);
        $(this).toggleClass('active');
        $(this).text('Project viewed');
    });
});