let input = document.querySelector('#item');

$(document).ready(function () {
    $('#addItem').on('click', function () {
        $('#todoList').append($('<li>').html(input.value).append($('<button class="newItem">').html('X')));
    });
    $(document).on('click', '.newItem', function () {
        $(this).parent().remove();
    });
});


