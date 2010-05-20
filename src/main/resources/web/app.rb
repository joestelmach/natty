require 'rubygems'
require 'sinatra'

get '/' do
  erb :index
end

before do
  @url = request.env['REQUEST_URI']
end

post '/parse' do
  puts 'parsing'

  # invoke the parser with the given input
  output = ''
  IO.popen("java -jar parser.jar \"#{params[:value]}\"") do |parser|
    parser.each{|line| output << line} 
  end
  output = "{\"errors\":\"#{output.strip()}\"}" unless ((output =~ /^\{/) == 0)

  content_type :json
  output
end

get '/:view' do
  erb params[:view].to_sym
end

